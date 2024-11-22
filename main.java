import java.util.Scanner;

public class JuegosAzar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione un juego:");
            System.out.println("1. Juego de Dados");
            System.out.println("2. Juego Tragamonedas");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    HiloDados juegoDados = new HiloDados();
                    juegoDados.start();
                    break;
                case 2:
                    HiloTragamonedas juegoTragamonedas = new HiloTragamonedas();
                    juegoTragamonedas.start();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
        System.out.println("Gracias por jugar.");
    }
}
