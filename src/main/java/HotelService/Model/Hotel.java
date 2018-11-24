package HotelService.Model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    // lista pokoi
    private List<Room> rooms = new ArrayList<>();
//dodania pokoi do listy
    public Hotel() {
        this.rooms.add(new Room(1,2,true,true));
        this.rooms.add(new Room(2,1,false,true));
        this.rooms.add(new Room(3,3,true,true));
        this.rooms.add(new Room(4,4,true,true));
        this.rooms.add(new Room(5,4,false,true));
        this.rooms.add(new Room(6,1,true,true));
        this.rooms.add(new Room(7,2,true,false));
        this.rooms.add(new Room(8,2,true,false));
        this.rooms.add(new Room(9,3,false,true));
        this.rooms.add(new Room(10,5,false,false));


    }

    public List<Room> getRooms() {
        return rooms;
    }
}
