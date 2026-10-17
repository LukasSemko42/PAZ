package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.awt.*;

public class SmartTurtle extends Turtle {

    // put new methods here

//    public void square() {
//        for (int i = 0; i < 4; i++) {
//            this.step(100);
//            this.turn(90);
//        }
//    }

    public void triangle(double size) {
        for (int i = 0; i < 3; i++) {
            this.step(size);
            this.turn(120);
        }
    }

    public void rgbTriangle(double size) {
        this.setPenWidth(2);
        this.setPenColor(Color.RED);
        this.step(size);
        this.turn(120);
        this.setPenColor(Color.GREEN);
        this.step(size);
        this.turn(120);
        this.setPenColor(Color.BLUE);
        this.step(size);
        this.turn(120);
    }

    public void rectangle(double dlzka, double vyska){
        for (int i = 0; i < 2; i++) {
            this.step(vyska);
            this.turn(90);
            this.step(dlzka);
            this.turn(90);
        }
    }
    public void dashDotDash(double length){
        this.step(length*0.25);
        this.setPenDown(false);
        this.step(length*0.20);
        this.setFillColor(Color.YELLOW);
        this.dot(length*0.10);
        this.step(length*0.20);
        this.setPenDown(true);
        this.step(length*0.25);

    }

    public void sun(double radius) {
        this.setPenColor(Color.ORANGE);
        for (int i = 0; i < 36; i++) {
            this.step(radius*2);
            this.step(-1*radius*2);
            this.turn(10);
        }
        this.setFillColor(Color.YELLOW);
        this.dot(radius);
    }

    public void pinwheel(double size) {
        for (int i = 0; i < 8; i++) {
            this.step(size);
            this.turn(45);
            this.step(10);
            this.step(-10);
            this.turn(-45);
            this.step(-1*size);
            this.turn(45);
        }
    }

    public void cross(double size){
        this.setPenWidth(2);
        this.setPenColor(Color.RED);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                this.step(size);
                this.turn(90);
            }
            this.step(size);
            this.turn(-90);
        }
    }

    public void square(double size) {
        for (int i=0; i<4; i++) {
            this.step(size);
            this.turn(90);
        }
    }

    public void squareDrawing(double size) {
        this.setPenColor(Color.BLUE);
        for (int i = 0; i < 10; i++) {
            square(size);
            this.turn(90);
            this.step(size/2);
            this.turn(-54);

        }
    }

    public void diamond(double angle, double sideLength) {
        this.setPenColor(Color.RED);
        this.setPenWidth(2);
        this.turn(-1*(angle/2));
        this.step(sideLength);
        this.turn(angle);
        this.step(sideLength);
        this.turn(180-angle);
        this.step(sideLength);
        this.turn(angle);
        this.step(sideLength);
        this.turn(180-angle/2);
    }

    public void mitsubishi(double angle, double sideLength) {
        for (int i = 0; i < 3; i++) {
            diamond(angle,sideLength);
            this.turn(120);
        }
    }

    public void grid(double unitSize){
        this.setX(10);
        this.setY(10);
        this.turn(90);
        for (int k = 0; k < 8 ;k++){
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 4; j++) {
                    this.step(unitSize);
                    this.turn(90);
                }
                this.step(unitSize);
            }
            this.step(-8*unitSize);
            this.turn(90);
            this.step(unitSize);
            this.turn(-90);
        }
    }

    public void star4(double sideLength, double angle){
        this.setPenColor(Color.ORANGE);
        this.setPenWidth(3);
        for (int i = 0; i < 4; i++) {
            this.step(sideLength);
            this.turn(180-angle);
            this.step(sideLength);
            this.turn(-90+angle);
        }
    }

    public void arrows(double size) {
        for (int j = 0; j < 4; j++) {
            this.penUp();
            this.step(size);
            this.penDown();
            this.turn(-90);
            this.step(size/2);
            this.turn(120);
            for (int i = 0; i < 2; i++) {
                this.step(size);
                this.turn(120);
            }
            this.step(size/2);
            this.penUp();
            this.turn(90);
            this.step(-size);
            this.turn(90);
        }
    }

    public void squareSpiral(int lineCount){
        double dlzkaStrany=150;
        for (int i = 0; i < lineCount; i++) {
            this.step(dlzkaStrany);
            this.turn(90);
            dlzkaStrany*=0.95;
        }
    }

    public void randomCircle(int stepCount){
        for (int i = 0; i < stepCount; i++) {
            if (this.distanceTo(150,150) > 100){
                this.setDirectionTowards(150,150);
                this.step(10);
            } else {
                this.turn(Math.random()*360);
                this.step(10);
            }
        }
    }


}
