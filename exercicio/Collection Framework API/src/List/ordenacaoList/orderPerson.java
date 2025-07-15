package List.ordenacaoList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class orderPerson {
    List<People> pessoaList;

    public orderPerson() {
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
