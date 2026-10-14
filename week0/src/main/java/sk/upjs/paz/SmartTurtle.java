package sk.upjs.paz;

import sk.upjs.jpaz2.*;

public class SmartTurtle extends Turtle {

    public void square() {
        for (int i = 0; i < 4; i++) {
            this.step(100);
            this.turn(90);
        }
    }

    public void triangle(){
        for (int i = 0; i < 3; i++) {
            this.step(100);
            this.turn(120);
        }
    }

    public void mystery() {
        this.triangle();
        this.turn(120);
        this.triangle();
        this.turn(120);
        this.triangle();
        this.turn(120);
    }

    public void star(double length){
        for (int i = 0; i < 12; i++) {
            this.step(length);
            this.center();
            this.turn(30);
        }
    }

}