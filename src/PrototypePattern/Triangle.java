package PrototypePattern;


public class Triangle extends Shape{

    public Triangle() {

        this.type = "Triangle";

    }

    @Override
    public void draw() {

        System.out.println("Inside Triangle::draw() method.");

    }

}
