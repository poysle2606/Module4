package codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository{

    public static Map<String, String> stringMap = new HashMap<>();

    static {
        stringMap.put("one","một");
        stringMap.put("two","hai");
        stringMap.put("three","ba");
        stringMap.put("four","bốn");
        stringMap.put("five","năm");
    }
    @Override
    public String language(String search) {
        if(stringMap.get(search) != null){
            return stringMap.get(search);
        } else {
            return "not exits";
        }
    }
}
