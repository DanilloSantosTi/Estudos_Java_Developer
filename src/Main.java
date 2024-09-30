import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os valores do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os valores do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double aP = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(aP * (aP - x.a) * (aP - x.b) * (aP - x.c));

        double yP = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(yP * (yP - y.a) * (yP - y.b) * (yP - y.c));

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior áre do triangulo: X");
        } else {
            System.out.println("A maior áre do triangulo: Y");
        }


        sc.close();

    }
}