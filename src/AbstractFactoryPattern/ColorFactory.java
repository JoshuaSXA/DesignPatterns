package AbstractFactoryPattern;

import FactoryPattern.*;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getObjectShape(String shapeType) {

        return null;

    }

    @Override
    public Color getObjectColor(String colorType) {

        if (colorType == null) {

            return null;

        }

        if (colorType.equals("RED")) {

            return new Red();

        } else if (colorType.equals("GREEN")) {

            return new Green();

        } else if (colorType.equals("BLUE")) {

            return new Blue();

        }

        return null;

    }

}
