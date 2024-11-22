import java.util.Random;

class HiloDados extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1; // Genera un número entre 1 y 6
        int dado2 = random.nextInt(6) + 1;

        System.out.println("Lanzando dados...");
        try {
            Thread.sleep(1000); // Simula tiempo de espera
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Resultado del dado 1: " + dado1);
        System.out.println("Resultado del dado 2: " + dado2);
        System.out.println("Suma total: " + (dado1 + dado2));
    }
}
