package behavioral.observer.NewsAgency;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(String message);
}
