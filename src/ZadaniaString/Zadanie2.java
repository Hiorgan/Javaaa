package ZadaniaString;

public class Zadanie2 {
    public static void main(String[] args) {
        String tekst = "Potrafię coraz więcej z programowania.";
        int dlugosc = tekst.length();

        for (int i = 0; i < dlugosc; i++) {
            System.out.println(tekst.charAt(i));
        }
    }
}
