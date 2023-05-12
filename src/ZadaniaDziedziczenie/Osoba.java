package ZadaniaDziedziczenie;

public class Osoba {
    public String imie;
    public String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko);
    }
}
