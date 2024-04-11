package Exercicios;

public class WeatherConvert {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 36;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;

        String mensagem = String.format("A temperatura de %f em Celsius é equivalente a %d em Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheitInteira);

        System.out.println(mensagem);
    }
}
