public class Factorial {
    public static int factorial(int x) {
        int result = 1;

        for (int i = x; i > 0; i--) {
            result *= i;
        }

        return result;
    }
}