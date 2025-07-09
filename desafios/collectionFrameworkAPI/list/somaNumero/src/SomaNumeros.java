import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Numeros> numerosList;

    public SomaNumeros() {
        numerosList = new ArrayList<>();
    }

    public void addNumber(int numero) {
        this.numerosList.add(new Numeros(numero));
    }

    public void calculateSum(){
        int n1;
        int n2 = 0;
        for (Numeros n : numerosList){
            n1 = n.getNumeros();
            n2 += n1;
        }
        System.out.println("a soma total foi :" + n2);
    }

    public void findLargestNumber(){
        int n1 = 0;
        for (Numeros n : numerosList){
            if (n.getNumeros() > n1){
                n1 = n.getNumeros();
            }
        }
        System.out.println("o maior numero encontrado foi o :" + n1);
    }

    public void findSmallestNumber(){
        int n1 = numerosList.getFirst().getNumeros();
        for (Numeros n : numerosList){
            if (n.getNumeros() < n1){
                n1 = n.getNumeros();
            }
        }
        System.out.println("o menor numero encontrado foi o :" + n1);
    }

    public void displayNumbers(){
        System.out.println(numerosList);
    }

}
