package creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        //System.out.println(movie.hashCode());
        //System.out.println(movie.hashCode());
        /*System.out.println(movie.getTitle().hashCode());
        System.out.println(movie.getTestClass().hashCode());*/


        Movie anotherMovie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie.hashCode());
        System.out.println(anotherMovie.hashCode());

        if(movie.equals(anotherMovie)){
            System.out.println("movie.equals(anotherMovie)");
        }

        if(movie == anotherMovie){
            System.out.println("movie == anotherMovie");
        }

        movie.setTitle("Creational Patterns in Java");
        anotherMovie.setTitle("Gang of four");
        //System.out.println(anotherMovie.hashCode());
        /*System.out.println(anotherMovie.getTitle().hashCode());
        System.out.println(anotherMovie.getTestClass().hashCode());*/

        //registry.test();
        System.out.println(movie.getTitle());
        System.out.println(anotherMovie.getTitle());


    }
}
