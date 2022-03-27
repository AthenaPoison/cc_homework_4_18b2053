package cc_homework_4_18b2053.cc_clean_code;

public class Animal {
    public Crow getAnimal(){
        Crow crow = new Crow();
        return crow;
    }

    public String getInformation(String type){
        if (type == "crow"){
            Crow c = new Crow();
            c.setInformation();
            String classification = c.getClassificartion();
            String group = c.getGroupName();
            return "A crow is a " + classification + " a group of crows is called a " + group;
        } else{
            return "Sorry, we don't have this animal";
        }
    }
}
