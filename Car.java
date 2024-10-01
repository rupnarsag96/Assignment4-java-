/*Write a program that has variables to store Car data like; 
CarModel, CarName, CarPrice and CarOwner. The program 
should include functions to assign user defined values to the above 
mentioned variable and a display function to show the values. Write
 a main that calls these functions. Now write another runner class that
 declares three Car objects and displays the data of all three.*/

package assignment4;

public class Car {
	private String carModel;
	private String carName;
	private double carPrice;
	private String carOwner;

	public void setCarData(String model, String name, double price, String owner) {
		this.carModel = model;
		this.carName = name;
		this.carPrice = price;
		this.carOwner = owner;
	}

	public void displayCarData() {
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Name: " + carName);
		System.out.println("Car Price: $" + carPrice);
		System.out.println("Car Owner: " + carOwner);
		System.out.println();
	}

}