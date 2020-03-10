package creational.factorymethod;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Website {
    protected List<Page> pages = new ArrayList<Page>();

    public Website(){
        this.createWebsite();
    }

    public abstract void createWebsite();
}
