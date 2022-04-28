public class Ecuacion {

    double A, B, C;

    public Ecuacion(double num1, double num2, double num3) {

        establecerA(num1);
        establecerB(num3);
        establecerC(num2);
    }

    public double optenerA() {
        return A;
    }

    public void establecerA(double num1) {
        A = num1;
    }

    public double optenerB() {
        return B;
    }

    public void establecerB(double num2) {
        B = num2;
    }

    public double optenerC() {
        return C;
    }

    public void establecerC(double num3) {
        C = num3;
    }

    double discriminante() {
        double discriminante;

        discriminante = Math.pow(optenerB(), 2) - (4 * optenerA() * optenerC());

        return discriminante;
    }

}
