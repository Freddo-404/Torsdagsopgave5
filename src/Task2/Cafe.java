package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
  private ArrayList<String> coffeMenu = new ArrayList<>();

    public void loadMenuData() {
        File file = new File("src/Task2/coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                //String coffeMenu = scan.nextLine();
               // System.out.println(coffeMenu);
                coffeMenu.add(scan.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }

        }
    public ArrayList<String> getMenu() {
        return coffeMenu;
        }
    }

