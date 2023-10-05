package Task1;

import Task1.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer c0 = new Customer("Frederik", "Dupont", "YungDudu");
        Customer c1 = new Customer("Frederik", "Moestrup", "Shidora");
        Customer c2 = new Customer("Jonas", "Dezote", "Tunfisken");
        Customer c3 = new Customer("Marcus", "Ekeroth", "Doginator");


        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c0);
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
    printCustomer(customers);
        }
      public static void printCustomer(ArrayList<Customer>customers){
        for(Customer c: customers){
            System.out.println(c);
        }
      }
    }
