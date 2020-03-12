package com.grsu.model.domain;

import com.grsu.io.InputOutput;

public class Weather extends Predict implements Forecast {
    private String predict;
    private String period;
    private int price = 2;

    public Weather(PeriodType periodType, InputOutput io) {
        period = new Period(io).createPeriod(periodType);
        predict = new Predict().createPredict("src/main/java/com/grsu/predictsText/Horoscope.txt");
    }

    public String getPeriod() {
        return period;
    }

    public String getPredict() {
        return predict;
    }

    public int getPrice() {
        return price;
    }
}