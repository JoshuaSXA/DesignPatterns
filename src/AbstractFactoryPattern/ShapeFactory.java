package AbstractFactoryPattern;
import FactoryPattern.*;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getObjectShape(String shapeType) {

        if (shapeType == null) {

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

    @Override
    public Color getObjectColor(String colorType) {

        return null;

    }

}
