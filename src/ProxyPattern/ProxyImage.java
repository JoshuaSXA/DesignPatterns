package ProxyPattern;

public class ProxyImage implements Image {

    private RealImage realImage;

    private String imgName;

    public ProxyImage(String imgName) {

        this.imgName = imgName;

    }

    @Override
    public void display() {

        if(realImage == null) {

            realImage = new RealImage(imgName);

        }

        realImage.display();

    }

}
