package com.example.Models;

import java.util.ArrayList;

public  class Car {
	
	private static final String CarBrandsEnum = null;
	private String brandName;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public boolean isAwd() {
		return awd;
	}
	public void setAwd(boolean awd) {
		this.awd = awd;
	}
	private String modelName;
	private int year;
	private String engine;
	private boolean awd;
	private String feedback;
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

 	public ArrayList<String > getAllBrands()
 	{
 		ArrayList<String> list = new ArrayList<String>();
 		list.add("Audi");
 		list.add("BMW");
 		list.add("Lexus");
 		list.add("Mercedes");
 		list.add("VW");
		return list;
 		
 	}
}
