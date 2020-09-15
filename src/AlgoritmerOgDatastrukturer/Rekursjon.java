package AlgoritmerOgDatastrukturer;

public class Rekursjon {

    public static void main(String[] args) {
        int value = 15;
        int return_value = rekursivFunksjon(value);
        System.out.println("Main " + return_value);
        System.out.println("5! = " + faktorial(5));
        // 5! = 5*4*3*2*!
        // 8! = 8*7*6*5*4*3*2*1
        // 52! = enormt stort tall. 52*51*50 --- *1

        /*
         * Funksjonen skal returnerer n! (n faktorial) ved bruk av
         * rekursiv metode.
         * @param n - verdien for å regne ut faktorial av
         * @return n! - n faktorial
         *
         */
    }
        static int faktorial(int n){
            if(n == 1){
                return 1;
            }else {
                return n * faktorial(n-1);
            }
        }



    static int rekursivFunksjon(int value) {
        System.out.println("Rekursiv funksjon " + value);

        if (value <= 2) {
            return value - 1;
        } else {
            return rekursivFunksjon(value - 1);
        }
    }
}
