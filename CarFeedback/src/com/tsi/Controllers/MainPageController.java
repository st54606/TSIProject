package com.example.Controls;

import com.example.Models.Car;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Layout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.VerticalLayout;

public class MainPageController {

	
	public Layout getMainPageLayout()
	{
		Car car = new Car();
		ComboBox brandCombo = new ComboBox("Brand", car.getAllBrands());
		AbsoluteLayout absLayaout = new AbsoluteLayout();
		VerticalLayout vertLayout = new VerticalLayout();
		VerticalLayout vertLayout1 = new VerticalLayout();
		HorizontalLayout horLayout = new HorizontalLayout();
		absLayaout.addComponent(vertLayout);
		vertLayout.addComponent(horLayout);
		horLayout.addComponent(brandCombo)
		brandCombo.valueChange(new ValueChangeEvent() {
			
			@Override
			public Property getProperty() {
				
				String value = brandCombo.getValue();
				return null;
			}
		});
		horLayout.addComponent(modelSelect);
		return null;
		
	}
}
