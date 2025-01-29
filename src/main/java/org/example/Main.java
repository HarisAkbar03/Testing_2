package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
    public class Vehicle
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
    public class Car extends Vehicle
    {
        String brand;
    }
}