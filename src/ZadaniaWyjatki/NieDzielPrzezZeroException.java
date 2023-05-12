package ZadaniaWyjatki;

public class NieDzielPrzezZeroException extends Exception {
    public NieDzielPrzezZeroException() {
        super("Nie dziel przez 0");
    }
}
