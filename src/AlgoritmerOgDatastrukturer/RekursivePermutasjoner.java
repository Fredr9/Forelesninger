package AlgoritmerOgDatastrukturer;

import java.util.Arrays;

public class RekursivePermutasjoner {

    public static void main(String[] args) {
        System.out.println("Rekursive permutasjoner!");

        int[] verdier = {1, 2, 3};

        rekursive_permutasjoner(verdier,0);
    }

    static void rekursive_permutasjoner(int[] verdier, int k) {
        if(k == verdier.length-1) {
            System.out.println(Arrays.toString(verdier));
        }
        // [1],2,3 => 1,3,2
        // 2, [1], 3 => 2,3,1
        // 3, 2, [1] => 3,1,2

        for (int i = k; i < verdier.length; ++i) {
            swap(verdier, i, k);
           rekursive_permutasjoner(verdier,k+1);
         //   System.out.println(Arrays.toString(verdier));
            swap(verdier,k,i);
        }
      // rekursive_permutasjoner(verdier);

    }

     static void swap(int[] verdier, int m, int n){
        // eksempem : m = n, n = 3
        // temp = verdier[2]
        int temp = verdier[m];

        // verdier [2] = verdier[3]
        verdier[m] = verdier[n];

        // verdier [3] = temp = verdier[2]
        verdier[n] = temp;
    }
}
