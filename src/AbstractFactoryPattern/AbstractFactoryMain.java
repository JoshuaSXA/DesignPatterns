package AbstractFactoryPattern;

import FactoryPattern.*;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Shape shape1 = shapeFactory.getObjectShape("RECTANGLE");

        shape1.draw();

        Shape shape2 = shapeFactory.getObjectShape("CIRCLE");

        shape2.draw();

        Shape shape3 = shapeFactory.getObjectShape("TRIANGLE");

        shape3.draw();

        Color color1 = colorFactory.getObjectColor("RED");

        color1.fill();

        Color color2 = colorFactory.getObjectColor("GREEN");

        color2.fill();

        Color color3 = colorFactory.getObjectColor("BLUE");

        color3.fill();

    }

}
ad