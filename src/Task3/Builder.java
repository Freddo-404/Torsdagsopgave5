package Task3;

import java.util.ArrayList;

public class Builder {
    private ArrayList<Room>rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
   private boolean isOfficeBuilding;
   public Builder(ArrayList<Room> rooms,int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
       this.rooms = rooms;
       this.numberOfBathrooms = numberOfBathrooms;
       this.numberOfFloors = numberOfFloors;
       this.isOfficeBuilding = isOfficeBuilding;

   }
    public ArrayList<Room>getRoom(){
        return rooms;
    }
    public int getBathrooms(){
        return numberOfBathrooms;
    }
    public int getFloors(){
        return numberOfFloors;
    }
    public boolean getOfficeBuilding(){
        return isOfficeBuilding;
    }
}
