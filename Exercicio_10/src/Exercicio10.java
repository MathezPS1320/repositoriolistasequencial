import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 
{
    public static void main(String[] args)
    {
        /*Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.*/
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        double celsius = 0.0, fahrenheit = 0.0; 

        System.out.println("Digite o valor em Celsius: ");
        celsius = inputDatas.nextDouble();

        fahrenheit = ((celsius * 1.8) + 32);
        System.out.printf("Converter Celsius para Fahrenheit: %.2f F° ", fahrenheit);

        inputDatas.close();
    }

}
