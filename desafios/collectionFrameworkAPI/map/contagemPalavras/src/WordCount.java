import java.util.HashMap;
import java.util.Map;

public class WordCount {
    Map<String,Integer> wordCount;

    public WordCount() {
        this.wordCount = new HashMap<>();
    }

    public void addWord(String name, Integer count){
        wordCount.put(name, count);
    }

    public void removeWord(String name){
        if (!wordCount.isEmpty()){
            wordCount.remove(name);
        }
    }

    public void displayWord(){
        System.out.println(wordCount);
    }

    public void findMostFrequentWord(){
        Integer frequentWordI = Integer.MIN_VALUE;
        String frequentWordS = null;
        if (!wordCount.isEmpty()){
            for (Map.Entry<String, Integer> w : wordCount.entrySet()){
                if (w.getValue() > frequentWordI){
                    frequentWordI = w.getValue();
                    frequentWordS = w.getKey();
                }
            }
        }
        System.out.println(frequentWordS + frequentWordI);
    }


}
