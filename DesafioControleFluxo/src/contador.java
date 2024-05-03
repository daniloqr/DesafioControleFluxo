import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o número 2: ");
        int numero2 = entrada.nextInt();

        try {
            verificarNumeros(numero1, numero2);
            int contagem = numero2 - numero1;
            outraFuncao(contagem);
        }

        catch (ParametrosInvalidosException e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

    }

    public static void verificarNumeros(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }
        System.out.println("Os números são válidos.");

    }

    public static void outraFuncao(int contagem) {
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);

        }

    }

}
