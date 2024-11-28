import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FormTest {
    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void loadMainPage() {
        driver.get("https://www.mts.by/");

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.className("pay__wrapper")));

        if (driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div")).isDisplayed())
            driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    }

    @AfterAll
    public static void quitDriver() {
        driver.quit();
    }

    @Test
    public void paymentFormNameTest() {
        Assertions.assertEquals("Онлайн пополнение без комиссии", driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")).getAccessibleName());
    }

    @Test
    public void displayedLogosTest() {
        List<WebElement> logo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul")).findElements(By.tagName("img"));
        Assertions.assertTrue(logo.size() == 5);
    }

    @Test
    public void buttonTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys("297777777");

        driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys("10");

        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();

        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));

        driver.findElement(By.xpath("/html/body/app-root/div/div/app-header/header/div/app-back-navigation/div/div/svg-icon")).click();

        driver.switchTo().defaultContent();
    }

    @Test
    public void linkTest() {
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")).click();
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }
}