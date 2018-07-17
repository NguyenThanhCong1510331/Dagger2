package com.hariofspades.dagger2advanced.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by TamBPM on 7/17/2018.
 */

public class Coordinates {
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public void setLatitude(String latitude){
        this.latitude = latitude;
    }

    public String getLatitude(){
        return latitude;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }

    public String getLongitude(){
        return longitude;
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this).append("latitude", latitude).append("longitude", longitude).toString();
    }
}
