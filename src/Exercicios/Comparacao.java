package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Comparacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean validInput;

        do {
            validInput = true;
            try {
                System.out.print("Digite o primeiro número: ");
                numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                numero2 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next(); // discard the invalid input
                validInput = false;
            }
        } while (!validInput);

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}