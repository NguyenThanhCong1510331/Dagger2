package com.hariofspades.dagger2advanced.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Dob {
	@SerializedName("date")
    @Expose
	private String date;
	@SerializedName("age")
    @Expose
	private Integer age;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setAge(Integer age){
		this.age = age;
	}

	public Integer getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return new ToStringBuilder(this).append("date", date).append("age", age).toString();
	}
}
