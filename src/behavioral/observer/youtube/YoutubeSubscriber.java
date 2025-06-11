package behavioral.observer.youtube;

public class YoutubeSubscriber implements Observer{
    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }
    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void notifyMe(String youtubeChannelName, YoutubeEvent event) {
        System.out.println("Dear " + getName() + ", Notification from " + youtubeChannelName + ": " + event);
    }
}
