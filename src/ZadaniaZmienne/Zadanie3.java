package ZadaniaZmienne;

public class Zadanie3 {
    public static void main(String[] args) {
        int masa = 60;
        float wzrost = 1.72f;
        float BMI = masa / (wzrost * wzrost);
        int intBMI = (int) BMI;
        System.out.println("BMI: " + BMI);
        System.out.println("intBMI: " + intBMI);
    }
}
