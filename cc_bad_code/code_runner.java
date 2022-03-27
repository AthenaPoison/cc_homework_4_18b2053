package cc_homework_4_18b2053.cc_bad_code;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class code_runner {
    public static void main(String[] args){
        //chapter 6 - bad code example: data structure and abstraction
        Crow myCrow = new Crow();
        myCrow.setInformation();
        //should not be able to get private variables directly, in this case classification which is set to private
        System.out.println(myCrow.getClassificartion());
        //should also not have functions that do significant things, in this case returning a whole sentence
        System.out.println(myCrow.getSentence());

        //chapter 6 - bad code example: train wreck
        Animal animal = new Animal();
        final String information = animal.getAnimal().getBehavior().getSound();
        System.out.println(information);


        //chapter 7 - bad code example: error handling
        //opening a file doesnt exist and swallowing the error
        try{
            File myFile = new File("example.txt");
            Scanner myReader = new Scanner(myFile);
        }catch (Exception ex){

        }


        //chapter 8 - bad code example: boundaries
        Map bookList = new HashMap<String, String>();
        bookList.put("The Voice in the Fog", "John Smith");
        bookList.put("Marked For Ruin", "Sam Book");
        System.out.println(bookList);
        //users should not be able to edit the map
        bookList.clear();
        System.out.println(bookList);
    }
}
