import functions.Google;
import functions.Spotify;
import functions.Telephone;
import visual.IphoneScreen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Spotify spotify = new Spotify();
        Telephone telephone = new Telephone();
        Google google = new Google();

        int option;
        int funcao;

        do {
            IphoneScreen.screen();
            option = scanner.nextInt();


        switch (option) {
            case 1 -> {
                do {
                    IphoneScreen.spotifyScreen();
                    funcao = scanner.nextInt();

                    if (funcao == 1) {
                        System.out.println(spotify.playMusic());
                    } else if (funcao == 2) {
                        System.out.println(spotify.pauseMusic());
                    } else if (funcao == 3) {
                        System.out.println(spotify.selectMusic());
                    }
                }while (funcao != 0);
            }
            case 2 -> {
                do {
                    IphoneScreen.telephoneScreen();
                    funcao = scanner.nextInt();

                    if (funcao == 1) {
                        System.out.println(telephone.toCall());
                    } else if (funcao == 2) {
                        System.out.println(telephone.toMeet());
                    } else if (funcao == 3) {
                        System.out.println(telephone.startVoiceMail());
                    }
                }while (funcao != 0);
            }
            case 3 -> {
                do {
                    IphoneScreen.googleScreen();
                    funcao = scanner.nextInt();

                    if (funcao == 1) {
                        System.out.println(google.displayPage());
                    } else if (funcao == 2) {
                        System.out.println(google.addNewTab());
                    } else if (funcao == 3) {
                        System.out.println(google.refreshPage());
                    }
                }while (funcao != 0);
            }
            case 0 -> {
                System.out.println("Desligando...");
                return;
            }
        }
        }while (option != 0);
    }
}