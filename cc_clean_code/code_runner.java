package cc_homework_4_18b2053.cc_clean_code;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class code_runner {
    public static void main(String[] args){
        //chapter 6 good code example = data structure and abstraction
        Animal animal = new Animal();
        String information = animal.getInformation("crow");
        System.out.print(information);

        //chapter 6 good code example - train wreck
        Crow myCrow = animal.getAnimal();
        Behavior behave = myCrow.getBehavior();
        System.out.println(behave);


        //chapter 7 good code example - error hanlding
        //opening a file that does not exist 
        try{
            File myFile = new File("example.txt");
            Scanner myReader = new Scanner(myFile);
            myReader.close();
        }catch (FileNotFoundException ex){
            System.out.println("File not found! Please if its the correct path.");
        }

        //chapter 8 good code example - boundaries
        //does not allow user to directly access the map
        Maps myMap = new Maps();
        myMap.setMap("The Voice in the Fog", "John Smith");
        myMap.setMap("Marked For Ruin", "Sam Book");

        System.out.println(myMap.getById("Marked For Ruin"));
    }
}
