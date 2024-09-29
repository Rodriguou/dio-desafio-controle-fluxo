import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try (terminal) {
            System.out.println("Digite o primeiro parâmetro (deve ser um número inteiro):");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro (deve ser um número inteiro maior que o primeiro parâmetro):");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++)
            System.out.println("Imprimindo o número " + (i + 1));
    }
}