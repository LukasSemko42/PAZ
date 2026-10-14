package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;
import sk.upjs.jpaz2.WinPane;

import java.awt.*;
import java.awt.event.MouseEvent;

public class GridPane extends WinPane {
    private int colorSet;

    public void resetColorSet(){
        this.colorSet=0;
    }

    public void increaseColorSet(){
        this.colorSet++;
    }

    public void drawGrid(){
        int x=0;
        int y=0;
        Turtle k = new Turtle();
        this.add(k);
        //kreslenie zvislych
        k.setPosition(x,y);
        while (k.getX()<=this.getWidth()){
            k.setDirection(180);
            k.step(this.getHeight());
            x+=50;
            k.setPosition(x,y);
        }
        //kreslenie vodorovnych
        x=0;
        y=0;
        k.setPosition(x,y);
        while (k.getY()<=this.getHeight()){
            k.setDirection(90);
            k.step(this.getWidth());
            y+=50;
            k.setPosition(x,y);
        }
        this.remove(k);
    }

    public void drawDot(int column, int row, Color dotColor){
        Turtle k = new Turtle();
        this.add(k);
        k.setPosition((column*50)+25,(row*50)+25);
        k.setFillColor(dotColor);
        k.dot(25);
        this.remove(k);
    }

    protected void onMouseClicked(int x, int y, MouseEvent detail) {
        int column = x / 50;
        int row = y / 50;
        if (this.colorSet%2==0){
            this.drawDot(column, row, Color.RED);
        } else this.drawDot(column, row, Color.BLUE);
        this.increaseColorSet();
    }
}
