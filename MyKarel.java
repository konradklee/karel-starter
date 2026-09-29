import stanford.karel.*;

public class MyKarel extends Karel {

    public void putDoubleBeeperOnNextDoor() {
        while(beepersPresent()){
            pickBeeper();
            move();
            move();

        }
    }
}
