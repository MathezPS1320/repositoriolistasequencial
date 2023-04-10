import java.util.Scanner;
import java.util.Locale;


public class Exercicio5
{
    public static void main(String[] args)
    {
        /*Faça um Programa que converta metros para centímetros.*/
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        double meters = 0.0, centimeters = 0.0;

        System.out.println("Digite um valor em metros para ser convertidos em centímetros: ");
        meters = inputDatas.nextDouble();
        
        centimeters = meters / 100;

        System.out.printf("Valor convertido para:%.2f centimentros. %n", centimeters);

        inputDatas.close();
    }
}