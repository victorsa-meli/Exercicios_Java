import java.util.Scanner;


public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float numero1, numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = leia.nextFloat();

        System.out.println("Digite o segundo numero : ");
        numero2 = leia.nextFloat();

        System.out.println("\n" + numero1 + "+" + numero2 + "= " + (numero1+numero2));
        System.out.println("\n" + numero1 + "-" + numero2 + "= " + (numero1-numero2));
        System.out.println("\n" + numero1 + "x" + numero2 + "= " + (numero1*numero2));
        System.out.println("\n" + numero1 + "/" + numero2 + "= " + (numero1/numero2));
        System.out.println("\n" + (numero1)+ "x" + numero2+ "%" + "= "+ (numero1 * (numero2/100)));

    }
}
