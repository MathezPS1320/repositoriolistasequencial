import java.util.Scanner;
import java.util.Locale;

public class Exercicio16
{
    public static void main(String[] args)
    {
        /*          
          Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
          Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, 
          que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.      
               
         */
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
       
        int VALOR_METROS_POR_LATA = 54;

        /* Variáveis */
        double quantidadesDeLatasEmTintas = 0, metrosQuadrados = 0.0, valorTotal = 0.0, VALOR_LATA = 80.00;;
        System.out.println("Metros quadrados da área: ");

        metrosQuadrados = inputDatas.nextDouble();

        quantidadesDeLatasEmTintas = Math.ceil(metrosQuadrados / VALOR_METROS_POR_LATA);

        valorTotal = Math.ceil(quantidadesDeLatasEmTintas * VALOR_LATA);

        System.out.printf("Quantidade de latas de tintas: %.2f%n", quantidadesDeLatasEmTintas);

        System.out.printf("Preço total: %.2f%n", valorTotal);

        inputDatas.close();
    }
}