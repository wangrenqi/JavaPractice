package PublishSubscribeMode.Demo2;

/**
 * Created by Mccree on 21/12/2016.
 */
public class Water extends Observable {
    private double temperature;
    private String status;

    public Water() {
        super();
        this.temperature = 0;
        this.status = "cold water!";
    }

    public Water(Observer observer) {
        observers.add(observer);
    }

    public double getTemperature() {
        return temperature;
    }

    public String getStatus() {
        return status;
    }

    public void change(double temperature) {
        this.temperature = temperature;
        if (temperature < 40) {
            status = "cold !";
        } else if (temperature >= 40 && temperature < 60) {
            status = "warm !";
        } else if (temperature >= 60 && temperature < 100) {
            status = "hot !";
        } else {
            status = "boiled !";
        }
        this.isChanged = true;
        notifyObservers();
    }

}
