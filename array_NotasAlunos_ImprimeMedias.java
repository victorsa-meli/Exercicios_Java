import java.util.Scanner;

public class array_NotasAlunos_ImprimeMedias {
    public static void main(String[] args) {

        Scanner read   = new Scanner(System.in);
        float [][] array = new float[10][4];
        float [] array2 = new float[10];
        float soma = 0, media= 0, range= 0;
        float aux1,aux2,aux3,aux4;


        // percorre o array e in sere os numeros digitados pelo usuario.
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){

                System.out.println(" Digite a nota: ");
                array[i][j]= read.nextFloat();
                range = array[j].length;

                    }
        }
        // inicializando variaveis.
        aux1 = 0;  aux2 = 0;  aux3 = 0;  aux4 = 0;
        media= 0;


        // ALUNO linha 0
        aux1 = array[0][0];
        aux2 = array[0][1];
        aux3 = array[0][2];
        aux4 = array[0][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[0]= media;

        // ALUNO linha 1
        aux1 = array[1][0];
        aux2 = array[1][1];
        aux3 = array[1][2];
        aux4 = array[1][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[1]= media;

        // ALUNO linha 2
        aux1 = array[2][0];
        aux2 = array[2][1];
        aux3 = array[2][2];
        aux4 = array[2][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[2]= media;

        // ALUNO linha 3
        aux1 = array[3][0];
        aux2 = array[3][1];
        aux3 = array[3][2];
        aux4 = array[3][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[3]= media;


        // ALUNO linha 4
        aux1 = array[4][0];
        aux2 = array[4][1];
        aux3 = array[4][2];
        aux4 = array[4][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[4]= media;


        // ALUNO linha 5
        aux1 = array[5][0];
        aux2 = array[5][1];
        aux3 = array[5][2];
        aux4 = array[5][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[5]= media;

        // ALUNO linha 6
        aux1 = array[6][0];
        aux2 = array[6][1];
        aux3 = array[6][2];
        aux4 = array[6][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[6]= media;

        // ALUNO linha 7
        aux1 = array[7][0];
        aux2 = array[7][1];
        aux3 = array[7][2];
        aux4 = array[7][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[7]= media;

        // ALUNO linha 8
        aux1 = array[8][0];
        aux2 = array[8][1];
        aux3 = array[8][2];
        aux4 = array[8][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[8]= media;


        // ALUNO linha 9
        aux1 = array[9][0];
        aux2 = array[9][1];
        aux3 = array[9][2];
        aux4 = array[9][3];

        soma = aux1 + aux2 + aux3 + aux4;
        media = soma / range;

        array2[9]= media;


        for (float v : array2) System.out.println(v);




        }

    }

