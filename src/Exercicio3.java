import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Arrays;

public class Exercicio3 {  // Classe principal

    public static void main(String[] args) {
        int[] matriz1 = GeradodeMatriz(5);
        int[] matriz2 = GeradodeMatriz(5);
        int[] uniao = new int[10]; // Criação da união de ambos os arrays

        System.out.println("---------------------------------------------------------");
        System.out.println("Matriz 1: " + Arrays.toString(matriz1));

        System.out.println("---------------------------------------------------------");
        System.out.println("Matriz 2: " + Arrays.toString(matriz2));

        // Exemplo simples de união dos arrays
        for (int i = 0; i < matriz1.length; i++) {
            uniao[i] = matriz1[i];
        }
        for (int i = 0; i < matriz2.length; i++) {
            uniao[i + matriz1.length] = matriz2[i];
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("União: " + Arrays.toString(uniao));
    }

    // Método Gerador de Matriz
    static int[] GeradodeMatriz(int N) {
        Random g = new Random();

        // Verifica se N é maior do que o número de valores possíveis (0 a 24)
        if (N > 25) {
            System.out.println("Erro: Não é possível gerar " + N + " números únicos dentro do intervalo de 0 a 24.");
            return new int[0]; // Retorna um array vazio
        }

        Set<Integer> numeros = new HashSet<>();

        // Gera números aleatórios sem repetição
        while (numeros.size() < N) {
            numeros.add(g.nextInt(25));  // Números entre 0 e 24
        }

        // Converte o Set para array
        int[] matriz = new int[numeros.size()];
        int i = 0;
        for (int num : numeros) {
            matriz[i++] = num;
        }

        return matriz;
    }
}
