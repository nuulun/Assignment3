package Interfaces;

public class task5 {
    public static void main(String[] args) throws Exception {
        BeerLover beelover = new BeerLover();
        System.out.println(beelover.isReadyToGoHome());
    }

    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }
    public static class BeerLover implements Alcoholic {
        @Override
        public void askForMore(String message) {
        }

        @Override
        public void sayThankYou() {
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {
        }
    }

}
