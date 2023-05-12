package ZadaniaString;

public class Zadanie1 {
    public static void main(String[] args) {
        String imie = "Wojtek";
        String nazwisko = "Wojciechowski";
        String imieNazwisko = "Wojtek Wojciechowski";

        System.out.println("a");
        System.out.println("Ile znakow zawiera imie: " + imie.length());
        System.out.println("Ile znakow zawiera nazwisko: " + nazwisko.length());
        System.out.println("Ile znakow zawiera imieNazwisko: " + imieNazwisko.length());

        System.out.println("b");
        boolean czyJan;
        if (imie == "Jan")
            czyJan = true;
        else
            czyJan = false;
        System.out.println("Czy imie to Jan?: " + czyJan);
        boolean czyAlicja;
        if (imie == "Alicja")
            czyAlicja = true;
        else
            czyAlicja = false;
        System.out.println("Czy imie to Alicja?: " + czyAlicja);

        System.out.println("c");
        System.out.println("Nazwisko wielkimi literami: " + nazwisko.toUpperCase());

        System.out.println("d");
        System.out.println("Zamiana litery o na e: " + nazwisko.replace("o", "e"));
    }
}
