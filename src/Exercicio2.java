import java.util.Arrays;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] matriz = GeradodeMatriz(10);

        int maior = 0;
        int menor = 100000000;

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + "\t");
        }
        for (int i = 0; i < matriz.length; i++){
            if(matriz[i]>maior){
                maior=matriz[i];
            }
            if (matriz[i]<menor){
                menor = matriz[i];
            }
        }
        int cont = 0;
        for (int i = 0; i < matriz.length;i++){
            if(matriz[i]!=maior && matriz[i]!=menor){
                cont++;
            }
        }

        int[] medios = GeradodeMatriz(cont);
        int j = 0;

        for(int i = 0; i < matriz.length; i++){
            if (matriz[i] != menor && matriz[i] != maior){
                medios[j]=matriz[i];
                j++;
            }
        }

        System.out.println();
        System.out.println("Valor máximo: " + maior);
        System.out.println("Valor mínimo: " + menor);
        System.out.println("Valores entre o maior e menor número: " + Arrays.toString(medios));
    }


    static int[] GeradodeMatriz(int N) {
        Random g = new Random();
        int[] matriz = new int[N];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = g.nextInt(25); // números aleatórios de 0 a 24
        }
        return matriz;
    }
}
