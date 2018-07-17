package com.hariofspades.dagger2advanced.models;

public class ResultsItem{
	private String gender;
	private Name name;
	private Picture picture;

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setPicture(Picture picture){
		this.picture = picture;
	}

	public Picture getPicture(){
		return picture;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"gender = '" + gender + '\'' + 
			",name = '" + name + '\'' + 
			",picture = '" + picture + '\'' + 
			"}";
		}
}
