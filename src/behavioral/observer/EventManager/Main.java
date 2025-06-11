package behavioral.observer.EventManager;


public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        // emailObserver create
        Observer emailObserver = new EmailObserver();
        //smsObserver create
        Observer smsObserver = new SMSObserver();

        // emailObserver registration
        eventManager.registerObserver(emailObserver);
        // smsObserver registration
        eventManager.registerObserver(smsObserver);

        // triggered event
        eventManager.triggerEvent("User Registered");
        eventManager.triggerEvent("Password Changed");

        eventManager.removeObserver(emailObserver);

        eventManager.triggerEvent("Account Deleted");
    }
}
