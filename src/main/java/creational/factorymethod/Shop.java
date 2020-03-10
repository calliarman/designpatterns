package creational.factorymethod;

public class Shop extends Website {

    public Shop(){
        super();
    }

    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
