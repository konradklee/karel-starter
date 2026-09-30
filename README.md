#Karel the robot coding

#This is my work from the weeks we have worked with Karel in COSC 10001 at TCU. Karel is a robot that only knows four commands, so here is some code that works with those commands and performs different tasks.

import stanford.karel.*;

public class MyKarel extends Karel {

    public void run() {
        part1();
        part2();
        part3();
        part4();
    }

    public void part1() {
        turnRight();
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void part2() {
        pickBeeper();
        move();
        move();
    }

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
}

#1. I learned that Karel has very specific commands that it follows, but there are lots of things you can do with the commands.
#2. I learned that because of Karel's limitations, you have to find a way to work around them.
