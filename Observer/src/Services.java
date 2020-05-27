import java.util.List;

public class Services implements Observer {
    String name;

    public Services(String name) {
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> clientWishes, Integer roomNumber) {
        System.out.println("To the " + name + ": " + "\nYou get new wish from the room number " + roomNumber + " : " + clientWishes +
        "\n=======================================================\n");

    }
}
