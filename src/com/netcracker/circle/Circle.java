package com.netcracker.circle;

import java.util.Objects;

public class Circle {

    private int height;
    private int width;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return height == circle.height && width == circle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "height=" + height +
                ", width=" + width +
                '}' + "\n";
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

    public Circle(int height, int width) {
        this.height = height;
        this.width = width;
    }
}
