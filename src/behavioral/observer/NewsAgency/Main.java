package behavioral.observer.NewsAgency;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer channelA = new NewsChannel("Channel A");
        Observer channelB = new NewsChannel("Channel B");

        agency.attach(channelA);
        agency.attach(channelB);

        agency.breakingNews("Elections results are out!");
        agency.breakingNews("New budget announced.");

        agency.detach(channelA);

        agency.breakingNews("Sports update: Team X wins!");
    }
}
