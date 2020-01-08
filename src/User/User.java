package User;

public class User {
    String name;
    String surname;
    int age;
    int activity;
    int points;
    boolean isAuthorized;
    Order order;
    public User(String name, String surname, int age, int activity, int points, boolean isAuthorized, Order order) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.activity = activity;
        this.points = points;
        this.isAuthorized = isAuthorized;
        this.order = order;
    }
}
