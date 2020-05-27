import java.util.ArrayList;
import java.util.List;

public class Clients implements Observed{
    Integer roomNumber;

    public Clients(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    List<Observer> services = new ArrayList<>();
    List<String> clientWishes = new ArrayList<>();

    public void addClientWish(String clientWish){
        this.clientWishes.add(clientWish);
        notifyObservers();
    }
    public void removeClientWish(String clientWish){
        this.clientWishes.remove(clientWish);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.services.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.services.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : services ) {
            observer.handleEvent(clientWishes,roomNumber);

        }
    }

}
