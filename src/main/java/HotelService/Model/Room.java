package HotelService.Model;

public class Room {

    private int number;
    private int numberOfPlace;
    private boolean barthRoom;
    private boolean available;

    public Room(int number,
                int numberOfPlace,
                boolean barthRoom,
                boolean available) {
        this.number = number;
        this.numberOfPlace = numberOfPlace;
        this.barthRoom = barthRoom;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfPlace() {
        return numberOfPlace;
    }

    public void setNumberOfPlace(int numberOfPlace) {
        this.numberOfPlace = numberOfPlace;
    }

    public boolean isBarthRoom() {
        return barthRoom;
    }

    public void setBarthRoom(boolean barthRoom) {
        this.barthRoom = barthRoom;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", numberOfPlace=" + numberOfPlace +
                ", barthRoom=" + barthRoom +
                ", available=" + available +
                '}'+"\n";
    }
}
