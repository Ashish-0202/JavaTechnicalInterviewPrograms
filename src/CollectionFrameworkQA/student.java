package CollectionFrameworkQA;

import java.util.Comparator;

public class student implements Comparable<student> {

    int id;
    private String name;

    public student(){}

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(student o) {
        if(this.id<o.id){
            return -1;
        }else if(this.id>o.id){
            return 1;
        }
        return 0;
    }
}

class nameOrder implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
