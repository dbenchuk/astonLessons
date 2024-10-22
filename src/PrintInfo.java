import java.util.Arrays;

public class PrintInfo {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compairNumbers();
        System.out.println(checkSumRange(4,8));
        checkNumberSign(4);
        System.out.println(checkSign(-1));
        printString("hello", 3);
        System.out.println(checkYear(2024));
        changeValue();
        fillArray();
        changeArrayValues();
        createDiagonal();
        System.out.println(Arrays.toString(createArray(4, 1)));
    }

    public static void printThreeWords() {
        String orange = "Orange";
        String banana = "Banana";
        String apple = "Apple";

        System.out.println(orange + "\n" + banana + "\n" + apple);
    }

    public static void checkSumSign() {
        int a = 5, b = 10;

        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 50;

        if (value <= 0)
            System.out.println("Красный");
        else if
        (value <= 100) System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    public static void compairNumbers() {
        int a = 3, b = 4;

        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static boolean checkSumRange(int x, int y){
        return x + y >= 10 && x + y <= 20;
    }

    public static void checkNumberSign(int x) {
        System.out.println(x >= 0 ? "Число " + x + " положительное" : "Число " + x + " отрицательное");
    }

    public static boolean checkSign(int x) {
        return x < 0;
    }

    public static void printString(String s, int x) {
        while (x > 0) {
            System.out.println(s);
            x--;
        }
    }

    public static boolean checkYear(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }

    public static void changeValue() {
        int[] binaryValues = {1, 1, 0, 1, 1, 0, 0, 1};

        System.out.println("Исходный массив " + Arrays.toString(binaryValues));

        for (int i = 0; i < binaryValues.length; i++) {
            if (binaryValues[i] == 0)
                binaryValues[i] = 1;
            else if (binaryValues[i] == 1)
                binaryValues[i] = 0;
        }

        System.out.println("Измененный массив " + Arrays.toString(binaryValues));
    }

    public static void fillArray() {
        int[] emptyArray = new int[100];

        for (int i = 0; i < emptyArray.length; i++)
            emptyArray[i] = i + 1;

        System.out.println("Заполненный массив " + Arrays.toString(emptyArray));
    }

    public static void changeArrayValues() {
        int[] filledArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив " + Arrays.toString(filledArray));

        for (int i = 0; i < filledArray.length; i++) {
            if (filledArray[i] < 6)
                filledArray[i] *= 2;
        }

        System.out.println("Изменненный массив " + Arrays.toString(filledArray));
    }

    public static void createDiagonal() {
        int[][] withoutDiagonal = new int[5][5];

        for (int i = 0; i < withoutDiagonal.length; i++) {
            for (int j = 0; j < withoutDiagonal.length; j++) {
                if (i == j)
                    withoutDiagonal[i][j] = 1;

                withoutDiagonal[j][withoutDiagonal.length - j - 1] = 1;

                System.out.print(withoutDiagonal[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] x = new int[len];

        for (int i = 0; i < x.length; i++)
            x[i] = initialValue;

        return x;
    }
}