import java.util.HashSet;
import java.util.Set;

public class SetUniqueWords {
    Set<Word> wordSet;

    public SetUniqueWords() {
        this.wordSet = new HashSet<>();
    }

    public void addWord(String word){
        wordSet.add(new Word(word));
    }

    public void removeWord(String word){
        Word wordForRemove = null;
        for (Word w : wordSet){
            if (w.getWorld().equalsIgnoreCase(word)){
                wordForRemove = w;
                break;
            }
        }
        wordSet.remove(wordForRemove);
    }

    public Word checkWord(String word){
        Word wordChecked = null;
        for (Word w : wordSet){
            if (w.getWorld().equalsIgnoreCase(word)){
                wordChecked = w;
                break;
            }
        }
        return wordChecked;
    }

    public void displayUniqueWords(){
        System.out.println(wordSet);
    }
}
