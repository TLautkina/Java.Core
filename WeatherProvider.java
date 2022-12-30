package ru.geekbrains.courses.javacore.LautkinaT.Lesson7.HW.Project;

import ru.geekbrains.courses.javacore.LautkinaT.Lesson7.HW.Project.Enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}