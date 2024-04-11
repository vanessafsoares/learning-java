package Exercicios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                          Digite 1 para calcular a área do quadrado
                          Digite 2 para calcular a área do circulo
                          Digite 3 para sair: 
                          """;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println(menu);
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (opcao == 2) {
                System.out.print("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (opcao == 3){
                System.out.println("Programa encerrado!");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}
