package ZadaniaTablice;

public class Zadanie2 {
    public static void main(String[] args) {
        double[][] array = new double[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};

        double sumaJeden = array[0][0] + array[0][1] + array[0][2] + array[0][3] + array[0][4];
        double sumaDwa = array[1][0] + array[1][1] + array[1][2] + array[1][3] + array[1][4];
        double sumaTrzy = array[2][0] + array[2][1] + array[2][2] + array[2][3] + array[2][4];

        System.out.println("Suma jeden: " + sumaJeden);
        System.out.println("Suma dwa: " + sumaDwa);
        System.out.println("Suma trzy: " + sumaTrzy);
    }
}
