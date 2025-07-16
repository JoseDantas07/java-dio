package map.ordenacaoMap;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EventsCalendar eventsCalendar = new EventsCalendar();

        int option;


        do {
            System.out.println("Calendario de evento");
            System.out.println("[1] Adicionar evento");
            System.out.println("[2] Exibir agenda");
            System.out.println("[3] obter proximo evento");
            System.out.println("[4] Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 ->{
                    System.out.println("Digite o yyyy-MM-dd do evento");
                    String unformattedDate = scanner.nextLine();
                    LocalDate date = LocalDate.parse(unformattedDate);

                    System.out.println("Digite o nome do evento");
                    String name = scanner.nextLine();

                    System.out.println("Digite a atração do evento");
                    String attraction = scanner.nextLine();

                    eventsCalendar.addEvent(date,name,attraction);
                }
                case 2 -> eventsCalendar.displayAgenda();
                case 3 -> eventsCalendar.getNextEvent();
            }
        }while (option != 0);

    }
}
