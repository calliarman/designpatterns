package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    boolean clone = true;

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        if (clone) {
            try {
                item = (Item) (items.get(type)).clone();

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        } else
            item = (Item) (items.get(type));


        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");

        TestClass testClass = new TestClass();
        movie.setTestClass(testClass);

        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put("Book", book);
    }

    public void test() {
        System.out.println((items.get("Movie")).getTitle().hashCode());
        System.out.println((items.get("Movie")).getTestClass().hashCode());

    }
}
