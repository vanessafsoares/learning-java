import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento do filme?");
        int ano = leitura.nextInt();

        System.out.println("Qual a nota do filme?");
        double nota = leitura.nextDouble();

        System.out.println("Seu filme favorito é " + filme + ", lançado em " + ano + " com nota " + nota);
    }
}
