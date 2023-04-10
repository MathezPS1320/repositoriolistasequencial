import java.util.Locale;
import java.util.Scanner; 

public class Exercicio15 
{
    public static void main(String[] args)
    {
        /*
        Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
        8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        salário bruto.
        quanto pagou ao INSS.
        quanto pagou ao sindicato.
        o salário líquido.
        calcule os descontos e o salário líquido, conforme a tabela abaixo:
        */

        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);

        double valuePerHour  = 0.0, 
        hoursWorkedInTheMonth = 0.0,
        totalGrossAmount = 0.0, 
        incomeTaxDiscount = 0.0, 
        discontTaxInss = 0.0,
        discontSyndicate = 0.0,
        salaryNet = 0.0;


        System.out.println("Quanto você ganha por hora: ?");
        valuePerHour = inputDatas.nextDouble();

        System.out.println("Horas trabalhadas no mês: ?");
        hoursWorkedInTheMonth = inputDatas.nextDouble();

        totalGrossAmount = valuePerHour  * hoursWorkedInTheMonth;
        
        incomeTaxDiscount = calculateIncomeTaxDiscount(totalGrossAmount);
        discontTaxInss    = calculateDiscontTaxInss(totalGrossAmount);
        discontSyndicate  = calculateDiscontSyndicate(totalGrossAmount);
    
        salaryNet = ((incomeTaxDiscount + discontTaxInss + discontSyndicate) - totalGrossAmount);
    
        System.out.printf("Salario Bruto: %.2f%n", totalGrossAmount);
        System.out.printf("Valor descontado do Ir: %.2f%n", incomeTaxDiscount);
        System.out.printf("Valor descontato pelo INSS: %.2f%n", discontTaxInss);
        System.out.printf("Valor descontado pelo Sindicato:%.2f%n", discontSyndicate);
        System.out.printf("Valor do salário em líquido: %.2f%n", Math.abs(salaryNet));
 
        inputDatas.close();
    }    

    public static double calculateIncomeTaxDiscount(double totalGrossAmount)
    {
        return ((totalGrossAmount * 11.0) / 100);
    }

    public static double calculateDiscontTaxInss (double totalGrossAmount)
    {
        return ((totalGrossAmount * 8.0) / 100);
    }

    public static double calculateDiscontSyndicate(double totalGrossAmount)
    {
        return ((totalGrossAmount * 5.0) / 100);
    }
}
