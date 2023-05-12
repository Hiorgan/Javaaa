package ZadaniaAbstrakcjaInterfejs;

public class Prostokat implements Figury {

    private int a, b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return (this.a + this.b) * 2;
    }

    @Override
    public double pole() {
        return this.a * this.b;
    }
}
