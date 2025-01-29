package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.printinfo();
    }
    public static class Vehicle
    {
        int numofwheels;
        String color;
        float enginesize;
        String fueltype;

        Vehicle()
        {
            numofwheels =4;
            color = "black";
            enginesize = 2.5F;
            fueltype = "Gas";

        }

        float setenginesize(float esize)
        {
            enginesize = esize;
            return esize;
        }
        String setcolor(String scolor)
        {
            color = scolor;
            return color;
        }
        String setfuel(String ffuel)
        {
            fueltype = ffuel;
            return fueltype;
        }
        int setnumofwheels(int wheels)
        {
            numofwheels = wheels;
            return numofwheels;
        }
    }
    public static class Car extends Vehicle
    {
        String brand;

        public void honk()
        {
            System.out.println("Honk,Honk!");
        }
        public void printinfo()
        {
            Vehicle v1 = new Vehicle();
            System.out.println("The color of the Car is "+ v1.color);
            System.out.println("The Engine Size of the Car is " +v1.enginesize);
            System.out.println("The Fuel Type of the Car is " + v1.fueltype);
            System.out.println("Number of Wheels of the Car is " + v1.numofwheels);
        }

    }
}