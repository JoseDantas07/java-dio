package Interfaces_Lambda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User > user = List.of(new User("maria", 18), new User("jose",20 ),new User("gabriel", 15), new User("ana", 19));
        user.forEach(System.out::println);
    }

}
