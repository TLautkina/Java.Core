package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project;

public class WeatherData {
    private final String city;
    private final String date;
    private final String dayText;
    private final String nightText;
    private final Double minTemperature;
    private final Double maxTemperature;


    public WeatherData(String city, String date, String dayText, String nightText, Double minTemperature, Double maxTemperature) {
        this.city = city;
        this.date = date;
        this.dayText = dayText;
        this.nightText = nightText;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public String getDayText() {
        return dayText;
    }

    public String getNightText() {
        return nightText;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", dayText='" + dayText + '\'' +
                ", nightText='" + nightText + '\'' +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                '}';
    }
}