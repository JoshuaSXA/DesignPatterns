package ProxyPattern;

public class RealImage implements Image {

    private String imgName;

    public RealImage(String imgName) {

        this.imgName = imgName;

        loadFromDisk(imgName);

    }

    @Override
    public void display() {

        System.out.println("Show image : " + imgName);

    }

    private void loadFromDisk(String imgName) {

        System.out.println("Loading image : " + imgName);

    }

}
