import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (m): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar ruangan (m): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi ruangan (m): ");
        double tinggi = input.nextDouble();

        // Menghitung luas 4 sisi dinding
        double luasDinding = 2 * (panjang + lebar) * tinggi;
        
        // 1 liter = 10 m2. Menggunakan Math.ceil untuk pembulatan ke atas
        double literDibutuhkan = Math.ceil(luasDinding / 10.0);

        System.out.println("===Hasil Perhitungan===");
        System.out.println("Luas permukaan dinding: " + luasDinding + " m2");
        System.out.println("Jumlah cat yang dibutuhkan: " + (int)literDibutuhkan + " Liter");
        input.close();
    }
}