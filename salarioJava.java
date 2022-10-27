import java.sql.SQLOutput;
import java.util.Scanner;

public class salarioJava {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float salario, abono, newSalario;

        System.out.println("Digite o valor do salario : ");
        salario = read.nextFloat();

        System.out.println("Digite o valor do abono: ");
        abono = read.nextFloat();

        newSalario = salario + abono;
        System.out.println("Novo Salario : "+ newSalario);



    }
}
