package Interfaces;

public class task11 {
    public static void main(String[] args) {
    }
    //can move
    public interface Movable {
        void move();
    }
    //can be eaten
    public interface Edible {
        void beEaten();
    }
    // might eat someone
    public interface Eat {
        void eat();
    }

    class Cat implements Movable, Edible, Eat {

        @Override
        public void eat() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }
    class Dog implements Movable, Eat {

        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }
    class Mouse implements Movable, Edible {

        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }
}
