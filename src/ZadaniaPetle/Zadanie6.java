package ZadaniaPetle;

public class Zadanie6 {
    public static void main(String[] args) {
        int number = 12;
        long wynik = 1;
        for (int i = 1; i <= number; i++) {
            wynik *= i;
        }
        System.out.println(wynik);
    }
}
