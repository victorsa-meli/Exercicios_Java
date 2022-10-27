import java.util.Scanner;

public class diferencaProduto {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float n1, n2, n3, n4, produto1, produto2, dif_1e2;

        System.out.println("Digite o primeiro valor : ");
        n1 = read.nextFloat();

        System.out.println("Digite o segundo valor : ");
        n2 = read.nextFloat();

        System.out.println("Digite o terceiro valor : ");
        n3 = read.nextFloat();

        System.out.println("Digite o quarto valor : ");
        n4 = read.nextFloat();


        produto1 = (n1*n2);
        produto2 = (n3*n4);

        dif_1e2 = (produto1 - produto2);


        System.out.println("Diferença : "+dif_1e2);
    }
}
