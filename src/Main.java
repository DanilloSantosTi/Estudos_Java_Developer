import exercise01.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle x;

        x = new Rectangle();

        System.out.println("Digite a largura do retangulo: ");
        x.width = sc.nextInt();

        System.out.println("Digite a altura do retangulo: ");
        x.height = sc.nextInt();

        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.printf("area do retangulo: %.2f%n", area);
        System.out.printf("perimetro do retangulo: %.2f%n", perimeter);
        System.out.printf("diagonal do retangulo: %.2f%n", diagonal);

    }
}