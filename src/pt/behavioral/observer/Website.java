package pt.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Website implements Observed {
    private List<Observer> observers = new ArrayList<Observer>();
    private List<News> newsList = new ArrayList<News>();
    
    public Website() { }

    public void addNews(News news) {
        newsList.add(news);
        notifyObservers();
    }
    
    @Override
    public void addObserver(final Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(final Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.handleEvent(newsList.get(newsList.size()-1));
        }
    }
}
