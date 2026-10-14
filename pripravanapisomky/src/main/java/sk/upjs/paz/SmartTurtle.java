package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.awt.*;

public class SmartTurtle extends Turtle {

//    public void dotOnTop(double width){
//        for (int i = 0; i < 5; i++) {
//            this.penDown();
//            this.turn(30);
//            this.step(width);
//            this.turn(120);
//            this.step(width);
//            this.step(-width);
//            this.setFillColor(Color.YELLOW);
//            this.dot(width*1/3);
//            this.penUp();
//            this.step(width);
//            this.turn(210);
//        }
//    }

//    public void dotOnTopInac(double width){
//        for (int i = 0; i < 6; i++) {
//            this.penDown();
//            this.turn(30);
//            this.step(width);
//            this.turn(120);
//            this.step(width);
//            this.turn(180-60);
//            this.penUp();
//            this.step(width/2);
//            this.setFillColor(Color.yellow);
//            this.dot(width*1/6);
//            this.step(-width/2);
//            this.turn(90);
//        }
//    }
//
//    public void pis(double width){
//        for (int i = 0; i < 4; i++) {
//            this.turn(30);
//            this.step(width);
//            this.turn(120);
//            this.step(width);
//            this.turn(180+30+90);
//            this.penUp();
//            this.step(width/3);
//            this.setFillColor(Color.yellow);
//            this.dot(width/3);
//            this.step(width/3);
//            this.turn(-90);
//            this.penDown();
//        }
//    }

    public void dotsAroundCircle(int n, double circleRadius){
        //ulozime startovaciu polohu
        double startX=this.getX();
        double startY=this.getY();

        //pre predstavu
        //this.circle(circleRadius);

        for (int i = 0; i < n; i++) {

            //vygenerujem random polomer zltych bodiek
            double dotRadius=(5+Math.random()*12);

            //random sa natocim
            this.turn(Math.random()*360);

            //podla polomeru zltych bodiek ich umiestnim na imaginarnu kruznicu
            if(dotRadius<10){
                this.step(circleRadius-dotRadius);
                this.setFillColor(Color.yellow);
                this.dot(dotRadius);
            } else {
                this.step(circleRadius+dotRadius);
                this.setFillColor(Color.yellow);
                this.dot(dotRadius);
            }

            //vratim sa na pociatocnu poziciu
            this.setPosition(startX,startY);
        }
    }
}
