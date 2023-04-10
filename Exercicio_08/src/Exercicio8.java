import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args)
    {
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        double workedHours = 0.0, hourWorkedInTheMonth = 0.0;

        System.out.println("Quanto você ganha por hora e o número de horas trabalhadas no mês: ");
        System.out.printf("Informe quanto você ganha por hora: ");
        workedHours = inputDatas.nextDouble();

        System.out.printf("Informe as horas trabalhadas no mês: ");
        hourWorkedInTheMonth = inputDatas.nextDouble();

        double wage = workedHours * hourWorkedInTheMonth;

        System.out.printf("Valor do salário de acordo com as horas trabalhadas: %.2f%n", wage);

        inputDatas.close();
    }
}
