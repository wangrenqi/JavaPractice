package PublishSubscribeMode.Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mccree on 20/12/2016.
 */
public abstract class Observable {
    protected boolean isChanged;
    protected List<Observer> observers = new ArrayList<>();

    public Observable() {
        isChanged = false;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void removeObservers() {
        observers.clear();
    }

    public void notifyObservers() {
        if (isChanged) {
            for (int i = 0;i<observers.size();i++) {
                observers.get(i).update(this);
            }
            isChanged = false;
        }
    }


}
