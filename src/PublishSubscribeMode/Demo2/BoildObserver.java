package PublishSubscribeMode.Demo2;

/**
 * Created by Mccree on 21/12/2016.
 */
public class BoildObserver implements Observer {
    String dosomething;

    BoildObserver(String dosomething) {
        this.dosomething = dosomething;
    }

    @Override
    public void update(Observable observable) {

        Water w = (Water) observable;
        if (w.getTemperature() >= 100) {
            System.out.println("statue : " + w.getStatus());
            System.out.println("BoiledObserver : " + dosomething);

        }
    }
}
