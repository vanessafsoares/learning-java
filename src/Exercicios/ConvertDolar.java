package Exercicios;

public class ConvertDolar {
    public static void main(String[] args) {
        double valorEmDolares = 100.00;
        double taxaDeConversao = 5.07;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}
