package FactoryPattern;

public class ShapeFactory {

    public Shape getObjectShape(String shapeType) {

        if(shapeType == null) {

            return null;

        }

        if (shapeType.equals("CIRCLE")) {

            return new Circle();

        } else if (shapeType.equals("RECTANGLE")) {

            return new Rectangle();

        } else if (shapeType.equals("TRIANGLE")) {

            return new Triangle();

        }

        return null;

    }

}
