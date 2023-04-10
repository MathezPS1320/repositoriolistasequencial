import java.util.Scanner;
import java.util.Locale;

public class Exercicio4
{
    public static void main(String[] args)
    {
        /*Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);

        int REGISTER_FOUR_NOTES = 4;    

        double[] gradeStudent = new double[REGISTER_FOUR_NOTES];    
        double sumAverage = 0.0;      
        System.out.println("Informe as quatros notas do bimestre: ");

        for(int count = 0;  count < gradeStudent.length; count++)
        {
            System.out.println("Digite sua " + (count + 1) + "° nota: ");
            gradeStudent[count] = inputDatas.nextDouble();
            sumAverage +=  gradeStudent[count];
        }   
       
        sumAverage /= REGISTER_FOUR_NOTES;

        System.out.println("RESULTADO COLETADO SOBRE O ALUNO");    
        System.out.println("RELATÓRIO DE NOTAS E MÉDIA FINAL: ");

        for(int count = 0; count < gradeStudent.length; count++)
        {                
            System.out.println("Sua " + (count + 1) + "° nota: " + gradeStudent[count]);          
        }

        String resultFinal = (sumAverage > 7.0) ? "APROVADO COM SUCESSO": "REPROVADO, ESTUDE MAIS";
        System.out.printf("Sua média final é: %.2f, Situação do aluno: %s%n",sumAverage, resultFinal);

        inputDatas.close();
    }
}