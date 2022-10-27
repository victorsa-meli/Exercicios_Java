import java.util.Scanner;

public class salarioColaborador {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float salarioBruto, adicionalNoturno, horasExtras, descontosColaborador, salarioLiquido;

        System.out.println("Informe o Salario Bruto: ");
        salarioBruto = read.nextFloat();

        System.out.println("Informe o adicional noturno: ");
        adicionalNoturno = read.nextFloat();

        System.out.println("Informe o horas extras: ");
        horasExtras = read.nextFloat();


        System.out.println("Informe o descontos: ");
        descontosColaborador = read.nextFloat();


        salarioLiquido = ((salarioBruto+adicionalNoturno+(horasExtras*5))-descontosColaborador);

        System.out.println("Salario liquido =  "+(salarioLiquido));


    }
}
