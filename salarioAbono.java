import java.util.Scanner;

public class salarioAbono {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float salario, abono, novoSalario;

        System.out.println("Digite o salario : ");
        salario = read.nextFloat();

        System.out.println("Digite o abono : ");
        abono = read.nextFloat();


        novoSalario = (salario + abono);


        System.out.println("Novo salario : "+ novoSalario);








    }
}
