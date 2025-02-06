import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {  
            int inicio = lerParametro(terminal, "Digite o primeiro parâmetro (início):");
            int fim = lerParametro(terminal, "Digite o segundo parâmetro (fim):");

            contar(inicio, fim);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static int lerParametro(Scanner terminal, String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                return terminal.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                terminal.next(); // Limpa o buffer do scanner
            }
        }
    }

    static void contar(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio >= fim) {
            throw new ParametrosInvalidosException("O parâmetro final deve ser maior que o parâmetro inicial.");
        }

        for (int i = inicio + 1; i <= fim; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
    
   

}
