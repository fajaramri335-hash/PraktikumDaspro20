import java.util.Scanner;

public class StudiKasus1_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi dan inisialisasi variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input data
        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextInt();

        // Hitung total harga awal
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Cek syarat diskon
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        // Hitung total bayar
        totalBayar = totalHarga - diskon;

        // Tampilkan ringkasan pembayaran
        System.out.println("\n--- Ringkasan Pembayaran ---");
        System.out.println("Total Harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar);

        // Cek kecukupan uang bayar
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        input.close();
    }
}