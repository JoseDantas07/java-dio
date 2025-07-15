import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        TaskList taskList = new TaskList();

        int option;

        do {
            System.out.println("Lista de tarefa");
            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Remover tarefa");
            System.out.println("[3] Exibir tarefas");
            System.out.println("[4] Contar tarefas");
            System.out.println("[5] Obter tarefas concluidas");
            System.out.println("[6] Obter tarefas pendentes");
            System.out.println("[7] Marcar tarefa concluida");
            System.out.println("[8] Marcar tarefa pendente");
            System.out.println("[9] Limpar lista tarefas");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> {
                    System.out.println("Digite o nome da tarefa");
                    String name = scanner.nextLine();

                    System.out.println("Digite a descrição da tarefa");
                    String description = scanner.nextLine();

                    taskList.addTask(name,description);
                }
                case 2 ->{
                    System.out.println("Digite a descrição da tarefa para remover");
                    String description = scanner.nextLine();

                    taskList.removeTask(description);
                }
                case 3 -> taskList.displayTask();
                case 4 -> taskList.countTasks();
                case 5 -> taskList.getCompletedTasks();
                case 6 -> taskList.getPendingTasks();
                case 7 -> {
                    System.out.println("Digite a descrição da tarefa para Concluir");
                    String description = scanner.nextLine();

                    taskList.markTaskCompleted(description);
                }
                case 8 ->{
                    System.out.println("Digite a descrição da tarefa para deixa como pedente");
                    String description = scanner.nextLine();

                    taskList.markPendingTask(description);
                }
                case 9 -> taskList.clearTaskList();
            }
        }while (option != 0);

    }
}