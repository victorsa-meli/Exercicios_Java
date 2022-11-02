import java.util.Scanner;

@SuppressWarnings("ALL")
public class array_InserirEArmazenar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um numero: ");
            array[i] = read.nextInt();
        }


        System.out.println("Numeros nos indices impares : ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {

                System.out.println(array[i]);


            }
        }

        System.out.println("Numeros nos indices pares : ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {

                System.out.println(array[i]);


            }
        }

        System.out.println("Numeros pares do array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                System.out.println(array[i]);


            }
        }

        System.out.println("Numeros impares do array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {

                System.out.println(array[i]);


            }
        }

        System.out.println("A soma de todos os elementos do Vetor: ");
        int soma = 0;
        float media = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];

            media = (soma/array.length);

        }
        System.out.println(soma);

        System.out.println("A media dos elementos dos Vetores: "+media);
        }
    }

