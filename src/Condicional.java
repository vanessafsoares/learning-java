public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme lançado em 2022 ou depois");
        } else {
            System.out.println("Filme lançado antes de 2022");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme incluído no plano");
        } else {
            System.out.println("Filme não incluído no plano");
        }

    }
}
