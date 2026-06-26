package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya (Sekarang dengan email)
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        // Uji Coba Soal 1: cariKontak
        System.out.println("== Pengujian Cari Kontak ==");
        buku.cariKontak("Budi");
        buku.cariKontak("Dedi"); // Test jika tidak ada
        System.out.println();

        // Uji Coba Soal 3: hapusKontak
        System.out.println("== Pengujian Hapus Kontak ==");
        buku.hapusKontak("Andi"); 
        System.out.println();

        // Objek baru yang memuat kembali data terbaru dari berkas (Uji Soal 2)
        System.out.println("== Memuat Ulang dari Berkas ==");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak saat ini: " + bukuLain.jumlahKontak());
    }
}