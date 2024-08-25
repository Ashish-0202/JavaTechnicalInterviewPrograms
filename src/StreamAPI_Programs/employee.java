package StreamAPI_Programs;

import java.util.Date;

public class employee {
    private int id;

    private String name;

    private Date doj;

    private double salary;

    public employee(int id, String name, Date doj, double salary) {
        this.id = id;
        this.name = name;
        this.doj = doj;
        this.salary = salary;
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

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                ", salary=" + salary +
                '}';
    }
}
