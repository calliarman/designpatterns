package creational.builder;

//builder pattern handles complex constructors

public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello");
        stringBuilder.append("World");

        System.out.println(stringBuilder);
    }
}
