//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import com.sun.org.apache.xerces.internal.xinclude.XPointerElementHandler;

import java.awt.*;

public class Shape {
    //instance variables
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    public Shape(int x, int y, int wid, int ht, Color col) {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = col;
    }

    public void draw(Graphics window) {
        int centerX = xPos + width/2;
        int centerY = yPos + width/2;

        window.setColor(color.darker());
        window.drawOval(xPos, yPos, width, width);

        double sin18 = Math.sin(18D * (Math.PI / 180D));
        double cos18 = Math.cos(18D * (Math.PI / 180D));
        double sin36 = Math.sin(36D * (Math.PI / 180D));
        double cos36 = Math.cos(36D * (Math.PI / 180D));

        double rad = width/2f;



        Point p1 = new Point(centerX, (int) rad + centerY);
        Point p2 = new Point((int) (cos18 * rad) + centerX, (int) (sin18 * rad) + centerY);
        Point p3 = new Point((int) (sin36 * rad) + centerX, (int) (-cos36 * rad) + centerY);
        Point p4 = new Point((int) (-sin36 * rad) + centerX, (int) (-cos36 * rad) + centerY);
        Point p5 = new Point((int) (-cos18 * rad) + centerX, (int) (sin18 * rad) + centerY);

        window.drawLine(p1.x, p1.y, p3.x, p3.y);
        window.drawLine(p5.x, p5.y, p3.x, p3.y);
        window.drawLine(p5.x, p5.y, p2.x, p2.y);
        window.drawLine(p4.x, p4.y, p2.x, p2.y);
        window.drawLine(p4.x, p4.y, p1.x, p1.y);
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
}