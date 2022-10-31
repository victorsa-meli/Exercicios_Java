import java.util.Scanner;

public class valida_Inteiro_Maior {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, multi;

        System.out.println("Insira o primeiro numero: ");
        n1 = read.nextInt();
        System.out.println("Insira o segundo numero: ");
        n2 = read.nextInt();

            if (n1 >= n2 || n1 < 0 ){
                System.out.println("Intervalo Invalido");
            }


        System.out.println("Multiplos de 3 e 5 dentro do intervalo entre: "+n1+" e "+n2+" é: ");
            for(multi = n1; multi<= n2; multi++ ) {
                if (multi % 3 == 0 && multi % 5 == 0) {
                    System.out.println("\n"+multi);


                }
            }
        System.out.println("_________________________________________________________________________________");
        if (n1 % 3 == 0 && n1 % 5 == 0 && n2 % 3 == 0 && n2 % 5 == 0) {
            System.out.println(n1 + " é multiplo de 5 e 3");
            System.out.println(n2 + " é multiplo de 5 e 3");
        }






    }


}
