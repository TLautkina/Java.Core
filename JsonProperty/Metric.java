package ru.geekbrains.courses.javacore.LautkinaT.Lesson8.HW.Project.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Metric {
    @JsonProperty(value = "Unit")
    private String mUnit;
    @JsonProperty(value = "UnitType")
    private Long mUnitType;
    @JsonProperty(value = "Value")
    private Double mValue;

    public String getUnit() {
        return mUnit;
    }

    public void setUnit(String unit) {
        mUnit = unit;
    }

    public Long getUnitType() {
        return mUnitType;
    }

    public void setUnitType(Long unitType) {
        mUnitType = unitType;
    }

    public Double getValue() {
        return mValue;
    }

    public void setValue(Double value) {
        mValue = value;
    }

}