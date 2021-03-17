package vending_machine;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;

public class Machine {
    public static void main(String[] args) {
        if (args.length< 1){
            System.out.println("Usage: java Machine hoge.txt");
            System.exit(0);
        }        
        File file = new File(args[0]);
        //include file
        if (!file.exists()) {
            System.out.println(args[0]+" does not exist.");
            System.exit(0);
        }

        try {
            FileInputStream fr = new FileInputStream(file);
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //show all of drink
        ArrayList<Drink> drinkList = new ArrayList<>();



        //        
    }
}
