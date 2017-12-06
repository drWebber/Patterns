package pt.behavioral.observer;

public class Mailer implements Observer {
    @Override
    public void handleEvent(News news) {
        System.out.println("--- Mailer daemon ---");
        System.out.println("You'v got 1 new message:");
        System.out.println("Heading: " + news.getTitle());
    }
}
