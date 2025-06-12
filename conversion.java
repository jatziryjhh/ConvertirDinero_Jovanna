import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double USD = 17.5;
        double EUR = 19.2;
        int menu = 0;

        while (menu != 5) {
            System.out.println("BIENVENIDO AL MENÚ PARA PODER CONVERSIONAR EL DINERO");
            System.out.println("TENEMOS EL SIGUIENTE MENÚ:");
            System.out.println("1.- PESOS MEXICANOS A DÓLARES");
            System.out.println("2.- PESOS MEXICANOS A EUROS");
            System.out.println("3.- DÓLARES A PESOS MEXICANOS");
            System.out.println("4.- EUROS A PESOS MEXICANOS");
            System.out.println("5.- SALIR");
            System.out.println("¿QUÉ OPCIÓN QUIERES REALIZAR?");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("ESTA ES LA OPCIÓN DE PESOS MEXICANOS A DÓLARES");
                    System.out.println("¿CUÁNTOS PESOS SON?");
                    double pesos1 = sc.nextDouble();
                    double operacion1 = pesos1 / USD;
                    System.out.println("TU TOTAL EN DÓLARES ES: " + operacion1);
                    break;

                case 2:
                    System.out.println("ESTA ES LA OPCIÓN DE PESOS MEXICANOS A EUROS");
                    System.out.println("¿CUÁNTOS PESOS SON?");
                    double pesos2 = sc.nextDouble();
                    double operacion2 = pesos2 / EUR;
                    System.out.println("TU TOTAL EN EUROS ES: " + operacion2);
                    break;

                case 3:
                    System.out.println("ESTA ES LA OPCIÓN DE DÓLARES A PESOS");
                    System.out.println("¿CUÁNTOS DÓLARES SON?");
                    double dolares = sc.nextDouble();
                    double operacion3 = dolares * USD;
                    System.out.println("TU TOTAL EN PESOS ES: " + operacion3);
                    break;

                case 4:
                    System.out.println("ESTA ES LA OPCIÓN DE EUROS A PESOS");
                    System.out.println("¿CUÁNTOS EUROS SON?");
                    double euros = sc.nextDouble();
                    double operacion4 = euros * EUR;
                    System.out.println("TU TOTAL EN PESOS ES: " + operacion4);
                    break;

                case 5:
                    System.out.println("USTED YA SALIÓ, BYE BYE");
                    break;

                default:
                    System.out.println("ORA, ESO NO TA");
                    break;
            }
        }

        sc.close();
    }
}