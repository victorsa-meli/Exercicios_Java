import java.util.Scanner;
import java.util.Scanner.*;
public class mediaJava {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float n1, n2, n3, n4, mediaFinal;

        System.out.println("Insira a nota do primeiro aluno : ");
        n1 = read.nextFloat();
        System.out.println("Insira a nota do primeiro aluno : ");
        n2 = read.nextFloat();
        System.out.println("Insira a nota do primeiro aluno : ");
        n3 = read.nextFloat();
        System.out.println("Insira a nota do primeiro aluno : ");
        n4 = read.nextFloat();


       mediaFinal = ((n1+n2+n3+n4)/4);


        System.out.println("Media final : " + mediaFinal);




    }
}
