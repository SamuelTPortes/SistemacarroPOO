import java.util.Scanner;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        String input = "";
        boolean isInputing = true;

        Carro fuscaAzul = new Carro();
        System.out.println("Você está dentro do carro. Ele está desligado, marcha 0 e com velocidade 0");
        while (isInputing) {
//            try {
//            Thread.sleep(1000);
//            } catch (InterruptedException e){
//                e.printStackTrace();
//            }
            System.out.println("\nOs comandos são os seguintes:\n 1.ligar carro \n 2.desligar carro \n 3.acelerar\n" +
                    " 4.desacelerar \n 5.virar para esquerda \n 6.virar para direita \n 7.verificar velocidade \n 8. trocar marcha ");
            input = sc.next();
            input.toLowerCase();
            isInputing = false;
            switch (input) {
                case "1":
                    fuscaAzul.turnOn();
                    isInputing = true;
                    break;
                case "2":
                    fuscaAzul.turnOff();
                    isInputing = true;
                    break;
                case "3":
                    fuscaAzul.accelerate();
                    isInputing = true;
                    break;
                case "4":
                    fuscaAzul.desAccelerate();
                    isInputing = true;
                    break;
                case "5":
                    fuscaAzul.turnLeft();
                    isInputing = true;
                    break;
                case "6":
                    fuscaAzul.turnRight();
                    isInputing = true;
                    break;
                case "7":
                    fuscaAzul.verifyVelocity();
                    isInputing = true;
                    break;
                case "8":
                    System.out.println("Gostaria de trocar para qual marcha?");
                    int gear = sc.nextInt();
                    fuscaAzul.changeGear(gear);
                    isInputing = true;
                    break;
                case "sair":
                    break;
                default:
                    isInputing = true;
                    break;
            }
        }
    }
    }