import java.util.Random;

public class Numeros {
    public static void main(String[] args) {
        Random rand = new Random();
        int suma = 0;
        int cantidadNumeros = 500;

        System.out.println("Números generados:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = rand.nextInt(991) + 10; // Genera número entre 10 y 1000
            System.out.println(numero);

            suma += numero;
        }

        double promedio = (double) suma / cantidadNumeros;

        System.out.println("\nSuma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}