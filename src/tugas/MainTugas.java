//NAMA : RANTI MAULIDA
//NPM  : 2410010134

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String namaBerkas = "barang.txt";

        // ==========================================
        // Bagian Tambahan 1: Array Kategori (Ukuran Tetap)
        // ==========================================
        System.out.println("=== KATEGORI BARANG TOKO ===");
        String[] kategori = {"Elektronik", "Pakaian", "Makanan & Minuman"};
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println("-------------------------------------------------");

        // ==========================================
        // Bagian Utama: Instansiasi & Pengisian Objek
        // ==========================================
        Gudang gudangUtama = new Gudang();

        // Menambahkan minimal 5 objek Barang
        gudangUtama.tambahBarang(new Barang("Laptop Asus", 12500000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 150000, 20));
        gudangUtama.tambahBarang(new Barang("Kemeja Flanel", 199000, 15));
        gudangUtama.tambahBarang(new Barang("Kopi Susu Botol", 15000, 50));
        gudangUtama.tambahBarang(new Barang("Keyboard Berlampu", 450000, 8));

        System.out.println("\n=== MENAMPILKAN DATA GUDANG AWAL ===");
        gudangUtama.tampilkanSemua();
        System.out.printf("Total Nilai Persediaan Awal: Rp%.2f\n", gudangUtama.totalNilai());
        System.out.println("-------------------------------------------------");

        // Bagian Tambahan 2: Menyimpan seluruh data ke berkas teks
        System.out.println("\n=== PROSES PENYIMPANAN ===");
        gudangUtama.simpanKeBerkas(namaBerkas);
        System.out.println("-------------------------------------------------");


        // ==========================================
        // Bagian Tambahan 3: Pembuktian Data Terpanen/Tersimpan
        // ==========================================
        System.out.println("\n=== PROSES MEMBACA ULANG DENGAN GUDANG BARU ===");
        // Membuat objek Gudang baru untuk membuktikan data benar-benar terbaca dari file
        Gudang gudangBaru = new Gudang();
        
        // Memuat kembali data dari berkas
        gudangBaru.muatDariBerkas(namaBerkas);

        // Menampilkan kembali data hasil load dan total nilainya
        System.out.println("\n=== DATA BARANG HASIL RE-LOAD ===");
        gudangBaru.tampilkanSemua();
        System.out.printf("Total Nilai Persediaan (Terbukti): Rp%.2f\n", gudangBaru.totalNilai());
        System.out.println("-------------------------------------------------");
    }
}