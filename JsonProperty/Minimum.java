package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Minimum {

    @JsonProperty(value = "Unit")
    private String unit;

    @JsonProperty(value = "UnitType")
    private Long unitType;

    @JsonProperty(value = "Value")
    private Double value;

    @Override
    public String toString() {
        return "Minimum{" +
                "Unit='" + unit + '\'' +
                ", UnitType=" + unitType +
                ", Value=" + value +
                '}';
    }

}
