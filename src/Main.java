public class Main {
    public static void main(String[] args) {
        String[][] arrayCorrectData = {
                {"4", "5", "7", "3"},
                {"2", "1", "6", "0"},
                {"5", "1", "4", "3"},
                {"4", "5", "7", "3"}
        };

        String[][] arrayIncorrectSize = {
                {"4", "5", "7", "3", "3"},
                {"2", "1", "6", "0", "5"},
                {"5", "1", "4", "3", "2"},
                {"4", "5", "7", "3", "4"}
        };

        String[][] arrayIncorrectData = {
                {"4", "5", "7", "3"},
                {"2", "qwerty", "6", "0"},
                {"5", "1", "4", "3"},
                {"4", "5", "7", "3"}
        };

        try {
            getArray(arrayCorrectData);
            getArray(arrayIncorrectSize);
            getArray(arrayIncorrectData);
        } catch (MyArraySizeException | MyArrayDataExcption e) {
            e.printStackTrace();
        }
    }

    public static void getArray(String[][] array) throws MyArraySizeException, MyArrayDataExcption {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4)
                throw new MyArraySizeException("Array is not 4x4");

            for (int j = 0; j < array[i].length; j++) {
                try {
                    count += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExcption("Incorrect data in " + i + "x" + j);
                }
            }
        }

        System.out.println("result: " + count);
    }
}