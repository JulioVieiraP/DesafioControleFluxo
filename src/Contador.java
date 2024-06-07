import java.util.Locale;
import java.util.Scanner;

public class Contador {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Vamos calcular, digite um valor a ser subtraido pelo segundo valor");

        System.out.println("Digite o primeiro valor: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n2 < n1) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }

        int contagem = n2 - n1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
