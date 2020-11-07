package cetak_nama;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan45 {

    public static void main(String[] args) {
        String nama;
        int jumlah;
        Printer orang1 = new Printer();
        Scanner scanner = new Scanner(System.in);

        //proses pengisian data
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda\t\t\t: ");
        orang1.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali?\t: ");
        orang1.setJmlCetak(scanner.nextInt());

        //proses pemanggilan method
        nama = orang1.getNama();
        jumlah = orang1.getJmlCetak();
        orang1.cetak(nama);
        orang1.cetak(jumlah,nama);
    }
}
