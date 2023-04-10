import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 
{
    public static void main(String[] args)
    {
        /*Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. */ 
        double squardArea, baseSquard =0.0, heightSquard = 0.0;
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);    

        System.out.println("Sistema para calcular a área de um quadrado: ");

        System.out.print("Informe a base do quadrado: ");
        baseSquard = inputDatas.nextDouble();

        System.out.print("Informe a altura do quadrado: ");
        heightSquard = inputDatas.nextDouble();
        
        squardArea  = ((baseSquard * heightSquard) * 2);

        System.out.printf("Resultado da área, com base no seu dobro: %.2f%n", squardArea);

        inputDatas.close();
    }

}

