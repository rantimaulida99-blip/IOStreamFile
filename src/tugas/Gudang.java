package tugas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftarBarang;

    // Constructor
    public Gudang() {
        this.daftarBarang = new ArrayList<>();
    }

    // Method tambahBarang
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    // Method tampilkanSemua
    public void tampilkanSemua() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Gudang kosong.");
            return;
        }
        for (Barang barang : daftarBarang) {
            barang.info();
        }
    }

    // Method simpanKeBerkas
    public void simpanKeBerkas(String namaBerkas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaBerkas))) {
            for (Barang barang : daftarBarang) {
                writer.write(barang.keBaris());
                writer.newLine();
            }
            System.out.println("Berhasil menyimpan data ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan berkas: " + e.getMessage());
        }
    }

    // Method muatDariBerkas
    public void muatDariBerkas(String namaBerkas) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            // Kosongkan daftar terlebih dahulu sebelum memuat ulang
            daftarBarang.clear(); 
            
            while ((baris = reader.readLine()) != null) {
                String[] data = baris.split(",");
                if (data.length == 3) {
                    String nama = data[0];
                    double harga = Double.parseDouble(data[1]);
                    int stok = Integer.parseInt(data[2]);
                    
                    Barang barang = new Barang(nama, harga, stok);
                    daftarBarang.add(barang);
                }
            }
            System.out.println("Berhasil memuat data dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat berkas: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Format data di dalam berkas rusak: " + e.getMessage());
        }
    }

    // Method totalNilai (menjumlahkan harga * stok dari seluruh barang)
    public double totalNilai() {
        double total = 0;
        for (Barang barang : daftarBarang) {
            total += barang.getHarga() * barang.getStok();
        }
        return total;
    }
}