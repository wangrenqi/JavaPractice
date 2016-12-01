package FactoryModeTest;

/**
 * Created by Mccree on 01/12/2016.
 */
public class Main {

    private static BikeFactory factory = new BikeFactory();

    public static void main(String[] args) {

        Bike bike3 = factory.getBike("MeridaBike");
        bike3.ride();

        Bike bike2 = factory.getBike("GiantBike");
        bike2.ride();

    }
}
