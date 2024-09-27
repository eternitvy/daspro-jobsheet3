import java.util.Scanner;
public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam kerja: ");
        int jumlahJamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        double totalGajiSebelumPajak = jumlahJamKerja * upahPerJam;
        double gajiBonus = totalGajiSebelumPajak + (totalGajiSebelumPajak * 0.10);
        double gajiSetelahPajak = gajiBonus - (gajiBonus * 0.05);

        System.out.println("Total gaji sebelum pajak: " + totalGajiSebelumPajak);
        System.out.println("Gaji bonus\t\t: " + gajiBonus);
        System.out.println("Total gaji setelah pajak: " + gajiSetelahPajak);
    }
}