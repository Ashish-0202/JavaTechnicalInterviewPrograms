package StreamAPI_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
       return this.year - o.year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Movie> list= new ArrayList<>();

        list.add(new Movie(9.9,"Kalki",2002));
        list.add(new Movie(8.9,"C",2001));
        list.add(new Movie(8.8,"B",1998));
        list.add(new Movie(9.4,"A",2023));

        Collections.sort(list);

        for (Movie m: list){
            System.out.println(m.getName());
        }

    }
}
