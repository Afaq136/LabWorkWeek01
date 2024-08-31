package org.example;

//Create a main method in either class or a separate class.
//Instantiate a Vehicle object and a Car object.
//Test all methods to make sure they work as expected.

public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle myVehicle = new Vehicle(4, "Red", 2.0f, "Petrol");

        // Create a Car object
        Car myCar = new Car(4, "Blue", 1.8f, "Diesel", "Toyota");

        // Test Vehicle
        System.out.println("Vehicle Info:");
        System.out.println("Number of Wheels: " + myVehicle.getNumberOfWheels());
        System.out.println("Color: " + myVehicle.getColor());
        System.out.println("Engine Size: " + myVehicle.getEngineSize());
        System.out.println("Fuel Type: " + myVehicle.getFuelType());

        // Test Car methods
        System.out.println("\nCar Info:");
        myCar.displayInfo();
        myCar.honk();
    }


}