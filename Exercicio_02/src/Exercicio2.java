import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args)
    {
        /*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].*/
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int number =  inputDatas.nextInt();

        System.out.printf("O número informado foi: %d%n", number);


        inputDatas.close();
    }    
}

