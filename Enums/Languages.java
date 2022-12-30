package ru.geekbrains.courses.javacore.LautkinaT.Lesson7.HW.Project.Enums;

public enum Languages {
    ENGLISH("en-us", "English"),
    RUSSIAN("ru-ru", "Русский");

    private String code;
    private String title;

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