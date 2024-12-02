package app.prueba.ada.ejercicios;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido a la calculadora");
        
        while (continuar) {
            mostrarMenu();
            
            int opcion = leerEntero(scanner, "Seleccione una opción (1-6): ");
            
            switch (opcion) {
                case 1: // Suma
                    double[] numerosSuma = leerDosNumeros(scanner);
                    System.out.println("Resultado: " + (numerosSuma[0] + numerosSuma[1]));
                    break;

                case 2: // Resta
                    double[] numerosResta = leerDosNumeros(scanner);
                    System.out.println("Resultado: " + (numerosResta[0] - numerosResta[1]));
                    break;

                case 3: // Multiplicación
                    double[] numerosMultiplicacion = leerDosNumeros(scanner);
                    System.out.println("Resultado: " + (numerosMultiplicacion[0] * numerosMultiplicacion[1]));
                    break;

                case 4: // División
                    double[] numerosDivision = leerDosNumeros(scanner);
                    if (numerosDivision[1] == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + (numerosDivision[0] / numerosDivision[1]));
                    }
                    break;

                case 5: // Raíz cuadrada
                    double numero = leerDecimal(scanner, "Ingrese el número para calcular la raíz cuadrada: ");
                    if (numero < 0) {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    } else {
                        System.out.println("Resultado: " + Math.sqrt(numero));
                    }
                    break;

                case 6: // Salir
                    continuar = false;
                    System.out.println("Gracias por usar la calculadora. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }

	private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Raíz cuadrada");
        System.out.println("6. Salir");
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número entero válido.");
            }
        }
    }

    private static double leerDecimal(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número decimal válido.");
            }
        }
    }

    private static double[] leerDosNumeros(Scanner scanner) {
        double[] numeros = new double[2];
        numeros[0] = leerDecimal(scanner, "Ingrese el primer número: ");
        numeros[1] = leerDecimal(scanner, "Ingrese el segundo número: ");
        return numeros;
    }
}
