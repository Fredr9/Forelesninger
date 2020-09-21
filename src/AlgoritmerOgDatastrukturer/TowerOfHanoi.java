package AlgoritmerOgDatastrukturer;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi('A', 'B', 'C', 10);

    }

    /**
     * Løser Tower Of Hanoi pusle
     *
     * @param a => Pinnen vi starter med brikker på
     * @param b => Hjelpepinnen
     * @param c => Der alle brikkene skal, avslutningspinnen
     */
    public static void towerOfHanoi(char a, char b, char c, int brikkeNr) {
        int count = 0;
        if (brikkeNr == 0) {
            return;
        }

        // flytt alle unntatt nederste fra A til B (Hjelpepinnen)
        towerOfHanoi(a, c, b, brikkeNr - 1);

        //Flytt nederste fra A til C
        System.out.println("Flytter brikke " + brikkeNr + " fra " + a + " til " + c);
        System.out.print("\n");

        // Flytt alle fra  B til C

        towerOfHanoi(b, a, c, brikkeNr - 1);
    }
}
