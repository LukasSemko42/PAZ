package sk.upjs.paz;

import sk.upjs.jpaz2.*;

public class SmartTurtle extends Turtle {
    public void centeredSquare(double sideLength) {
        this.penUp();
        this.turn(-90);
        this.step(sideLength/2);
        this.turn(90);
        this.penDown();
        this.step(sideLength/2);
        this.turn(90);
        for (int i = 0; i < 3; i++) {
            this.step(sideLength);
            this.turn(90);
        }
        this.step(sideLength/2);
        this.turn(90);
        this.penUp();
        this.step(sideLength/2);
        this.turn(-90);
    }
}
