package creational.singleton;

public class DBSingleton {

    private static DBSingleton singleton = new DBSingleton();

    private DBSingleton(){}

    public static DBSingleton getInstance(){
        return singleton;
    }
}
