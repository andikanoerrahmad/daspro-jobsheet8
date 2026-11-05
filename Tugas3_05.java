import java.util.Scanner;

public class Tugas3_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko = 0;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);
        int totalBarangSeluruhToko = 0, tokoTerbanyak = 1, maxBarang = -1; 
        String ringkasanPerToko = "";
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("--- Toko " + i + " ---");
            int jumlahPelanggan = 0;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang = 0;
                do {
                    System.out.print("  Masukkan jumlah barang pelanggan ke-" + j + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang; 

            ringkasanPerToko = ringkasanPerToko + "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
            totalBarangSeluruhToko = totalBarangSeluruhToko + totalBarangToko;
            maxBarang = totalBarangToko;
            tokoTerbanyak = i;
            }
        }
        System.out.println("\nRingkasan yang diharapkan:");
        System.out.print(ringkasanPerToko);
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
