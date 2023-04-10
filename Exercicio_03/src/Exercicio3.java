import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args)
    {
        /*Faça um Programa que peça dois números e imprima a soma.*/
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
         
        System.out.println("Informe dois número inteiros: ");
        double numberOne = inputDatas.nextInt();
        double numberTwo = inputDatas.nextInt();

        double sum = ((numberOne + numberTwo) / 2);

        System.out.printf("A média dos números digitados é: %.2f%n", sum);

        inputDatas.close();
    }
}
