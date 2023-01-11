package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project;

import ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.Repository.DatabaseRepository;
import ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.Repository.DatabaseRepositorySQLiteImpl;
import ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.enums.Functionality;
import ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    WeatherProvider weatherProvider = new AccuWeatherProvider();
    Map<Integer, Functionality> variantResult = new HashMap();
    DatabaseRepository repository = new DatabaseRepositorySQLiteImpl();

    public Controller() {
        variantResult.put(1, Functionality.GET_CURRENT_WEATHER);
        variantResult.put(2, Functionality.GET_WEATHER_IN_NEXT_5_DAYS);
        variantResult.put(3, Functionality.GET_WEATHER_DATA_FROM_DB);
        variantResult.put(4, Functionality.EXIT);
    }

    public void onUserInput(String input) throws IOException, SQLException {
        int command = Integer.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for command-key " + command);
        }

        switch (variantResult.get(command)) {
            case GET_CURRENT_WEATHER:
                getCurrentWeather();
                break;
            case GET_WEATHER_IN_NEXT_5_DAYS:
                getWeatherIn5Days();
                break;
            case GET_WEATHER_DATA_FROM_DB:
                getWeatherFromDB();
                break;
            case EXIT:
                exitApp();
                break;
        }
    }

    public void exitApp() throws IOException, SQLException {
        System.out.println("Exit");
        repository.closeConnection();
        System.exit(0);
    }

    public void getCurrentWeather() throws IOException, SQLException {
        weatherProvider.getWeather(Periods.NOW);
    }

    public void getWeatherIn5Days() throws IOException, SQLException {
        weatherProvider.getWeather(Periods.FIVE_DAYS);
    }

    public void getWeatherFromDB() throws IOException, SQLException {
        weatherProvider.getWeather(Periods.BASE);
    }
}