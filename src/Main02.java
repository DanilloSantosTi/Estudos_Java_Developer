import exercise02.Worker;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Worker worker = new Worker();

        System.out.println("Digite o nome do funcionário: ");
        worker.name = sc.nextLine();

        System.out.println("Digite o salário bruto do funcionário: ");
        worker.grossSalary = sc.nextDouble();

        System.out.println(worker.getSalary());

        System.out.println("Digite a taxa de incremento do salário do funcionário: ");
        double incrementSalaryValue = sc.nextDouble();

        worker.IncreaseSalary(incrementSalaryValue);

        System.out.printf(worker.getSalary());

    }
}
