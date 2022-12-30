package ru.geekbrains.courses.javacore.LautkinaT.Lesson7.HW.Project;

import ru.geekbrains.courses.javacore.LautkinaT.Lesson7.HW.Project.Enums.Languages;

public final class Application {

    private static Application INSTANCE;
    private final String API_KEY = "Gbi64A7YeWXJKGIe7MZ0jNGrD2EAKxHD";
    private final Languages LANGUAGE = Languages.ENGLISH;
    private String selectedCity = null;

    private Application() {
    }

    public static Application getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Application();
        }
        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }

    public Languages getLanguage() {
        return this.LANGUAGE;
    }
}