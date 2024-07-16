import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        try {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();
            
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = parametroUm + 1; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

