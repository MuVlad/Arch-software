package pattern_bserver;

import java.util.ArrayList;
import java.util.List;

public class DeveloperHunterSite implements IObserved{
    List<String> vacancies = new ArrayList<>();
    List<IObserver> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    @Override
    public void addObserver(IObserver subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeObserver(IObserver subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        for (IObserver subscriber : subscribers) {
            subscriber.handelEvent(this.vacancies);
        }
    }
}
