package com.night.lesson.model;

public class Rectangle {
    private int width;

    private int length;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArae() {
        return width * length;
    }

    public int getPerimeter(){
        return (width + length) * 2;
    }

    public void testDemo() {

    }
}
