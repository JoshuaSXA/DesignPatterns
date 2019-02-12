package AbstractFactoryPattern;
import FactoryPattern.*;

public abstract  class AbstractFactory {

    public abstract Shape getObjectShape(String shapeType);

    public abstract  Color getObjectColor(String colorType);

}
