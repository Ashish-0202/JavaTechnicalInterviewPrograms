package StreamAPI_Programs;


// A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class Movie1 implements Comparable<Movie1> {
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie1 m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie1(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear() { return year; }
}

class compareRating implements Comparator<Movie1>{
    @Override
    public int compare(Movie1 o1, Movie1 o2) {
        if(o1.getRating() < o2.getRating())
            return -1;
        else if(o1.getRating() > o2.getRating())
            return 1;
        return 0;
    }
}

class compareName implements Comparator<Movie1>{

    @Override
    public int compare(Movie1 o1, Movie1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Movie1> list= new ArrayList<>();

        list.add(new Movie1("Kalki", 9.9,2002));
        list.add(new Movie1("C", 8.9,2001));
        list.add(new Movie1("B", 8.8,1998));
        list.add(new Movie1("A", 9.4,2023));

        compareRating compareRating=new compareRating();
        compareName name=new compareName();
        Collections.sort(list, name);

        for (Movie1 m: list){
            System.out.println(m.getName());
        }
    }
}
