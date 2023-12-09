package Lesson1;

public class YoungWorker extends Worker {

    public YoungWorker(String name) {
        super(name);
    }

@Override
    public void setAge(int age) {
        if (age >= 20 && age < 25) {
            super.setAge(age);
        }

    }


}
