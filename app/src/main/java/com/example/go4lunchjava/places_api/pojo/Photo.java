package com.example.go4lunchjava.places_api.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Photo {

    @SerializedName("height")
    @Expose
    public Integer height;
    @SerializedName("html_attributions")
    @Expose
    public List<String> htmlAttributions = null;
    @SerializedName("photo_reference")
    @Expose
    public String photoReference;
    @SerializedName("width")
    @Expose
    public Integer width;
}
