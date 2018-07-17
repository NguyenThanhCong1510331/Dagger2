package com.hariofspades.dagger2advanced.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by TamBPM on 7/17/2018.
 */

public class Timezone {
    @SerializedName("offset")
    @Expose
    private String offset;
    @SerializedName("description")
    @Expose
    private String description;

    public void setOffset(String offset){
        this.offset = offset;
    }

    public String getOffset(){
        return offset;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return new ToStringBuilder(this).append("offset", offset).append("description", description).toString();
    }
}
