public class Mortgage {
    private double cantidad;
    private double annualIRate;
    private double years;
    private double mortgageMensual;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getAnnualIRate() {
        return annualIRate;
    }

    public void setAnnualIRate(double annualIRate) {
        this.annualIRate = annualIRate;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getMortgageMensual() {
        return mortgageMensual;
    }

    public double calcula() {
        double P = getCantidad();
        double r = getAnnualIRate() / 1200;
        double n = getYears() * 12;
        double numPow = Math.pow((1 + r), n);
        double m = P * ((r * numPow) / (numPow - 1));
        return m;
    }

    public void setMortgageMensual(double mortgageMensual) {

        this.mortgageMensual = mortgageMensual;
    }

}
