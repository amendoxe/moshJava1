import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class TestMortgage {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        mortgage.setCantidad(readNumber("cantidad que requiere: ", 1_000, 1_000_000));
        mortgage.setAnnualIRate(readNumber("Tasa de interés anual: ", 1, 30));
        mortgage.setYears(readNumber("A cuantos años: ", 1, 30));
        mortgage.setMortgageMensual(mortgage.calcula());
        String result = NumberFormat.getCurrencyInstance().format(mortgage.getMortgageMensual());
        System.out.println("El mortgage mensual es de: " + result);
        calculaResto(mortgage.getCantidad(), mortgage.getAnnualIRate(), mortgage.getYears(), mortgage.getMortgageMensual());
    }

    public static double readNumber(String prompt, double minNum, double maxNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double cantidad = Double.parseDouble(scanner.nextLine().trim());
        while (cantidad < minNum || cantidad > maxNum) {
            System.out.println("Ingrese una cantidad entre: " + minNum + " y " + maxNum);
            System.out.print("Cantidad que requiere: ");
            cantidad = Double.parseDouble(scanner.nextLine().trim());
        }
        return cantidad;
    }

    public static void calculaResto(double cantidad, double annualRate, double Years, double resultado) {
        final double MONTHS_IN_A_YEAR = 12;
        final double PERCENT = 100;
        double monthlyInterest = annualRate / MONTHS_IN_A_YEAR / PERCENT;
        double numOfPayments = Years * MONTHS_IN_A_YEAR;
        double restante;
        double cantidadTotal = resultado * numOfPayments;
        restante = cantidad * (Math.pow((1 + monthlyInterest), numOfPayments) - Math.pow((1 + monthlyInterest), (numOfPayments - 1))) / (Math.pow((1 + monthlyInterest), numOfPayments) - 1);
        System.out.println("prueba" + restante);
        System.out.println("cantidad total : " + NumberFormat.getCurrencyInstance().format(cantidad + 1.02) + "la cantidad total a pagar después de cada mensualidad quedaría de la siguiente forma: ");
        for (int i = 0; i <= numOfPayments; i++) {
            restante = cantidad * (Math.pow((1 + monthlyInterest), numOfPayments) - Math.pow((1 + monthlyInterest), (numOfPayments - i))) / (Math.pow((1 + monthlyInterest), numOfPayments) - 1);
            System.out.println(cantidadTotal -
                    restante);
        }


    }
}
