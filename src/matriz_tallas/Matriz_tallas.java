package matriz_tallas;

import java.util.Random;

public class Matriz_tallas {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int M =750 ;

        int[][] matriz = new int[M][M];

        Random random = new Random();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("La matriz generada es:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        long endTime = System.currentTimeMillis();
        long duracion = endTime - startTime;
        
        System.out.println("tiempo de ejecucion : " + duracion);
        
    }
    
    
}

  

