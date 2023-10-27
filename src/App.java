package src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        generarValores();
        generarValoresPares();
        generarRandom();
    }

    public static int obtenerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int valor = scanner.nextInt();
        return valor;
    }

    public static void generarValores() {
        int n = obtenerEntrada();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void generarValoresPares() {
        int n = obtenerEntrada();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void generarRandom() {
        int n = (int) (Math.random() * 3500);
        for (int i = 1; i <= n; i += 5) {
            System.out.println(i);
        }
    }
}