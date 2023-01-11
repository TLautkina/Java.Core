package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project;

import ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    void getWeather(Periods period) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}