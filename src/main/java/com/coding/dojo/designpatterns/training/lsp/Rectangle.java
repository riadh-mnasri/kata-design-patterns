package com.coding.dojo.designpatterns.training.lsp;

public class Rectangle {
    protected int height, width;


    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public boolean isSquare() {
        return height == width;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
            "height=" + height +
            ", width=" + width +
            '}';
    }
}
