package PrototypePattern;

public class Rectangle extends Shape {

    public void Rectangle() {

        this.type = "Rectangle";

    }

    @Override
    public void draw() {

        System.out.println("Inside Rectangle::draw() method.");

    }

}
