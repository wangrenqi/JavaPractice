package PublishSubscribeMode.Demo2;

/**
 * Created by Mccree on 20/12/2016.
 */
public class Main2 {


    public static void main(String[] args) {
        TemperatureObserver temperatureObserver = new TemperatureObserver();
        BoildObserver boildObserver1 = new BoildObserver("shutdown !");
        BoildObserver boildObserver2 = new BoildObserver("keep...");
        Water w = new Water(temperatureObserver);
        w.addObserver(boildObserver1);
        w.addObserver(boildObserver2);

        w.change(45);
        w.change(80);
        w.change(100);

    }

}
