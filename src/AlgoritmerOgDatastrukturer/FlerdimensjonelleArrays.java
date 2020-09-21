package AlgoritmerOgDatastrukturer;

import java.util.Arrays;

public class FlerdimensjonelleArrays {

    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}
                , {9, 11, 13, 15},
                {17, 19}};


        int[] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        int n_cols = 4;
        int n_rows = 3;

        int row = 1;
        int col = 3;

        int index = row * n_cols + col;

        System.out.println(index);


    }
}
