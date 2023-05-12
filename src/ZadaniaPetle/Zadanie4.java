package ZadaniaPetle;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println();
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }
    }
}
