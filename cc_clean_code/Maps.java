package cc_homework_4_18b2053.cc_clean_code;
import java.util.Map;
import java.util.HashMap;

public class Maps {
    private Map bookList = new HashMap<String, String>();

    public void setMap(String bookName, String author){
        bookList.put(bookName, author);
    }
    public Object getById(String bookName){
        return bookList.get(bookName);
    }
}
