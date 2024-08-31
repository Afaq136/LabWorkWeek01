package org.example;
//Add Additional Methods in Car:
//
//Create a method named honk that prints "Honk, honk!"
//Create a method named displayInfo that prints all the attributes (including the inherited ones).


public class Car extends Vehicle {

    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType); // Call the constructor of Vehicle
        this.brand = brand;
    }



    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public static void honk(){
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Number of Wheels is : " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Brand: " + getBrand());
    }






}
