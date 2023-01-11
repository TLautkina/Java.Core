package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.Repository;


import ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.WeatherData;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws SQLException;

    void closeConnection();
}