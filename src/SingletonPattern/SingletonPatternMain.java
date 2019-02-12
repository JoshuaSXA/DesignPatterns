package SingletonPattern;

public class SingletonPatternMain {

    public static void main(String[] args) {

        SingleObject instance = SingleObject.getInstance();

        instance.alert();

    }

}
