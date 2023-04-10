import java.util.Scanner;
import java.util.Locale;

public class Exercicio9 {
    public static void main(String[] args)
    {
        /*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).*/
        double fahrenheit = 0.0, celsius = 0.0;

        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);

        System.out.println("Digite o valor em Fahrenheit para converter em Celsius: ");
        fahrenheit = inputDatas.nextDouble();

        celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.printf("Valor convertido de Fahrenheit para Celsius é de: %.2f%n", celsius);
 
        inputDatas.close();
    }
}
