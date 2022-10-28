import java.util.Scanner;

public class parImparQuadradoRaiz {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite um numero : ");
        n1 = read.nextFloat();

        if (n1 % 2 == 0){
            n2 =  Math.sqrt(n1);

            System.out.println(" Numero: "+n1+" é par e sua raiz quadrada é : "+n2);
        }
        else {
            n2 = Math.pow(n1, 2);
            System.out.println(" Numero: "+n1+" é impar e sua potencia ao quadrado é : "+n2);
        }


    }
}
