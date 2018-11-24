package HotelService;

import HotelService.Model.Hotel;
import HotelService.Model.Room;
import HotelService.Service.HotelService;

public class App {
    public static void main(String[] args) {

        HotelService hotelService = new HotelService(new Hotel());

        System.out.println(hotelService.getRooms());
        System.out.println("Avaialable rooms");
        System.out.println(hotelService.getAvailableRooms());

    }
}
