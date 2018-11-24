package HotelService.Service;

import HotelService.Model.Hotel;
import HotelService.Model.Room;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HotelService {

    private final Hotel hotel;

    public HotelService(Hotel hotel) {
        this.hotel = hotel;
    }

    // ,etoda pobrania wszystkich pokoi
    public List<Room> getRooms() {
        return hotel.getRooms();
    }

    // metoda pobrania wszyzstkich wolnych pokoi
    public List<Room> getAvailableRooms() {
        return getRooms().stream()
                // filtrujemy pokoje
                .filter(room -> room.isAvailable())
                // zapisujemy do listy
                .collect(Collectors.toList());
    }

    public void checkIn(int roomNumber) {
        // Optional, dlatego bo moze nie byc takiego numeru
        Optional<Room> room = getAvailableRooms().stream()
                .filter(freeRoom -> freeRoom.getNumber() == roomNumber)
                .findFirst();

        room.ifPresent(rommTmp -> rommTmp.setAvailable(false));
    }

    public void checkOut(int roomNumber) {
        // Optional, dlatego bo moze nie byc takiego numeru
        Optional<Room> room = getUnavailableRooms().stream()
                .filter(freeRoom -> freeRoom.getNumber() == roomNumber)
                .findFirst();

        room.ifPresent(rommTmp -> rommTmp.setAvailable(true));

    }
    
    private  List<Room> getUnavailableRooms(){
        return getRooms().stream()
                .filter(room -> !room.isAvailable())
                .collect(Collectors.toList());
    }


}
