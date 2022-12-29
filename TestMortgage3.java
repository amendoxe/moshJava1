import java.text.NumberFormat;
import java.util.Scanner;

public class TestMortgage3 {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad que requiere: ");
        mortgage.setCantidad(Double.parseDouble(scanner.nextLine()));

        System.out.print("Tasa anual: ");
        mortgage.setAnnualIRate(Double.parseDouble(scanner.nextLine()));

        System.out.print("Años a pagar: ");
        mortgage.setYears(Double.parseDouble(scanner.nextLine()));

        mortgage.setMortgageMensual(mortgage.calcula());
        String resultado = NumberFormat.getCurrencyInstance().format(mortgage.getMortgageMensual());
        System.out.println("Mortgage mensual:" + resultado);
    }
}
