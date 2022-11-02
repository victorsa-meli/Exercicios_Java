import java.util.Scanner;
import java.util.Arrays;

public class matriz_metodoRapidoMedia {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

    float [][] matriz = new float[10][4];
    float [] arrayMedia= new float[10];
    float soma= 0, range = matriz[0].length;



        for(int i = 0 ; i < matriz.length; i++){
             for(int j = 0; j < matriz[0].length; j++){

                 System.out.println("Digite a nota "+(j+1)+" do Aluno "+(i+1));
                 matriz[i][j] = read.nextFloat();

                 soma += matriz[i][j];

            }
             arrayMedia[i] = (soma/range);
             soma=0;
        }

        for (int i = 0; i < arrayMedia.length; i++){
            System.out.println("A media das notas do Aluno "+(i+1)+" e:  "+arrayMedia[i]);

        }




    }
}
