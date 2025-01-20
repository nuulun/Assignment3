package Interfaces;

public class task4 {
    public static void main(String[] args) {
    }
    interface CanRun {
        void run();
    }

    interface CanSwim {
        void swim();
    }

    abstract class Human implements CanRun, CanSwim {

    }
}
