package AbstractFactoryPattern;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {

        if (factoryType == null) {

            return null;

        }

        if (factoryType.equals("SHAPE")) {

            return new ShapeFactory();

        } else if (factoryType.equals("COLOR")) {

            return new ColorFactory();

        }

        return null;

    }

}
