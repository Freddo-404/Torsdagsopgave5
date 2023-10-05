package Task1;

public class Customer {
    private String FirstName;
    private String LastName;
   private  String userName;
    private int id;

    public Customer (String FirstName, String LastName,  String userName){
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.userName = userName;
    }

    @Override
    public  String toString() {
    String c = "";
    c="FirstName: "+FirstName+" Lastname: "+LastName+" Userid: "+userName;
    return c;
    }
}
