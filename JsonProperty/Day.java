package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Day {

    @JsonProperty(value = "HasPrecipitation")
    private Boolean hasPrecipitation;

    @JsonProperty(value = "Icon")
    private Long icon;

    @JsonProperty(value = "IconPhrase")
    private String iconPhrase;

    @Override
    public String toString() {
        return "Day{" +
                "Icon=" + icon +
                ", IconPhrase='" + iconPhrase + '\'' +
                ", HasPrecipitation=" + hasPrecipitation + '\'' +
                '}';
    }

}