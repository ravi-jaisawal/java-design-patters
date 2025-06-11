package behavioral.observer.EventManager;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void triggerEvent(String event) {
        System.out.println("Event triggered: " + event);
        notifyObservers(event);
    }
}
