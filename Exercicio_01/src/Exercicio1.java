import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args)
    {
        /*Faça um Programa que mostre a mensagem "Alo mundo" na tela*/
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        
        String helloWorld = "Hello Wolrd";

        for(int count =0; count < helloWorld.length(); count++)
        {
            System.out.print(helloWorld.charAt(count) + "\n");
        } 

        inputDatas.close();
    }
}
