
package com.hariofspades.dagger2advanced.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Id {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private Object value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("value", value).toString();
    }

}
