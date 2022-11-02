import java.util.Scanner;

public class vetor_InteirosNaoOrdenados {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int [] array = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int pos;
        int verify = 0;


        System.out.println("Informe um numero: ");
        pos = read.nextInt();


        for (int i = 0 ; i < array.length; i++){

            if(pos != array[i]){
                verify++;

                if (verify == array.length){
                    System.out.println(" Numero "+pos+" Nao encontrado");
                    break;
                }


            }

            if (pos == array[i]){
                System.out.println("O numero "+pos+" Esta localizado na posicao "+i);
                break;

            }
        }



    }
}
