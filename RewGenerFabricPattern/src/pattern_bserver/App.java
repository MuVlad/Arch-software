package pattern_bserver;

public class App {
    public static void main(String[] args) {
        DeveloperHunterSite hunterSite = new DeveloperHunterSite();

        hunterSite.addVacancy("Java Developer");
        hunterSite.addVacancy("C# Developer");
        hunterSite.addVacancy("python Developer");

        IObserver firstSubscriber = new Subscriber("Ivan Ivanov");
        IObserver secondSubscriber = new Subscriber("Elena Smirnova");

        hunterSite.addObserver(firstSubscriber);
        hunterSite.addObserver(secondSubscriber);

        hunterSite.addVacancy("Kotlin Developer");


    }
}
