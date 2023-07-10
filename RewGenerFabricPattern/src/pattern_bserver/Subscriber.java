package pattern_bserver;

import java.util.List;

public class Subscriber implements IObserver{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handelEvent(List<String> vacancies) {
        System.out.println(name + ", We have some changes in vacancies:\n" + vacancies + "\n");
    }
}
