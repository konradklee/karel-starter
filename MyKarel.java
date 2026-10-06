import stanford.karel.*;

public class MyKarel extends Karel {

    public void run() {
        konradWorld();
    }

    public void part1() {
        turnRight();
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
//pick up the beepers
    public void part2() {
        pickBeeper();
        move();
        move();
    }
//while command that picks up the beepers
    public void part3() {
        while (beepersPresent()) {
            pickBeeper();

            move();

            putBeeper();
            putBeeper();

            turnAround();
            move();
            turnAround();
        }
    }

    public void turnAround() {
        turnLeft();
        turnLeft();
    }

    public void part4() {
        move();
        move();
        turnLeft();

        move();
        move();
        turnLeft();

        move();
        move();
        turnLeft();

        move();
        move();
        turnLeft();
    }
    public void konradWorld(){
        turnLeft();
        move();
        pickBeeper();

        turnLeft();
        move();
        pickBeeper();

        turnRight();
        move();
        pickBeeper();
    }
}