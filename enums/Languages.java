package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.enums;

public enum Languages {
    ENGLISH("en-us", "English"),
    RUSSIAN("ru-ru", "Русский");

    private final String code;
    private final String title;

    Languages(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
}