import java.util.*;
public class Dictionary {
    HashMap<String,String> dict;
    public Dictionary(){
        dict = new HashMap();
    }

    public void newEntry(String key, String value){
        dict.put(key,value);
    }

    public String look(String key){
        String value = dict.get(key);
        if(value == null){
            return "Cant find entry for "+key;
        }
        return value;
    }
}
