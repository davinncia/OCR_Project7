package com.example.go4lunchjava.places_api.pojo.details.hours;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.type.TimeOfDay;

public class Open {

    @SerializedName("day")
    @Expose
    private int day;

    @SerializedName("time")
    @Expose
    private String time;

    //Constructor (for Testing)
    public Open(int day, String time) {
        this.day = day;
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
}
