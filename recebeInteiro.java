import java.util.Scanner;

public class recebeInteiro {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1, n2 ,n3;

        System.out.println("Digite o primeiro inteiro: ");
        n1 = read.nextInt();

        System.out.println("Digite o primeiro inteiro: ");
        n2 = read.nextInt();

        System.out.println("Digite o primeiro inteiro: ");
        n3 = read.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("Numero maior é :"+n1);
        }
        else if (n2 > n1 && n2 > n3){
            System.out.println("Numero maior é :"+n2);
        }
        else if (n3 > n1 && n3 > n2){
            System.out.println("Numero maior é :"+n3);
        }
        else if (n1 == n2 && n1 == n3){
            System.out.println("Ambos os inteiros sao equivalentes.");
        }
        else if (n1 == n2 & n1 > n3){
            System.out.println(n1+" e "+n2+" Sao equivalentes e maiores que "+n3);
        }

        else if (n3 == n2 & n3 > n1){
            System.out.println(n3+" e "+n2+" Sao equivalentes e maiores que "+n1);
        }



    }
}
