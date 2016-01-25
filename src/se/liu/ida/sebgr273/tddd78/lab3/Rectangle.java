package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Rectangle extends AbstractShape{
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        //System.out.printf("Ritar: " + this);
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + width +
                ", height=" + height +
                ", color=" + getColor() +
                '}';
    }
}
