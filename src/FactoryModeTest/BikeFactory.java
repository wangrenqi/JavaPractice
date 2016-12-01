package FactoryModeTest;

/**
 * Created by Mccree on 01/12/2016.
 */
public class BikeFactory {

    public static Bike getBike(String type) {
        if (type.equals("MeridaBike")) {
            return new MeridaBike();
        }
        if (type.equals("GiantBike")) {
            return new GiantBike();
        }
        return null;
    }
}
