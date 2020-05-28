import java.util.List;

public interface Observer {
    void handleEvent(List<String> clientWishes, Integer roomNumber);
}
