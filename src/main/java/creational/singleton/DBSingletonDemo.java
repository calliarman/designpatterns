package creational.singleton;

public class DBSingletonDemo {

    public static void main(String[] args) {
        DBSingleton singleton = DBSingleton.getInstance();
        System.out.println(singleton);

        DBSingleton otherInstance = DBSingleton.getInstance();
        System.out.println(otherInstance);
    }
}
