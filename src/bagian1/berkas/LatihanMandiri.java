package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) throws IOException {

        // 1. Mengecek file laporan.txt
        File laporan = new File("laporan.txt");

        System.out.println("=== SOAL 1 ===");
        if (laporan.exists()) {
            System.out.println("File laporan.txt ada");
            System.out.println("Ukuran file: " + laporan.length() + " byte");
        } else {
            System.out.println("File laporan.txt tidak ada");
        }

        // 2. Membuat folder arsip
        File arsip = new File("arsip");

        System.out.println("\n=== SOAL 2 ===");
        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada");
        }

        // 3. Membuat dan menghapus file sementara.txt
        File sementara = new File("sementara.txt");

        System.out.println("\n=== SOAL 3 ===");

        sementara.createNewFile();

        System.out.println("Sebelum dihapus: " + sementara.exists());

        sementara.delete();

        System.out.println("Sesudah dihapus: " + sementara.exists());
    }
    
}
