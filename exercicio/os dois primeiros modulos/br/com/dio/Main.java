package br.com.dio;

import br.com.dio.dao.UserDao;
import br.com.dio.exception.EmptyStorageException;

import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private final static UserDao dao = new UserDao();
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Bem vindo ao cadastro de usuarios selecione a operação desejada");
            System.out.println("1 - cadastrar");
            System.out.println("2 - atualizar");
            System.out.println("3 - excluir");
            System.out.println("4 buscar por identificador");
            System.out.println("5 - listar");
            System.out.println("6 - sair");
            var userInput = sc.nextInt();
            var selectOption = MenuOption.values()[userInput -1];
            switch (selectOption){
                case Save -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("usuario cadastrado %s", user);
                }
                case Update -> {
                    try {
                        var user = dao.save(requestToUpdate());
                        System.out.printf("usuario atualizado %s ", user);
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case Delete -> {
                    try {
                        dao.delete(requestId());
                        System.out.println("usuario ecluido");
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }finally {
                        System.out.println("=====================");
                    }
                }
                case Find_By_Id -> {
                    try{
                        var id = requestId();
                        var users = dao.findById(id);
                        System.out.printf("usuario com id  %s", id);
                        System.out.println(users);
                    }catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case Find_All -> {
                    var users = dao.findAll();
                    System.out.println("usuarios cadastrados");
                    users.forEach(System.out::println);
                }
                case Exit -> System.exit(0);
            }
        }
    }

    private  static long requestId(){
        System.out.println("digite o identificador do usuario");
        return sc.nextLong();
    }

    private static UserModel requestToSave(){
        System.out.println("informe o nome do usuario");
        var name = sc.next();
        System.out.println("informe o e-mail do usuario");
        var email = sc.next();
            System.out.println("informe a data de nascimento do usuario (dd/mm/yyyy)");
            var birthdayString = sc.next();
            var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            var birthday = LocalDate.parse(birthdayString, formatter);
            return new UserModel(0, name, email, birthday);
    }

    private static UserModel requestToUpdate(){
        System.out.println("digite o identificador do usuario");
        var id =sc.nextLong();
        System.out.println("informe o nome do usuario");
        var name = sc.next();
        System.out.println("informe o e-mail do usuario");
        var email = sc.next();
        System.out.println("informe a data de nascimento do usuario (dd/mm/yyyy)");
        var birthdayString = sc.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        return new UserModel(id,name,email,birthday);
    }
}
