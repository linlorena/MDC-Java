import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int mdc = 0;
        int menor = a < b ? a : b;

        while (menor > 0) {
            if (a % menor == 0 && b % menor == 0) {
                mdc = menor;
                break;
            }
            menor--;
        }

        System.out.println("O máximo divisor comum de " + a + " e " + b + " é " + mdc);

        scanner.close();
    }
}
