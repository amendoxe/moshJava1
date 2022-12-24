import javax.swing.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class TestMortgage {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad que requiere: ");
        mortgage.setCantidad(Double.parseDouble(scanner.nextLine().trim()));
        System.out.print("Interés anual: ");
        mortgage.setAnnualIRate(Double.parseDouble(scanner.nextLine().trim()));
        System.out.print("A cuantos años: ");
        mortgage.setYears(Double.parseDouble(scanner.nextLine().trim()));

//        mortgage.setCantidad(100_000);
//        mortgage.setAnnualIRate(6);
//        mortgage.setYears(15);
        mortgage.setMortgageMensual(mortgage.calcula());
        String result = NumberFormat.getCurrencyInstance().format(mortgage.getMortgageMensual());
        System.out.println("El mortgage mensual es de: " + result);

    }
}
