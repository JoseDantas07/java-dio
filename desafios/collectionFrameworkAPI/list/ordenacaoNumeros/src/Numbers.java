import java.util.Comparator;

public class Numbers implements Comparable<Numbers>{
    private int number;

    public Numbers(int numero) {
        this.number = numero;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numero=" + number +
                '}';
    }

    @Override
    public int compareTo(Numbers n) {
        return Integer.compare(number,n.getNumber());
    }
}

class sortDescending implements Comparator<Numbers> {

    @Override
    public int compare(Numbers n1, Numbers n2) {
        return Integer.compare(n2.getNumber(), n1.getNumber());
    }
}