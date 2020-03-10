package creational.factorymethod;

import java.util.Calendar;

public class FactoryEverydayDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar anotherCalendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(anotherCalendar);


        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }
}
