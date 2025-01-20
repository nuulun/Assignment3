package Interfaces;

public class task9 {
    public static void main(String[] args) throws Exception {
    }
    interface CanMove {
        Double speed();
    }

    interface CanFly  extends  CanMove{
        Double speed(CanFly fly);
    }

    public static class Mysyk implements CanFly{

        @Override
        public Double speed() {
            return 5.0;
        }

        @Override
        public Double speed(CanFly fly) {
            return 1.0;
        }
    }
}
