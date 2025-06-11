package behavioral.observer.youtube;

public interface Observer {
    void notifyMe(String youtubeChannelName, YoutubeEvent event);
}
