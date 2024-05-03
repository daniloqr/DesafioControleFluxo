import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o número 2: ");
        int numero2 = entrada.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("o primeiro número precisa ser maior do que o segundo número.");
        }

    }

    static int contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = numero1 - numero2;

        for (int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o número " + i);

        }

    }
}
