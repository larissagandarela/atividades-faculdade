import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int numero;
        char continuar;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("Deseja digitar outro número? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();

        System.out.println("Números armazenados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma total dos números: " + soma);
    }
}
