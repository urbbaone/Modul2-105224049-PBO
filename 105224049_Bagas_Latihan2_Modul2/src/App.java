import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (9.0/5.0 * celcius) + 32;
        double kelvin = celcius + 273.15;
        double reamur = 4.0/5.0 * celcius;

        System.out.println("===Hasil Konversi===");
        System.out.printf("Fahrenheit: %.2f F%n", fahrenheit);
        System.out.printf("Kelvin    : %.2f K%n", kelvin);
        System.out.printf("Reamur    : %.2f R%n", reamur);
        input.close();
    }
}