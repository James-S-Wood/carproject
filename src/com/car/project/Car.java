package com.car.project;

public class Car

{
    String brand;
    int mileage;
    double price;

    public static void main(String[] args)
    
    {
        Car car1 = new Car();

        car1.brand = "Nissan";
        car1.mileage = 7000;
        car1.price = 6500.35;

        System.out.print(car1.brand + ", ");
        System.out.print(car1.mileage + ", ");
        System.out.print(car1.price);


    }
}
