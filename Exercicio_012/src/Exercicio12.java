import java.util.Locale;
import java.util.Scanner;

public class Exercicio12
{
    public static void main(String[] args)
    {
        /*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 */
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        
        double total = 0.0, altura = 0.0;

        System.out.println("Digite sua altura: ");
        altura = inputDatas.nextDouble();      

        total = ((72.7 * altura) - 58);           

        System.out.println(total);
 
        inputDatas.close();
    }
}
