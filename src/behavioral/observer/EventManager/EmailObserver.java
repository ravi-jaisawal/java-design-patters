package behavioral.observer.EventManager;

public class EmailObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Email sent for event: " + event);
    }
}
