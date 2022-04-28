
public class Resultado {

    public static void main(String[] args) {

        double raiz1 = 0, raiz2 = 0, solucionDoble = 0;

        Ecuacion respuesta = new Ecuacion(1, 2, 3);

        System.out.println(respuesta.optenerA());
        System.out.println(respuesta.optenerB());
        System.out.println(respuesta.optenerC());

        System.out.println("ECUACION CUADRATICA :");
        System.out
                .println((int) respuesta.optenerA() + "x^2 + " + (int) respuesta.optenerB() + "x + "
                        + (int) respuesta.optenerC());

        System.out.println("Solucion :");

        System.out.println("Discriminante :" + respuesta.discriminante());

        if (respuesta.discriminante() > 0) {
            raiz1 = ((-respuesta.optenerB()) + respuesta.discriminante()) / (2 * respuesta.optenerA());
            raiz2 = ((-respuesta.optenerB()) + respuesta.discriminante()) / (2 * respuesta.optenerA());

            System.out.println("Tiene dos soluciones distintas:");

            System.out.println("Solucion 1=" + raiz1);
            System.out.println("Solucion 2=" + raiz2);

        } else if (respuesta.discriminante() == 0) {
            solucionDoble = -respuesta.optenerB() / (2 * respuesta.optenerA());

            System.out.println("Tiene una solucion doble:");

            System.out.println("solucion doble=" + solucionDoble);

        } else if (respuesta.discriminante() < 0) {
            System.out.println("La ecuacion cuadratica no tiene solucion...");
        }
    }
}
