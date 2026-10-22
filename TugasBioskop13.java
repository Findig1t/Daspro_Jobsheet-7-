import java.util.Scanner;

public class TugasBioskop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Harga_Tiket = 50000;
        int totalTiketTerjual = 0;
        double totalHargaPenjualan = 0;
        int jumlahTiket;

        System.out.println("===PROGRAM PENJUALAN TIKET BIOSKOP===");
        System.out.println("Ketik 0 untuk mengakhiri transaksi harian");

        while (true) {
            System.out.print("Masukkan Jumlah Tiket Yang Dibeli Pelanggan: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0 ) {
                System.out.println("Transaksi Harian Selesai. ");
                break;
            }
            
            if (jumlahTiket < 0 ) {
                System.out.println("Jumlah Tiket Tidak Valid! Masukkan Angka Positif.");
                continue;
            }

            double totalHargaTransaksi = jumlahTiket * Harga_Tiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4 ) {
                diskon = 0.10;
            }

            totalHargaTransaksi -= (totalHargaTransaksi * diskon);

            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalHargaTransaksi; 

            System.out.println("Total bayar Transaksi ini: Rp " + totalHargaTransaksi);
            System.out.println("-----------------------------------------");


        } 

        System.out.println("\n=== REKAP PENJUALAN HARIAN");
        System.out.println("Total tiket terjual " + totalTiketTerjual + " tiket ");
        System.out.println("Total Pendapatan Hari Ini: Rp " + totalHargaPenjualan);

    }
}