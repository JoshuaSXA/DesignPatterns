package ProxyPattern;

public class ProxyPatternMain {

    public static void main(String[] args) {

        Image image = new ProxyImage("hello.png");

        image.display();

        image.display();

    }

}
