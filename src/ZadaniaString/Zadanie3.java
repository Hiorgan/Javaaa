package ZadaniaString;

public class Zadanie3 {
    public static void main(String[] args) {
        String tekst = "Potrafię coraz więcej z programowania.";
        int dlugosc = tekst.length();

        for (int i = dlugosc - 1; i >= 0; i--) {
            System.out.print(tekst.charAt(i));
        }
    }
}
