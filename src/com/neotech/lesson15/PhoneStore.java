package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		
	
		Phone apple = new Phone();
		// instantiating or creating an object from phone class
		
		apple.brand = "Iphone";
		apple.model = "16 Pro Max";
		apple.color = "Blue";
		apple.price = 1500;
		
		apple.call();
		apple.text();
		apple.navigate();
		apple.camera();
		apple.calculator();
		
		System.out.println("-------------");
		
		
		Phone android = new Phone();
		
		android.brand = "Samsung";
		android.model = "S24";
		android.color = "Black";
		android.price = 1300;
		
		android.call();
		android.text();
		android.navigate();
		android.camera();
		android.calculator();
		
		System.out.println("------------");
		
		
		Phone nokia = new Phone();
		
		nokia.brand = "Nokia";
		nokia.model = "3310";
		nokia.color = "Grey";
		nokia.price = 200;
		
		
		nokia.call();
		nokia.text();
		nokia.calculator();
		nokia.camera();
		
		
	
		
		
		
	}	
		
	}


