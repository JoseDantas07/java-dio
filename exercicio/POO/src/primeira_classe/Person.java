package primeira_classe;

import java.time.OffsetDateTime;

public class Person {

    private String name;

    private int age;

    private int LastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name){
        this.name = name;
        age = 1;
    }

    /**
     * public Person(String name,int age){
     *         this.name = name;
     *         this.age = age;
     *     }
     */


    public String getName(){
        return name;
    }


    public int getAge(){
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }



    public void incAge(){
        if(this.LastYearAgeInc >= OffsetDateTime.now().getYear()){
            return;
        }
        this.age ++;
        this.LastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
