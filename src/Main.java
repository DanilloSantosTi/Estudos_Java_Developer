import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite os valores do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite os valores do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double aP = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(aP * (aP - xA) * (aP - xB) * (aP - xC));

        double yP = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(yP * (yP - yA) * (yP - yB) * (yP - yC));

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