import exceptions.ValidadeEmailException;
import exceptions.ValidadeNameException;
import exceptions.ValidateCpfException;
import functions.Bank;
import functions.CurrentAccount;
import functions.savingsAccount;
import visual.BankInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValidateCpfException validateCpfException = new ValidateCpfException();
        ValidadeEmailException validadeEmailException = new ValidadeEmailException();
        ValidadeNameException validadeNameException = new ValidadeNameException();

        BankInterface bankInterface = new BankInterface();
        Bank contaCorrete = new CurrentAccount();
        Bank contaPoupanca = new savingsAccount();

        int option;
        int optionLogin;
        boolean finish = true;
        int account;


        while (finish) {
            do {
                bankInterface.displayLogin();
                optionLogin = scanner.nextInt();
            } while (optionLogin < 1 || optionLogin > 2);
            do {
                bankInterface.displayAccount();
                account = scanner.nextInt();
            } while (account < 1 || account > 2);

            scanner.nextLine();
            switch (optionLogin) {
                case 1 -> {
                    switch (account) {
                        case 1 -> {
                            do {
                                try {
                                    System.out.println("Digite o seu nome");
                                    validadeNameException.validadeName(scanner.nextLine());
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                            } while (validadeNameException.isFinish());

                            do {
                                try {
                                    System.out.println("Digite o seu cpf");
                                    validateCpfException.ValidateCpf(scanner.nextLine());
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                            } while (validateCpfException.isFinish());

                            contaCorrete.loginUser(validadeNameException.getName(), validateCpfException.getCpf());

                            while (!contaCorrete.isFinish()) {
                                while (finish){
                                    bankInterface.displayMenu();
                                    option = scanner.nextInt();

                                    switch (option) {
                                        case 1 -> {
                                            System.out.println("Digite o valor que quer depositar");
                                            double value = scanner.nextDouble();
                                            contaCorrete.deposit(value);
                                        }
                                        case 2 -> {
                                            System.out.println("Digite o valor que quer retirar");
                                            double value = scanner.nextDouble();
                                            contaCorrete.sake(value);
                                        }
                                        case 3 -> contaCorrete.displayBalance();
                                        case 0 -> {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        case 2 -> {
                            //conta poupança
                            do {
                                try {
                                    System.out.println("Digite o seu nome");
                                    validadeNameException.validadeName(scanner.nextLine());
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                            } while (validadeNameException.isFinish());

                            do {
                                try {
                                    System.out.println("Digite o seu cpf");
                                    validateCpfException.ValidateCpf(scanner.nextLine());
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                }
                            } while (validateCpfException.isFinish());

                            contaPoupanca.loginUser(validadeNameException.getName(), validateCpfException.getCpf());

                            while (!contaPoupanca.isFinish()) {
                                while (finish){
                                    bankInterface.displayMenu();
                                    option = scanner.nextInt();

                                    switch (option) {
                                        case 1 -> {
                                            System.out.println("Digite o valor que quer depositar");
                                            double value = scanner.nextDouble();
                                            contaPoupanca.deposit(value);
                                        }
                                        case 2 -> {
                                            System.out.println("Digite o valor que quer retirar");
                                            double value = scanner.nextDouble();
                                            contaPoupanca.sake(value);
                                        }
                                        case 3 -> contaPoupanca.displayBalance();
                                        case 0 -> {
                                            return;
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
                case 2 -> {
                    do {
                        try {
                            System.out.println("Digite o seu nome");
                            validadeNameException.validadeName(scanner.nextLine());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (validadeNameException.isFinish());

                    do {
                        try {
                            System.out.println("Digite o seu cpf");
                            validateCpfException.ValidateCpf(scanner.nextLine());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (validateCpfException.isFinish());

                    do {
                        try {
                            System.out.println("Digite o seu email");
                            validadeEmailException.validadeEmail(scanner.nextLine());
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (validadeEmailException.isFinish());

                    if (account == 1) {
                        contaCorrete.addUser(validadeNameException.getName(), validateCpfException.getCpf(), validadeEmailException.getEmail());
                    } else {
                        contaPoupanca.addUser(validadeNameException.getName(), validateCpfException.getCpf(), validadeEmailException.getEmail());
                    }

                }
            }
        }
    }
}