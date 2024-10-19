import java.util.Arrays;

public class PrintInfo {
    public static void main(String[] args) {
        int[] binaryValues = {1, 1, 0, 1, 1, 0, 0, 1};
        int[] emptyArray = new int[100];
        int[] filledArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] withoutDiagonal = new int[5][5];

        printThreeWords();
        checkSumSign();
        printColor();
        compairNumbers();
        System.out.println(checkSumRange(4,8));
        checkNumberSign(4);
        System.out.println(checkSign(-1));
        printString("hello", 3);
        System.out.println(checkYear(2024));
        changeValue(binaryValues);
        fillArray(emptyArray);
        changeArrayValues(filledArray);
        createDiagonal(withoutDiagonal);

        for (int x: createArray(4, 1))
            System.out.print(x + " ");
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(){
        int a = 5, b = 10;
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor(){
        int value = 50;

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    public static void compairNumbers(){
        int a = 3, b = 4;

        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public static boolean checkSumRange(int x, int y){
        return x + y >= 10 && x + y <= 20;
    }

    public static void checkNumberSign(int x){
        if (x >= 0)
            System.out.println("Число " + x + " положительное");
        else
            System.out.println("Число " + x + " отрицательное");
    }

    public static boolean checkSign(int x){
        return x < 0;
    }

    public static void printString(String s, int x){
        while (x > 0){
            System.out.println(s);
            x--;
        }
    }

    public static boolean checkYear(int x){
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }

    public static void changeValue(int[] x){
        System.out.println("Исходный массив " + Arrays.toString(x));

        for (int i = 0; i < x.length; i++){
            if (x[i] == 0)
                x[i] = 1;
            else if (x[i] == 1)
                x[i] = 0;
        }

        System.out.println("Измененный массив " + Arrays.toString(x));
    }

    public static void fillArray(int[] x){
        for (int i = 0; i < x.length; i++)
            x[i] = i + 1;

        System.out.println("Заполненный массив " + Arrays.toString(x));
    }

    public static void changeArrayValues(int[] x){
        System.out.println("Исходный массив " + Arrays.toString(x));

        for (int i = 0; i < x.length; i++){
            if (x[i] < 6)
                x[i] *= 2;
        }

        System.out.println("Изменненный массив " + Arrays.toString(x));
    }

    public static void createDiagonal(int[][] x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                if (i == j)
                    x[i][j] = 1;

                x[j][x.length - j - 1] = 1;

                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue){
        int[] x = new int[len];

        for (int i = 0; i < x.length; i++)
            x[i] = initialValue;

        return x;
    }
}