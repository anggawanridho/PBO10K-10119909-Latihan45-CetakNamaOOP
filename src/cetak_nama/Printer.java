package cetak_nama;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama){
        System.out.println("Nama Anda : "+ nama);
    }

    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak :");
        for (int i = 1; i <= jmlCetak; i++){
            System.out.printf("%d. %s%n", i, nama);
        }
    }
}
