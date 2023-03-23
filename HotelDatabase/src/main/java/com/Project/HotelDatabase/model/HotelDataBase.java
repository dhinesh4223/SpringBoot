package com.Project.HotelDatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class HotelDataBase {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int itemId;
private String foodName;
private double rate;
public HotelDataBase(String foodName, double rate) {
	super();
	this.foodName = foodName;
	this.rate = rate;
}
public HotelDataBase() {
	
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getFoodName() {
	return foodName;
}
public void setFoodName(String foodName) {
	this.foodName = foodName;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}

}
