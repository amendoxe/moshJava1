import java.text.NumberFormat;
import java.util.Scanner;

public class TestMortgage3 {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        Scanner scanner = new Scanner(System.in);
        double cantidad;
        double tasaAnual;
        int anios;
        while (true) {

            System.out.print("Cantidad que requiere: ");
            cantidad = Double.parseDouble(scanner.nextLine());
            if (cantidad >= 1_000 && cantidad <= 1_000_000) {
                mortgage.setCantidad(cantidad);
                break;
            } else System.out.println("Ingrese una cantidad entre 1,000 y 1,000,000");
        }
        while (true) {
            System.out.print("Tasa anual: ");
            tasaAnual = Double.parseDouble(scanner.nextLine());
            if (tasaAnual > 0 && tasaAnual < 30) {
                mortgage.setAnnualIRate(tasaAnual);
                break;
            } else System.out.println("Ingrese una tasa mayor a 0 y menor a 30");
        }
        while (true) {
            System.out.print("Años a pagar: ");
            anios = Integer.parseInt(scanner.nextLine());
            if (anios > 0 && anios <= 30) {
                mortgage.setYears(anios);
                break;
            } else System.out.println("Ingrese una cantidad de años entre 1 y 30");
        }
        mortgage.setMortgageMensual(mortgage.calcula());
        String resultado = NumberFormat.getCurrencyInstance().format(mortgage.getMortgageMensual());
        System.out.println("Mortgage mensual:" + resultado);
    }
}
