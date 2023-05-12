package ZadaniaIfy;

public class Zadanie3 {
    public static void main(String[] args) {
        double number1 = 10;
        double number2 = 20;
        char znak = '*';
        double wynik = 0;

        switch (znak) {
            case '+':
                wynik = number1 + number2;
                break;
            case '-':
                wynik = number1 - number2;
                break;
            case '*':
                wynik = number1 * number2;
                break;
            case '/':
                wynik = number1 / number2;
                break;
            default:
                System.out.println("Nie ma takiego znaku");
                break;
        }
        System.out.println("Wynik to: " + wynik);
    }
}
