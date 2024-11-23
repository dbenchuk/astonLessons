import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFactorial {
    @DataProvider(name = "dataList")
    public static Object[][] dataList() {
        return new Object[][]{
                {-2, 2},
                {-1, 1},
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24}
        };
    }

    @Test(dataProvider = "dataList")
    public void test(Integer value, Integer result) {
        if (value < 0)
            throw new SkipException("incorrect data");
        Assert.assertEquals(result, Factorial.factorial(value));
    }
}