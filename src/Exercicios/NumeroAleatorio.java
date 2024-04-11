package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int palpite = 0;

        while (palpite != numero) {
            System.out.println("Adivinhe o numero aleatório: ");
            palpite = leitura.nextInt();

            if (palpite > numero) {
                System.out.println("O número é menor");
            }

            if (palpite < numero) {
                System.out.println("O número é maior");
            }

            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            }
        }
    }
}


//public class JogoAdivinhacao {
//
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
//        int tentativas = 0;
//        int numeroDigitado = 0;
//
//        while (tentativas < 5) {
//            System.out.print("Digite um número entre 0 e 100: ");
//            int numeroDigitado = leitor.nextInt();
//            tentativas++;
//
//            if (numeroDigitado == numeroGerado) {
//                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
//                break; // interrompe o loop while
//            } else if (numeroDigitado < numeroGerado) {
//                System.out.println("O número digitado é menor que o número gerado.");
//            } else {
//                System.out.println("O número digitado é maior que o número gerado.");
//            }
//        }
//
//        if (tentativas == 5 && numeroDigitado != numeroGerado) {
//            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
//        }
//    }
//}
