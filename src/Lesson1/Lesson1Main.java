package Lesson1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson1Main {
    public static void main(String[] args) {
        // Инкапсуляция - способность языка писать код таким образом, чтобы часть этого кода была скрыта, (нельзя было к нему обратиться),
        // а другой можно было пользоваться. Модификаторы доступа - private, protected....
        // Наследование, Полиморфизм, (Абстракция)
        LinkedList<String> list = new LinkedList<>();
        Person person = new Person("Igor", 120); // Igor -120

        //person.setAge(200);

        //System.out.println(person.getName());
        // System.out.println(person.getAge());
        printPerson(person);
        //System.out.println(person);


        Worker worker = new Worker("Igor");
        //System.out.println(worker.getSalary());

        //worker.setAge(250);
        printPerson(worker); // Igor - 120<->Igor -120, 100
        //System.out.println(worker);
        // System.out.println(worker.getSalary());
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(worker);
    }

    static void printPerson(Person person) {
        System.out.println(person);
        // полиморфизм - способность функции принимать не только объекты этого типа, но и наследников.
    }


}
