import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String nama = "Ciko";
        int sks = 42;
        double ipk = 3.4;
        boolean isLulus = true;


        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks + " dengan IPK : " + ipk);
        System.out.println("Apakah saya lulus :" + isLulus);

        int a = 20; int b = 10;
        int c = 10; int d = 3;
        double hasil = c/d;

        System.out.println("Hasil perkalian 20 dan 10 = " + (a*b));
        System.out.println("Hasil pembagian 10/3 = " + (c/d));
        System.out.println("Hasil pembagian 10/3 = " + (double)(c/d));
        System.out.println("Hasil pembagian 10/3 = " + (c/d));
        System.out.println("Modulus : " + (c%d));

        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan Tanggal Lahir :");
        int tanggalLahir = input.nextInt();

        input.nextLine();

        System.out.println("Masukkan Nama Lengkap : ");
        String namaLengkap = input.nextLine();

        System.out.println(nama + " " + tanggalLahir);
        input.close();

    }
}
