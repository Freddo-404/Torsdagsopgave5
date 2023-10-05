package Task3;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows ){
        this.numberOfDoors =numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    public int getDoors(){
        return numberOfDoors;
    }
    public int getLamps(){
        return numberOfLamps;
    }
    public int getWindows(){
        return numberOfWindows;
    }
}
