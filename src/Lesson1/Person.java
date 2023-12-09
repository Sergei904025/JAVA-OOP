package Lesson1;

public class Person {


    // public доступен всем
    // private недоступен никому
    // protected доступен внутри пакета + наследникам
    // default доступен внутри пакета

    private final String name;
    private int age;

    public Person(String name) {
        this(name, 20);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {

            this.age = age;


        }

    }

    @Override
    public String toString() {
        return String.format("%s - %s", name, age);
    }
}