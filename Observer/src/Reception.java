import java.util.Collections;

public class Reception {
    public static void main(String[] args) {
        Clients singleRoom = new Clients(15);
        Clients doubleRoom = new Clients(26);
        Clients luxesRoom = new Clients(31);


        Observer housekeeping  = new Services("Housekeeping service");
        Observer roomService = new Services("Room service");

        singleRoom.addObserver(roomService);
        doubleRoom.addObserver(housekeeping);
        luxesRoom.addObserver(roomService);

        singleRoom.addClientWish("Can I have a breakfast to the room tomorrow please.");
        doubleRoom.addClientWish("Please, can you clean our room one more time.");
        luxesRoom.addClientWish("I would like to reserve a table in the restaurant for today at 7:00 PM.");
    }
}
