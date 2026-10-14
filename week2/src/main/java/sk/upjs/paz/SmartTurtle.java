package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.awt.*;

public class SmartTurtle extends Turtle {

	// put new methods here

    public void chain(int beadCount, double beadRadius){
        this.penUp();
        this.turn(90);
        for (int i = 0; i < beadCount; i++) {
            this.setFillColor(Color.blue);
            this.dot(beadRadius);
            this.step(beadRadius*2);
        }
    }

    public void ngon(int n, double sideLength){
        this.turn(-90);
        int vnutornyUhol=((n-2)*180)/n;
        for (int i = 0; i < n; i++) {
            this.turn(180-vnutornyUhol);
            this.step(sideLength);

        }
    }

    public void dashedLine(int n, double segmentLength) {
        for (int i = 0; i < n; i++) {
            this.step(segmentLength/4);
            this.penUp();
            this.step(segmentLength/2);
            this.penDown();
            this.step(segmentLength/4);
        }
    }
    public void isosceles(double angle, double length){
        double startX=getX();
        double startY=getY();

        this.turn(-angle/2);
        this.step(length);

        double Ax=this.getX();
        double Ay=this.getY();

        this.step(-length);
        this.turn(angle);

        this.step(length);
        this.moveTo(Ax,Ay);

        this.turn(-angle/2);
        this.moveTo(startX,startY);
    }

    public void mill(int n,double length){
        this.setPenColor(Color.yellow);
        this.turn(90);
        for (int i = 0; i < n; i++) {
            this.isosceles(30,length);
            this.turn(360/n);
        }
    }



    public void rgbChain(int beadCount, double beadRadius) {
        Color[] colors = {Color.red, Color.green, Color.blue};
        this.turn(90);
        this.penUp();

        for (int i = 0; i < beadCount; i++) {
            this.setFillColor(colors[i % 3]);
            this.dot(beadRadius);
            this.step(beadRadius*2);
        }
    }

    public void circleWalk(int stepCount, double radius){
        for (int i = 0; i < stepCount; i++) {
            this.turn(Math.random() * 360);
            this.step(5);

            if (this.distanceTo(150,150)>radius) {
                this.step(-5);
            }
        }
    }

    public void tripleCircleWalk(int stepCount, double radius){
        for (int i = 0; i < stepCount; i++) {
            this.turn(Math.random() * 360);
            this.step(5);
            if (this.distanceTo(150,150)<radius/3){
                this.penUp();
            } else if (this.distanceTo(150,150)<(2*radius/3)){
                this.penDown();
                this.setPenColor(Color.blue);
            } else {
                this.setPenColor(Color.red);
            }

            if (this.distanceTo(150,150)>radius) {
                this.step(-5);
            }
        }
    }
    public void squareWalk(int stepCount, double sideLength){
        this.setPenColor(Color.red);

        for (int i = 0; i < stepCount; i++) {
            this.turn(Math.random() * 360);
            this.step(5);

            double tx=this.getX();
            double ty=this.getY();

            //boundaries: A x: 150-sidelength/2 y: 150-sidelength/2

            if (tx<(150-sideLength/2) || tx>(150+sideLength/2)){
                this.step(-5);
            }
            if (ty<(150-sideLength/2) || ty>(150+sideLength/2)){
                this.step(-5);
            }
        }
    }

    public void circleWalk2(int stepCount, double radius){
        int stepNumber=0;
        for (int i = 0; i < stepCount; i++) {
            if (stepNumber<=100){
                this.setPenColor(Color.red);
            } else if (stepNumber<=182) {
                this.setPenColor(Color.blue);
            } else if (stepNumber<=304) {
                this.setPenColor(Color.black);
            } else {
                stepNumber=0;
            }

            this.turn(Math.random() * 360);
            this.step(5);
            stepNumber+=1;

            if (this.distanceTo(150,150)>radius) {
                this.step(-5);
            }
        }
    }


}