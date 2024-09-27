import java.util.Scanner;
public class Kafe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam kerja: ");
        int jumlahJamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        double totalGajiSebelumPajak = jumlahJamKerja * upahPerJam;
        double gajiBonus = totalGajiSebelumPajak + (totalGajiSebelumPajak * 0.10);
        double gajiSetelahPajak = gajiBonus - (gajiBonus * 0.05);

        
    }
}