package extends_task;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Alice";
        manager.salary = 80_000;
        Developer developer = new Developer();
        developer.name = "Bob";
        developer.salary = 60_000;
        manager.showInfo(manager);
    }
}
