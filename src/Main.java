import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da cotacao: ");
        double cotacao = sc.nextDouble();

        System.out.println("Digite o valor de compra: ");
        double compra = sc.nextDouble();

        System.out.printf("Valor de pagamento: R$%.2f\n", CurrencyConverter.ValuePaid(cotacao, compra));

        sc.close();
    }
}