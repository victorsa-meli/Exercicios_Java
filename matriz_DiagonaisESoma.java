import java.util.Scanner;

public class matriz_DiagonaisESoma {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);



        int [][]matriz = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        // primeiro for cria um codigo para ler o primeiro vetor.


        int soma = 0;
        int aux1= 0, aux2= 0, aux3= 0;
        int aux4=0, aux5=0, aux6=0;
                    // For criado para ler a diagonal principal.
            for(int i = 0; i <matriz.length ; i++) {
                    // o segundo for cria um codigo para ler o segundo vetor linkando com o primeiro atravez do comando (matriz[i])

            for (int j = 0; j < matriz[i].length; j++) {

 /*

                System.out.println("\n"+"Linha "+ i +" Coluna "+  j);
                System.out.println("\n"+ matriz[i][j]);

                codigo para ler a diagonal principal.

*/
                if (i == 0 && j == 0) {
                    aux1 = matriz[i][j];
                }
                if (i == 1 && j == 1) {
                    aux2 = matriz[i][j];
                }
                if (i == 2 && j == 2) {
                    aux3 = matriz[i][j];
                }

                }
            }
        System.out.println("\nElementos da diagonal principal: \n"+aux1+" "+aux2+" "+aux3);
            soma = aux1 + aux2 + aux3;
        System.out.println("\nA soma dos elementos da diagonal principal: "+soma);
        // For criado para ler a diagonal secundaria.
        for(int i = 0; i <matriz.length ; i++){
            // o segundo for cria um codigo para ler o segundo vetor linkando com o primeiro atravez do comando (matriz[i])
            for (int j = 0; j < matriz[i].length; j++){

 /*

                System.out.println("\n"+"Linha "+ i +" Coluna "+  j);
                System.out.println("\n"+ matriz[i][j]);

                codigo para ler a diagonal principal.

*/
                if(i == 0 && j == 2){
                    aux4 = matriz[i][j];
                }
                if(i == 1 && j == 1){
                    aux5 =matriz[i][j];
                }
                if(i == 2 && j == 0){
                    aux6 =matriz[i][j];
                }

            }
        }
        System.out.println("\nElementos da diagonal secundaria: \n"+aux4+" "+aux5+" "+aux6);
        soma = 0;
        soma = aux4 + aux5 + aux6;
        System.out.println("\nA soma dos elementos da diagonal secundaria: "+soma);




    }


}
