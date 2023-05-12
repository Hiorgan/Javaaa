package ZadaniaAbstrakcjaInterfejs;

public class Kolo implements Figury {
    private int r;

    public Kolo(int r) {
        this.r = r;
    }


    @Override
    public double obwod() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public double pole() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
