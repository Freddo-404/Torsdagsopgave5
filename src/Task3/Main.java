package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room bathroom = new Room(4, 10, 4);
        Room livingroom = new Room(5, 15, 7);
        Room office = new Room(1, 5, 1);

        ArrayList<Room> rooms1 = new ArrayList<>();
        rooms1.add(bathroom);
        rooms1.add(livingroom);
        rooms1.add(office);

        Builder building = new Builder(rooms1, 4, 2, true);
        System.out.println(countLamps(building));
        System.out.println(isNormal(building));
    }

    static int countLamps(Builder building) {
        int lamps = 0;
        for (Room s : building.getRoom()) {
            lamps += s.getLamps();
        }
        return lamps;
    }

    public static boolean isNormal(Builder building) {
        if (building.getFloors() < building.getRoom().size()) {
            System.out.println("Building is normal");
            return true;
        } else {
            System.out.println("Building is normal");
            return false;
        }
    }
}

