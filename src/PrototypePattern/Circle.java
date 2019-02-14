package PrototypePattern;

public class Circle extends Shape {

    public void Circle() {

        this.type = "Circle";

    }

    @Override
    public void draw() {

        System.out.println("Inside Circle::draw() method.");

    }

}
