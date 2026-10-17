package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class SmartTurtle extends Turtle {
    public void mystery() {
        for (int i=0; i<256; i++) {
            Color c = new Color(i, 100, 100);
            this.setPenColor(c);
            this.setPosition(i, 0);
            this.moveTo(i, 150);
        }
    }

    public void randomPenColor(){
        int R = (int) (Math.random()*255);
        int G = (int) (Math.random()*255);
        int B = (int) (Math.random()*255);
        Color nahodnaFarba = new Color(R,G,B);
        this.setPenColor(nahodnaFarba);
    }

    public void concentricCircles(double radius) {
        int i=0;
        double obsah=0;
        double obsah1=0;
        double obsah2=0;
        while (radius>1){
            for (int j = 0; j < 2; j++) {
                switch(i%3){
                    case 0:
                        this.setFillColor(Color.red);
                        break;
                    case 1:
                        this.setFillColor(Color.blue);
                        break;
                    case 2:
                        this.setFillColor(Color.GRAY);
                        break;
                }
                this.dot(radius);
                radius*=0.8;
                i++;
                if (j==0){
                    obsah1=Math.PI*(radius*radius);
                }
            }
            obsah2=Math.PI*(radius*radius);
            obsah+=(obsah1-obsah2);
        }
        System.out.println(obsah);
    }
}
