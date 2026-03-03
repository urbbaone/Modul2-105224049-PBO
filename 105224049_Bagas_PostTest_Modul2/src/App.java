import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PAYROLL PERUSAHAAN ===");
        
        // 1. Input Nama Karyawan
        System.out.print("Nama Karyawan    : ");
        String namaKaryawan = input.nextLine();

        // 2. Input Gaji Pokok
        System.out.print("Gaji Pokok (Rp)  : ");
        double gajiPokok = input.nextDouble();

        // 3. Input Jumlah Jam Lembur
        System.out.print("Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        // ===Aturan Perhitungan===
        
        // 1. Upah Lembur per Jam
        double upahLemburPerJam = gajiPokok / 173;

        // 2. Total Uang Lembur
        double totalUangLembur = jamLembur * upahLemburPerJam;

        // 3. Gaji Kotor (Bruto)
        double gajiBruto = gajiPokok + totalUangLembur;

        // 4. Pajak Penghasilan (5% dari Gaji Bruto)
        double pajak = 0.05 * gajiBruto;

        // 5. Potongan BPJS (1% dari Gaji Pokok)
        double potonganBPJS = 0.01 * gajiPokok;

        // 6. Gaji Bersih (Netto)
        double gajiNetto = gajiBruto - pajak - potonganBPJS;

        // ===Output Slip Gaji===
        System.out.println("===SLIP GAJI=== ");
        System.out.println("Karyawan          : " + namaKaryawan);
        System.out.println("Upah Lembur/Jam   : Rp " + upahLemburPerJam);
        System.out.println("Total Uang Lembur : Rp " + totalUangLembur);
        System.out.println("Gaji Bruto        : Rp " + gajiBruto);
        System.out.println("---------------------------------");
        System.out.println("Potongan Pajak    : Rp " + pajak);
        System.out.println("Potongan BPJS     : Rp " + potonganBPJS);
        System.out.println("---------------------------------");
        System.out.println("GAJI BERSIH       : Rp " + gajiNetto);
        System.out.println("=================================");
        input.close();
    }
}