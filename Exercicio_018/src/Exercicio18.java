import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner inputDatas = new Scanner(System.in);
        double fileSize = 0.0, download = 0.0, speed = 0.0;
        
        
        System.out.println("Informe o tamanho do arquivo para DOWNLOAD");
        fileSize = inputDatas.nextDouble();

        System.out.println("Informe a valocidade da internet");
        download = inputDatas.nextDouble();

        speed = ((fileSize / (download / 8.0)) / 60);

        System.out.printf("Tamanho do arquivo %.2f velocidade de link da  internet %.2f, tempo aproximado de download do arquivo: %.2f%n", 
        fileSize, download, speed);

        inputDatas.close();
    }
}