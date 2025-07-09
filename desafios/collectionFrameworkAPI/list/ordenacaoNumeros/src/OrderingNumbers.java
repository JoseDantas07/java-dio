import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingNumbers {

    List<Numbers> numbersList;

    public OrderingNumbers() {
        this.numbersList = new ArrayList<>();
    }

    public void addNumber(int number){
        numbersList.add(new Numbers(number));
    }

    public List<Numbers> sortAscending(){
        List<Numbers> numberAscending = new ArrayList<>(numbersList);
        Collections.sort(numberAscending);
        return numberAscending;
    }

    public List<Numbers> sortDescending(){
        List<Numbers> numberDescending = new ArrayList<>(numbersList);
        Collections.sort(numberDescending,new sortDescending());
        return numberDescending;
    }
}
