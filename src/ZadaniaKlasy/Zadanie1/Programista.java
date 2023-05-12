package ZadaniaKlasy.Zadanie1;

public class Programista {
    private String imie, nazwisko, jezyk;
    private int wynagrodzenie;


    public Programista(String imie, String nazwisko, String jezyk, int wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.jezyk = jezyk;
        this.wynagrodzenie = wynagrodzenie;
    }


    public String pobierzImie() {
        return imie;
    }

    public String pobierzNazwisko() {
        return nazwisko;
    }

    public String pobierzJezyk() {
        return jezyk;
    }

    public int pobierzWynagrodzenie() {
        return wynagrodzenie;
    }
}
