package Java101;

import java.util.Arrays;

public class MatrisinTranspozu {
    public static void main(String[] args) {

        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };
        int[][] matrisTranspoze = new int[matris[0].length][matris.length];


        for (int i = 0 ; i <= matris.length ; i++){
            for (int j = 0; j<matris[0].length-1 ; j++){
                matrisTranspoze[i][j]=matris[j][i];
            }
        }
        System.out.println(Arrays.deepToString(matrisTranspoze));

        for(int[] row : matrisTranspoze){
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
