package ru.geekbrains.courses.javacore.LautkinaT.Lesson6.HW;

/*
1. С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
2. Подобрать источник самостоятельно. Можно использовать api accuweather, порядок следующий:
зарегистрироваться, зарегистрировать тестовое приложение для получения api ключа,
найдите нужный endpoint и изучите документацию.
Бесплатный тарифный план предполагает получение погоды не более чем на 5 дней вперед
(этого достаточно для выполнения д/з).
 */
import okhttp3.*;

import java.io.IOException;

public class Main {
    public static final String API_KEY_PARAM = "apikey";
    public static final String API_KEY = "YnJbWaE1DglFTprqP42ezoJWBGWaKGAh";
    public static final String CURRENT_TOWN_KEY = "295212";
    public static final String WEATHER_URL = "https://dataservice.accuweather.com/forecasts/v1/daily/5day/" + CURRENT_TOWN_KEY;

    public static void main(String[] args) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(WEATHER_URL).newBuilder();
        urlBuilder.addQueryParameter(API_KEY_PARAM, API_KEY);

        HttpUrl httpUrl = urlBuilder.build();

        Request.Builder requestBuilder = new Request.Builder();

        Request request = requestBuilder
                .get()
                .url(httpUrl)
                .build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        Response response = call.execute();

        System.out.println(response.body().string());
    }
}