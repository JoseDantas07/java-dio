import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();

        int option;

        do {
            System.out.println("Gerenciamento de aluno");
            System.out.println("[1] Adicionar aluno");
            System.out.println("[2] Remover aluno");
            System.out.println("[3] Exibir alunos por nome");
            System.out.println("[4] Exibir alunos por nota");
            System.out.println("[5] Exibir alunos");
            System.out.println("[0] Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 ->{
                    System.out.println("Digite o nome do aluno");
                    String name = scanner.nextLine();

                    System.out.println("Digite o numero da matricula");
                    long registration = scanner.nextLong();

                    System.out.println("Digite a media do aluno");
                    int average = scanner.nextInt();

                    studentManager.addStudent(name,registration,average);
                }
                case 2 ->{
                    System.out.println("Digite o numero da matricula");
                    long registration = scanner.nextLong();

                    studentManager.removeStudent(registration);
                }
                case 3 -> System.out.println(studentManager.displayStudentByName());
                case 4 -> System.out.println(studentManager.diplayStudentByGrade());
                case 5 -> studentManager.displayStudent();
            }
        }while (option != 0);
    }
}