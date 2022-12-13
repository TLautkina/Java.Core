package ru.geekbrains.courses.javacore.LautkinaT.Lesson2.HW;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int col, String str, Throwable cause) {
        super("По индексу [" + row + "," + col +"] " + "обнаружено " +
                "недопустимое значение: " + str, cause);
    }
}