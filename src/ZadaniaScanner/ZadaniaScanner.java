package ZadaniaScanner;

import java.util.Scanner;

public class ZadaniaScanner {
    public void zadanie1() {
        String imie, nazwisko;
        int wzrost;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        imie = scanner.next();
        System.out.println();
        System.out.println("Podaj nazwisko: ");
        nazwisko = scanner.next();
        System.out.println();
        System.out.println("Podaj wzrost: ");
        wzrost = scanner.nextInt();
        System.out.println();
        System.out.println("Jestem " + imie + " " + nazwisko + " i mam " + wzrost + " cm wzrostu");
        scanner.close();
    }

    public void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");
        String line;
        while (scanner.hasNext()) {
            line = scanner.next();
            if (line.equals("x") || line.equals("X")) break;
            System.out.println("Wypisano: " + line);
        }
        scanner.close();
    }

    public void zadanie3() {
        String line;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Podaj zdanie: ");
        line = scanner.nextLine();
        System.out.println();
        System.out.println("Podaj liczbe: ");
        number = scanner.nextInt();
        System.out.println();
        for (int i = 1; i <= number; i++) {
            System.out.println("Nr" + i + " Zdanie: " + line);
        }
        scanner.close();

    }

    public void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int number = 0;
        while (true) {
            System.out.println("Podaj liczbe: ");
            number = scanner.nextInt();
            if (number < 0)
                break;
            suma += number;
            System.out.println("Aktualna suma wynosi: " + suma);
        }
        scanner.close();
    }
}
