package PublishSubscribeMode.Demo2;

/**
 * Created by Mccree on 21/12/2016.
 */
public class TemperatureObserver implements Observer {
    @Override
    public void update(Observable observable) {
        Water w = (Water) observable;
        System.out.println("temperate : " + w.getTemperature());
        System.out.println("statue : " + w.getStatus());
        System.out.println("TemperatureObserver observing ......");

    }
}
