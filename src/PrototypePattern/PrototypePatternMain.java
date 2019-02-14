package PrototypePattern;

public class PrototypePatternMain {

    public static void main(String[] args) {
        ShapeHash.loadCache();

        Shape clonedShape = (Shape) ShapeHash.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeHash.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeHash.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}
