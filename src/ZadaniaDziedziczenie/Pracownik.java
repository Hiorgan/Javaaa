package ZadaniaDziedziczenie;

public class Pracownik extends Osoba {
    private String stanowisko;
    private String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem " + imie + " " + nazwisko + " i pracuje w firmie " + nazwaFirmy + " na stanowisku " + stanowisko);
    }
}
