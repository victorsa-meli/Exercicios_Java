import java.util.Scanner;

public class contador_numerosParesImpares {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1, pares = 0, impares = 0;


        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o numero: ");
            n1 = read.nextInt();

            if (n1 % 2 == 0) {
                pares++;
            }
            if (n1 % 2 == 1) {
                impares++;
            }

            System.out.println("Total de numeros pares: "+pares);
            //CREDITOS RALPH//
            System.out.println("Total de numeros impares: "+impares);



        }
    }
}