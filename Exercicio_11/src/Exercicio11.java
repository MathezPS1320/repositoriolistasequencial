import java.util.Locale;
import java.util.Scanner;

public class Exercicio11
{
    public static void  main(String[] args)
    {
        /*
            Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
            o produto do dobro do primeiro com metade do segundo .
            a  soma do triplo do primeiro com o terceiro.
            o terceiro elevado ao cubo. 
        */
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        
        System.out.println("Digite dois números inteiros");
        int interger1 = inputDatas.nextInt();
        
        System.out.println("Digite dois números inteiros");
        int interger2 = inputDatas.nextInt();

        System.out.println("Digite dois números real");
        double double2 = inputDatas.nextDouble();

        double total = ((interger1 * 2) * (interger2 / 2));
        System.out.println(total);

        total = ((interger1 * 3) + double2);
        System.out.println(total);

        total = Math.pow(double2, 3);
        System.out.println(total);

        inputDatas.close();
    }
}
