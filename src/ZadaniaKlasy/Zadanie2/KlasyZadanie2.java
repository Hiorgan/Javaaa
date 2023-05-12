package ZadaniaKlasy.Zadanie2;

public class KlasyZadanie2 {

    private int[] tab;

    public KlasyZadanie2(int[] tab) {
        this.tab = tab;
    }

    public int Suma() {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    public double Avg() {
        double suma = Suma();
        double avg = suma / tab.length;
        return avg;
    }

    public int Min() {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min)
                min = tab[i];
        }
        return min;
    }

    public int Max() {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }
}
