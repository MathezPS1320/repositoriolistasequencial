import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 
{
    public static void main(String[] args)
    {
        /*
        Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        Para homens: (72.7*h) - 58
        Para mulheres: (62.1*h) - 44.7
        */
        Locale.setDefault(Locale.US);
        Scanner  inputDatas = new Scanner(System.in);

        System.out.println("Gostaria de saber qual o seu peso ideal ? Digite o seu sexo F ou M");
        char sexo = inputDatas.next().charAt(0);
        double total = 0.0, altura = 0.0;

        System.out.println("Digite sua altura: ");

        if(sexo == 'M' || sexo =='m')
        {                       
            altura = inputDatas.nextDouble();
            total = ((72.7 * altura) - 58);           

        }else if(sexo == 'F' || sexo == 'f')
        {        
            altura = inputDatas.nextDouble();
            total = ((62.1 * altura) - 58);          
        }

        System.out.println(total);
       
        inputDatas.close();
    }
}
