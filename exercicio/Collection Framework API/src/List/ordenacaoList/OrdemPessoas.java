package List.ordenacaoList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdemPessoas {
    List<People> pessoaList;

    public OrdemPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPeople (String name, int age, double height){
        pessoaList.add(new People(name,age,height));
    }

    public List<People> sortByAge(){
        List<People> oderAge = new ArrayList<>(pessoaList);
        Collections.sort(oderAge);
        return oderAge;
    }

    public List<People> sortByHeight(){
        List<People> oderAge = new ArrayList<>(pessoaList);
        Collections.sort(oderAge, new sortByHeight());
        return oderAge;
    }
}
