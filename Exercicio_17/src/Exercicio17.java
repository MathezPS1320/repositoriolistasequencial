import java.util.Scanner;
import java.util.Locale;

public class Exercicio17
{
    public static void main(String[] args)
    {
        /*          
          Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
        Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        comprar apenas latas de 18 litros;
        comprar apenas galões de 3,6 litros;
        misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.               
         */
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        
        System.out.println("Informe com o tamanho da área: ");
        double area = inputDatas.nextDouble();
       
        double litros = area / 6 * 1.1,
        latas = (int) Math.ceil(litros / 18),
        valorDaLata = latas * 80, 
        galao = (int) Math.ceil(litros / 3.6),
        valorDoGalao = galao * 25,
        valorTotalMisturado = 0.0;


        double misturalatas  = (litros / 18),
        misturagaloes = (litros - misturalatas * 18) / 3.6 ;

        litros -= (misturalatas * 18) % 3.6;
        if(litros != 0)
        {
            misturagaloes +=1;
            valorTotalMisturado = (misturalatas * 80) + (misturagaloes * 25);
        }
        
        System.out.println("Se comprar apenas latas ficará " + Math.ceil(latas) + " custará " + Math.ceil(valorDaLata)) ;
        System.out.println("Se comprar apenas galões ficará " + Math.ceil(galao) + " custará " + Math.ceil(valorDoGalao) );
        System.out.println("Se quiser mesclar será " + " Latas "+ Math.round(misturalatas) + " Galões " + Math.round(misturagaloes) + " custará " + Math.ceil(valorTotalMisturado));

        inputDatas.close();
    }
}