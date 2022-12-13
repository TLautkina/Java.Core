package ru.geekbrains.courses.javacore.LautkinaT.Lesson2.HW;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(int mtrxNumber) {
        super("Матрица должна быть 4*4 и содержать 16 элементов. В вашей " + mtrxNumber + " элементов'.");
    }

    public MyArraySizeException() {
        super("Размер матрицы не 4*4");
    }
}


