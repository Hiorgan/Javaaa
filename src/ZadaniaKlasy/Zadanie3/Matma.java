package ZadaniaKlasy.Zadanie3;

import ZadaniaWyjatki.UjemnyPromienException;

public class Matma {

    public static final double PI = 3.14;

    public static double ObwodKola(int r) throws UjemnyPromienException {
        if (r < 0) {
            throw new UjemnyPromienException();
        }
        return 2 * PI * r;
    }

    public static double PoleKola(int r) {
        return PI * Math.pow(r, 2);
    }

    public static int ObwodProstokata(int a, int b) {
        return 2 * a + 2 * b;
    }

    public static int PoleProstokata(int a, int b) {
        return a * b;
    }
}
