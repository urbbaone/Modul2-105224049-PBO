import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = input.nextInt();

        // 1 Jam = 3600 detik, 1 Menit = 60 detik
        int jam = totalDetik / 3600;
        int sisaDetikSetelahJam = totalDetik % 3600;
        int menit = sisaDetikSetelahJam / 60;
        int detik = sisaDetikSetelahJam % 60;

        System.out.println("Hasil konversi: " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
        input.close();
    }
}