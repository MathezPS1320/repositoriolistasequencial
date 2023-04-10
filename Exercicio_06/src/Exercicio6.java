import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 
{
    public static void main(String[] args)
    {
        /*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);    

        double CONST_PI = 3.14159, 
        ray = 0.0,
        resultArea = 0.0;

        System.out.println("Informe o raio de um círculo: ");
        ray = inputDatas.nextDouble();

        resultArea = (CONST_PI * (ray * ray)); 

        System.out.printf("Valor da area: %.2f%n", resultArea);
        inputDatas.close();
    }
}


