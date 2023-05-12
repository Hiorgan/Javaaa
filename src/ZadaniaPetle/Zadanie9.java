package ZadaniaPetle;

public class Zadanie9 {
    public static void main(String[] args) {
        int n = 7;
        int licznik = n - 1;
        for (int i = 1; i <= n; i++) {
            licznik = n - i;
            for (int j = 1; j <= i; j++) {
                if (licznik > 0) {
                    System.out.print(" ");
                    licznik--;
                    continue;
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
