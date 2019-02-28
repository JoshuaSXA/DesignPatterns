package MediatorPattern;

public class User {

    private String name;

    public String getName() {

        return name;

    }

    public void setName(String newName) {

        this.name = newName;

    }

    public User(String name) {

        this.name = name;

    }

    public void sendMessage(String message) {

        ChatRoom.showMessage(this, message);

    }
}
