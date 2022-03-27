package cc_homework_4_18b2053.cc_clean_code;

public class Crow {
    private String classification;
    private String group_name;

    public Behavior getBehavior(){
        Behavior behave = new Behavior();
        return behave;
    }

    public void setInformation(){
        this.classification = "Bird";
        this.group_name = "Murder";
    }
    public String getClassificartion(){
        return classification;
    }

    public String getGroupName(){
        return group_name;
    }

    public String getSentence(){
        return "A crow is a " + classification + " , a group of crows is called a " + group_name;
    }
}
