package Lesson1;

public class Worker extends Person {

    private double salary;

    public Worker(String name, double salary) {
        super(name);
        this.salary = salary;
    }


    public Worker(String name) {
        this(name, Double.parseDouble("100.0"));
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        String toString = super.toString();
        return toString + ", " + salary;
       // return String.format("%s - %s, %s", getName(), getAge(), salary);
    }
}
