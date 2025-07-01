package functions;

import java.util.Scanner;

public non-sealed class FamilyTicket extends Cinema {
    private int people;

    public void howManyPeople(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("São quantas pessoas ?");
        System.out.println("Se for maior que 3 pessoas você recebe um desconto de 5%");
        setPeople(scanner.nextInt());
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public double chooseTicketPrice() {
        if (getPeople() >= 3){
            return (getTicketPrice() * getPeople()) * 0.95 ;
        }else{
            return getTicketPrice() *getPeople();
        }

    }
}
