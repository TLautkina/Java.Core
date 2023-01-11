package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project;

import ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.enums.Languages;
public final class Application {

    private static Application INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "vyYDRAGpczJRODGxcdqqiVGQHNtXDWfp";
    private final Languages LANGUAGE = Languages.ENGLISH;
    private final String DB_FILENAME = "sqliteDBData.db";

    private Application() {
    }

        public static Application getInstance() {
        if(INSTANCE == null) {
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

    public String getDbFileName() {
        return DB_FILENAME;
    }
}