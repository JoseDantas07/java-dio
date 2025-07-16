import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    Map<String, String> dictionaryMap;

    public Dictionary() {
        this.dictionaryMap = new HashMap<>();
    }

    public void addWord(String name, String definition){
        dictionaryMap.put(name,definition);
    }

    public void removeWord(String name){
        if (!dictionaryMap.isEmpty()){
            dictionaryMap.remove(name);
        }
    }

    public void displayWord(){
        System.out.println(dictionaryMap);
    }

    public String searchByWord(String name){
        String wordFound = null;
        if (!dictionaryMap.isEmpty()){
            wordFound = dictionaryMap.get(name);
        }
        return wordFound;
    }
}
