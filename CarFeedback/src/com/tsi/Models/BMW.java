package com.example.Models;

import java.util.HashMap;

public class BMW  extends Car{

	public HashMap getCarModels(){
		
		HashMap map = new HashMap<String, String>();
		map.put("audi", "A6");
		map.put("audi", "A4");
		map.put("audi", "A5");
		map.put("audi", "A7");
		map.put("audi", "A8");
		map.put("audi", "Q3");
		map.put("audi", "Q5");
		map.put("audi", "Q7");
		map.put("audi", "TT");
		return map;
		}
		
		public HashMap getCarEngines(String model, int year)
		{
			HashMap map = new HashMap<String, String>();
			map.put("A6", "3.0TDI");
			map.put("A6", "2.7TT");
			map.put("A6", "4.2");
			
			map.put("A4", "1.8T");
			map.put("A4", "2.0");
			map.put("A4", "1.9TDI");
			
			map.put("A5", "A5");
			map.put("A7", "A7");
			map.put("A8", "A8");
			map.put("Q3", "Q3");
			map.put("Q5", "Q5");
			map.put("Q7", "Q7");
			map.put("TT", "TT");
			return map;
			
		}
}
