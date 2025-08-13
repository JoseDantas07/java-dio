import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setNome("Java");
        cursoJava.setDescricao("Java para iniciantes");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoriapython = new Mentoria();
        mentoriapython.setNome("Python");
        mentoriapython.setDescricao("Python para iniciantes");
        mentoriapython.setDate(LocalTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Aprendendo varias linguagem");
        bootcamp.setDescricao("Java,Python");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriapython);

        Dev jose = new Dev();
        jose.setNome("jose");
        jose.inscreverBootcamp(bootcamp);
        System.out.println(jose.getConteudosInscritos());

    }
}