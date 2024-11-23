import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestFactorial {
    @DisplayName("factorialTest")
    @ParameterizedTest
    @CsvSource(value = {
            "-2,2",
            "-1,1",
            "0,1",
            "1,1",
            "2,2",
            "3,6",
            "4,24"
    })
    public void simpleTest(int value, int result) {
        Assumptions.assumeTrue(value >= 0);
        Assertions.assertEquals(result, Factorial.factorial(value));
    }
}