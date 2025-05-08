import java.util.Random;

public class ExercicioUm {
    public static void main(String[] args) {
       int [][] matriz = GeradodeMatriz(3, 4);
       int [][] matriz2 = GeradodeMatriz(3,4);
       int sem = 0;
        System.out.println("Matriz 1 ------------------------------------");
       for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz 2 -------------------------------------");
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz2[0].length; j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        
        int pares = 0;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j]%2==0){
                    pares++;
                }
            }
            System.out.println();

        }
        int maior = 0;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j]>maior){
                    maior=matriz[i][j];
                }
            }
            System.out.println();

        }
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j < matriz2[0].length;j++){
                if (matriz[i][j] == matriz2[i][j]) {
                    sem++;
                }
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Maior número: " + maior);
        System.out.println("Numeros semelhantes entre as matrizes: " + sem);
    }
    static int [][] GeradodeMatriz(int N, int M){
        Random g = new Random();
        int [][] matriz = new int[N][M];
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = g.nextInt(25);
            }
        }
        return matriz;
    }



}
