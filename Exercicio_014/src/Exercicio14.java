import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 
{
    public static void main(String[] args)
    {
        /*
         João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
         Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
         (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a 
         variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite
          e na variável multa o valor da multa que João deverá pagar. 
         Imprima os dados do programa com as mensagens adequadas. 
         */
        
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);

    
        System.out.println("Digite o peso do peixe: ");
        double pesoPeixe = inputDatas.nextDouble();

        if(pesoPeixe > 50.0)
        {
            double excesso = pesoPeixe - 50;
            double multa = excesso * 4.00;
            System.out.printf("VALOR DO EXCESSO DO PEIXE: %.2f VALOR DO PREÇO DA MUTA: %.2f%n", excesso, multa);               
        }else
        {
            System.out.println("Você não precisa pegar a multa: ");
        }

        inputDatas.close();
    }    
}
