package ru.geekbrains.courses.javacore.LautkinaT.Lesson2.HW;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод,
обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */

public class Main {
    public static void main(String[] args) {
        //"Правильный" массив 4х4
        String[][] matrix_4x4 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        test(matrix_4x4);

        String[][] matrix_3x4 = {
                {"1", "2", "3", "4"},
                {"5", "6.0", "7", "8"},
                {"9", "10", "11", "12"}
        };
        test(matrix_3x4);

        String[][] matrix_4x3 = {
                {"1", "2", "3"},
                {"4", "6", "7"},
                {"8", "9", "10"},
                {"13", "14", "16"}
        };
        test(matrix_4x3);

        String[][] matrix_Empty = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {},
                {"13", "14", "15", "16"}
        };
        test(matrix_Empty);

        String[][] matrix_Text = {
                {"1", "2", "3", "4"},
                {"5", "6TEST", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        test(matrix_Text);
    }

    static int matrix_4x4ToInt(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        int rows = strings.length;
        if (rows != 4)
            throw new MyArraySizeException();
        int columns = 4;
        int matrixNumber = 0;
        for (int i = 0; i < rows; i++) {
            columns = strings[i].length;
            matrixNumber += columns;
        }
        if (matrixNumber != 16)
            throw new MyArraySizeException(matrixNumber);

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String str = strings[i][j];
                int num;

                try {
                    num = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, str, e);
                }

                sum += num;
            }
        }
        return sum;
    }
    static void test(String[][] strMat) {
        try {
            System.out.println("Сумма всех значений матрицы: " + matrix_4x4ToInt(strMat));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Попытка повысить шанс вывода сообщений в правильном порядке
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}

