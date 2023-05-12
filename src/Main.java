import ZadaniaAbstrakcjaInterfejs.GwiazdaSmierci;
import ZadaniaAbstrakcjaInterfejs.Kolo;
import ZadaniaAbstrakcjaInterfejs.Prostokat;
import ZadaniaDziedziczenie.Pracownik;
import ZadaniaKlasy.Zadanie1.Programista;
import ZadaniaKlasy.Zadanie2.KlasyZadanie2;
import ZadaniaKlasy.Zadanie3.Matma;
import ZadaniaScanner.ZadaniaScanner;
import ZadaniaWyjatki.NieDzielPrzezZeroException;
import ZadaniaWyjatki.UjemnyPromienException;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Programista programista = new Programista("Wojciech", "Kot", "Polski", 12345);
        System.out.println(programista.pobierzNazwisko());

        int[] tab = new int[]{4, 6, 1, 7, 10};
        KlasyZadanie2 klasyZadanie2 = new KlasyZadanie2(tab);
        System.out.println("suma: " + klasyZadanie2.Suma());
        System.out.println("Srednia: " + klasyZadanie2.Avg());
        System.out.println("Min: " + klasyZadanie2.Min());
        System.out.println("Max: " + klasyZadanie2.Max());

        Matma matma = new Matma();
        try {
            System.out.println(matma.ObwodKola(-2));
        } catch (UjemnyPromienException e) {
            e.getMessage();
        }
        System.out.println(matma.PoleKola(3));
        System.out.println(matma.ObwodProstokata(3, 5));
        System.out.println(matma.PoleProstokata(3, 5));

        Pracownik pracownik = new Pracownik("Kot", "Pies", "Nikt", "Centr");
        pracownik.przedstawSie();

        System.out.println();
        System.out.println();

        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielic przez 0");
        }


        System.out.println();
        System.out.println();


        try {
            podziel(10, 0);
        } catch (NieDzielPrzezZeroException e) {
            System.out.println(e.getMessage());
        }


        GwiazdaSmierci gwiazdasmierci = new GwiazdaSmierci();
        gwiazdasmierci.atakujLaserem();

        Prostokat prostokat = new Prostokat(3, 5);
        System.out.println("Obwod prostokata: " + prostokat.obwod());
        System.out.println("Pole prostokata: " + prostokat.pole());

        System.out.println();

        Kolo kolo = new Kolo(5);
        System.out.println("Obwod kola: " + kolo.obwod());
        System.out.println("Pole kola: " + kolo.pole());

        ZadaniaScanner zadaniaScanner = new ZadaniaScanner();
        // zadaniaScanner.zadanie1();
        //  zadaniaScanner.zadanie2();
        //zadaniaScanner.zadanie3();
        //zadaniaScanner.zadanie4();


        File file = new File("src/fragment.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            File newFile = new File("src/fragmentKopia.txt");
            FileWriter fileWriter = new FileWriter(newFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Scanner scanner = new Scanner(System.in);

            String userLine;
            int userLineCount = 0;
            String line;
            int lineNumber = 0;
            int characters = 0;
            System.out.println();

            System.out.println("Podaj slowo lub jakas fraze: ");
            userLine = scanner.nextLine();
            while ((line = bufferedReader.readLine()) != null) {
                //a) wypisanie
                lineNumber++;
                //     System.out.println(line);
                bufferedWriter.write("Telst");
                //b) ile znakow
                characters += line.length();

                if (line.contains(userLine)) {
                    userLineCount++;
                    System.out.println("Nr: " + lineNumber + " Linia: " + line);
                }


            }
            System.out.println();
            System.out.println("Liczba znakow w pliku to: " + characters);
            bufferedWriter.write("Telst");
            if (userLineCount > 0) {
                System.out.println();
                System.out.println("Plik zawiera wpisana przez ciebie fraze");
            }
        } catch (IOException e) {
            System.out.println("Blad otwarcia pliku");
        }

    }

    public static double podziel(int a, int b) throws NieDzielPrzezZeroException {
        if (b == 0) {
            throw new NieDzielPrzezZeroException();
        }
        return a / b;
    }
}
