package creational.singleton;

public class DBSingleton {

    //volatile thread safe
    private static volatile DBSingleton instance = null;

    //one constructor with no args
    private DBSingleton() {
        if (instance != null)
            throw new RuntimeException("Use getInstance() method to create");
    }

    public static DBSingleton getInstance() {
        if (instance == null)
            synchronized (DBSingleton.class) {
                if (instance == null) {
                    instance = new DBSingleton();
                }
            }

        return instance;
    }
}
