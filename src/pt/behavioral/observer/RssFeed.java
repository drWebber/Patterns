package pt.behavioral.observer;

public class RssFeed implements Observer {
    @Override
    public void handleEvent(News news) {
        System.out.println("--- RSS FEED ---");
        System.out.println("News: " + news.getTitle());
        System.out.println("Content: " + news.getContent());
    }
}
