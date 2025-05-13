import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        String input = "";
        boolean isInputing = true;

        Carro fuscaAzul = new Carro();
        while (isInputing) {
            System.out.println("\nOs comandos são os seguintes:\n| ligar o carro | desligar o carro| acelerar |\n" +
                    "| diminuir velocidade | virar para esquerda | virar para direita |\n| verificar velocidade | trocar a marcha |");
            input = sc.next();
            input.toLowerCase();
            isInputing = false;
            switch (input) {
                case "consultar saldo":
                    bankAccount.checkBalance();
                    isInputing = true;
                    oldInput = input;
                    break;
                case "consultar cheque":
                    bankAccount.checkSpecialCheck();
                    isInputing = true;
                    oldInput = input;
                    break;
                case "depositar":
                    System.out.println("Insira o valor a depositar");
                    float value = sc.nextFloat();
                    bankAccount.deposit(value);
                    isInputing = true;
                    oldInput = input;
                    break;
                case "sacar":
                    System.out.println("Insira o valor a sacar");
                    float value1 = sc.nextFloat();
                    bankAccount.withdraw(value1);
                    isInputing = true;
                    oldInput = input;
                    break;
                case "pagar boleto":
                    System.out.println("Insira o valor do boleto");
                    float value2 = sc.nextFloat();
                    bankAccount.payBill(value2);
                    isInputing = true;
                    oldInput = input;
                    break;
                case "verificar cheque":
                    bankAccount.usingSpecialCheck();
                    isInputing = true;
                    oldInput = input;
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