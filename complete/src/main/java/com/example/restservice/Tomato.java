package com.example.restservice;

public class Tomato {

    //private final long id;
    //private final String content;
    private final float humidity;
    private final long temperature;
    private final long illuminance;
    private final String lastWateringTime;
    private final String imageUrl;
    private final long yield_thisYear;
    private final long yield_previousYear;

    public Tomato(
        //long id,
        //String content
        float humidity,
        long temperature,
        long illuminance,
        String lastWateringTime,
        String imageUrl,
        long yield_thisYear,
        long yield_previousYear
    ) {
        //this.id = id;
        //this.content = content;
        this.humidity = humidity;
        this.temperature = temperature;
        this.illuminance = illuminance;
        this.lastWateringTime = lastWateringTime;
        this.imageUrl = imageUrl;
        this.yield_thisYear = yield_thisYear;
        this.yield_previousYear = yield_previousYear;
    }

    //public long getId() {return id;}
    //public String getContent() {return content;}
    public float getHumidity() {return humidity;}
    public long getTemperature() {return temperature;}
    public long getIlluminance() {return illuminance;}
    public String getLastWateringTime() {return lastWateringTime;}
    public String getImageUrl() {return imageUrl;}
    public long getYield_thisYear() {return yield_thisYear;}
    public long getYield_previousYear() {return yield_previousYear;}
}
