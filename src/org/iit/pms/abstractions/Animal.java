package org.iit.pms.abstractions;

import org.iit.pms.helper.AnimalType;

public abstract class Animal {
	public String name;
	public int age; 
	public AnimalType type;
	public float price;
	public boolean isAvailable;
	public boolean isSick;
	public boolean isDiscountApplicable;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected AnimalType getType() {
		return type;
	}
	protected void setType(AnimalType type) {
		this.type = type;
	}
	protected float getPrice() {
		return price;
	}
	protected void setPrice(float price) {
		this.price = price;
	}
	protected boolean isAvailable() {
		return isAvailable;
	}
	protected void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	protected boolean isSick() {
		return isSick;
	}
	protected void setSick(boolean isSick) {
		this.isSick = isSick;
	}
	protected boolean isDiscountApplicable() {
		return isDiscountApplicable;
	}
	protected void setDiscountApplicable(boolean isDiscountApplicable) {
		this.isDiscountApplicable = isDiscountApplicable;
	}
	
} 
