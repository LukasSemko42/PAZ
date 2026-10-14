package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.awt.*;

import sk.upjs.jpaz2.Turtle;

import java.util.Random;


public class Artist extends Turtle {

    public void popArt(double height, double width, int dotCount){

        //save coords
        double savedTurtleX=this.getX();
        double savedTurtleY=this.getY();
        double savedTurtleRotation=this.getDirection();

        //draw space
        for (int i = 0; i < 2; i++) {
            this.turn(90);
            this.step(width);
            this.turn(90);
            this.step(height);
        }

        for (int i = 0; i < dotCount; i++) {
            //generate random turtle position
            double turtleX=150+Math.random()*width;
            double turtleY=150+Math.random()*height;

            //random farba
            Random random = new Random();
            Color[] colors = {Color.red,Color.blue};
            int randomIndex=random.nextInt(colors.length);
            Color randomColor=colors[randomIndex];
            this.setFillColor(randomColor);

            //polomer
            double polomer = 2 + (Math.random() * 5);

            //check borders and draw
            if (turtleX + polomer <= 150 + width && turtleX - polomer >= 150 && turtleY + polomer <= 150 + height && turtleY - polomer >= 150) {
                this.setX(turtleX);
                this.setY(turtleY);
                this.dot(polomer);
            }
        }

        //go back
        this.setX(savedTurtleX);
        this.setY(savedTurtleY);
        this.setDirection(savedTurtleRotation);
    }
}