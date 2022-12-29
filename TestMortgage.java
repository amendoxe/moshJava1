import java.text.NumberFormat;
import java.util.Scanner;

public class TestMortgage {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad que requiere: ");
        double cantidad = Double.parseDouble(scanner.nextLine().trim());
        while (cantidad < 1_000 || cantidad > 1_000_000) {
            System.out.println("Ingrese una cantidad entre 1,000.00 y 1,000,000.00");
            System.out.print("Cantidad que requiere: ");
            cantidad = Double.parseDouble(scanner.nextLine().trim());
        }
        mortgage.setCantidad(cantidad);
        System.out.print("Interés anual: ");
        double interes = Double.parseDouble(scanner.nextLine().trim());
        while (interes <= 0 || interes > 30) {
            System.out.println("Ingresa un número mayor a 0 y menor a 30");
            System.out.print("Interés anual: ");
            interes = Double.parseDouble(scanner.nextLine().trim());
        }
        mortgage.setAnnualIRate(interes);
        System.out.print("A cuantos años: ");
        double anios = Double.parseDouble(scanner.nextLine().trim());
        while (anios < 1 || anios > 30) {
            System.out.println("Ingresa un número entre 1 y 30");
            System.out.print("A cuantos años: ");
            anios = Double.parseDouble(scanner.nextLine().trim());
        }
        mortgage.setYears(anios);

        mortgage.setMortgageMensual(mortgage.calcula());
        String result = NumberFormat.getCurrencyInstance().format(mortgage.getMortgageMensual());
        System.out.println("El mortgage mensual es de: " + result);

    }
}
