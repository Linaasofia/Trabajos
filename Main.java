import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar las mediciones
        System.out.println("Ingrese las mediciones en grados (separadas por espacio):");

        // Verificar si hay una línea disponible antes de intentar leerla
        if (scanner.hasNextLine()) {
            String medicionesInput = scanner.nextLine();

            // Dividir la entrada en un array de Strings
            String[] medicionesArray = medicionesInput.split(" ");

            // Crear un array para almacenar las mediciones convertidas a enteros
            int[] mediciones = new int[medicionesArray.length];

            // Convertir Strings a enteros
            for (int i = 0; i < medicionesArray.length; i++) {
                mediciones[i] = Integer.parseInt(medicionesArray[i]);
            }

            // Calcular el número más acertado para la medición
            int resultado = calcularGradoAcertado(mediciones);

            // Mostrar el resultado
            System.out.println("El número más acertado para la medición es: " + resultado + " grados.");
        } else {
            System.out.println("No se proporcionaron mediciones.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    public static int calcularGradoAcertado(int[] grados) {
        // Normalizar los grados a valores entre 0 y 360
        for (int i = 0; i < grados.length; i++) {
            grados[i] = grados[i] % 360;
        }

        // Calcular la media de los grados normalizados
        int suma = 0;
        for (int grado : grados) {
            suma += grado;
        }

        return suma / grados.length;
    }
}
