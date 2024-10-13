import exercise03.Student;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        student.name = sc.nextLine();

        System.out.println("Digite as três notas: ");
        student.note01 = sc.nextDouble();
        student.note02 = sc.nextDouble();
        student.note03 = sc.nextDouble();

        System.out.println(student.PassOrNoPass());

    }
}
