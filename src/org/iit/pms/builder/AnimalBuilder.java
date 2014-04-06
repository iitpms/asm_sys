package org.iit.pms.builder;

import org.iit.pms.abstractions.Animal;
import org.iit.pms.helper.AnimalType;

public class AnimalBuilder {
	public String name;
	public int age; 
	public AnimalType type;
	public float price;
	public boolean isAvailable;
	public boolean isSick;
	public boolean isDiscountApplicable;
	
	
	
	public AnimalBuilder(String name, int age, AnimalType type, float price, boolean isAvailable, boolean isSick, boolean isDiscountApplicable){
		this.name = name;
		this.age = age;
		this.type = type;
		this.price = price;
		this.isAvailable = isAvailable;
		this.isSick = isSick;
		this.isDiscountApplicable = isDiscountApplicable;
	}
	
	public Animal build(){
		return new Animal(this);
	}
	
}
