package behavioral.observer;

public class YoutubeEvent {
    private EventType eventType;
    private String topic;
    public YoutubeEvent(EventType eventType, String topic) {
        this.eventType = eventType;
        this.topic = topic;
    }
    // getters ans setters
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public EventType getEventType() {
        return eventType;
    }
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
    @Override
    public String toString() {
        return eventType.name() + " on " +  topic;
    }
}
