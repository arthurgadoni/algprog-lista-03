import java.util.Scanner;
import java.util.Random;

public class algoritmo_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random randola = new Random();

        System.out.print("Fala o primeiro número inteiro: ");
        int numero_01 = sc.nextInt();

        System.out.print("E o segundo número inteiro: ");
        int numero_02 = sc.nextInt();

        int menor;
        int maior;

        if (numero_01 < numero_02) {
            menor = numero_01;
            maior = numero_02;
        } else {
            menor = numero_02;
            maior = numero_01;
        }

        int numero = randola.nextInt(maior - menor + 1) + menor;

        System.out.println("O número sorteado foi: " + numero);

        if (numero % 2 == 0) {
            System.out.println("O número sorteado é par");
        } else {
            System.out.println("O número sorteado é ímpar");
        }

        sc.close();
    }
}