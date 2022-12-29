import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage2 {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad que requiere: ");
        mortgage.setCantidad(Double.parseDouble(scanner.nextLine().trim()));

        System.out.print("Interes Anual: ");
        mortgage.setAnnualIRate(Double.parseDouble(scanner.nextLine().trim()));

        System.out.print("A cuantos años: ");
        mortgage.setYears(Double.parseDouble(scanner.nextLine().trim()));

        mortgage.setMortgageMensual(mortgage.calcula());
        String result = NumberFormat.getCurrencyInstance().format(mortgage.getMortgageMensual());
        System.out.println("La cantidad mensual es de : " + result);
    }
}
