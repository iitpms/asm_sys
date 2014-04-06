package org.iit.pms.abstractions;

import org.iit.pms.builder.AnimalBuilder;
import org.iit.pms.helper.AnimalType;

public class Animal {
	public String name;
	public int age; 
	public AnimalType type;
	public float price;
	public boolean isAvailable;
	public boolean isSick;
	public boolean isDiscountApplicable;
	
	public Animal(AnimalBuilder animalBuilder){
		this.name = animalBuilder.name;
		this.age = animalBuilder.age;
		this.type = animalBuilder.type;
		this.price = animalBuilder.price;
		this.isAvailable = animalBuilder.isAvailable;
		this.isSick = animalBuilder.isSick;
		this.isDiscountApplicable = animalBuilder.isDiscountApplicable;
	}
	
} 
