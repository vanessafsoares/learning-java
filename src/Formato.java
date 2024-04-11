public class Formato {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String name = "João";
        int aulas = 4;

        String mensagem = """
                      Olá, %s!
                      Boas vindas ao curso de Java.
                      Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                      """.formatted(name, aulas);

        System.out.println(mensagem);
    }

}
