import java.util.Scanner;

public class Resistencia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float suma_inv_rest = 0;
        float rest = 0;

        for (int i = 1; i <= 3; i++) {
            do {
                System.out.printf("Ingrese resistencia %d: ",i);
                rest = Float.parseFloat(scanner.nextLine());
                if (rest <= 0) {
                    System.out.println("Valor ingresado invalido");
                }
            } while (rest <= 0);
            suma_inv_rest += 1/rest;
        }

        float RT = 1/suma_inv_rest;

        System.out.printf("La resistencia total es de %.1f", RT);
    }
}