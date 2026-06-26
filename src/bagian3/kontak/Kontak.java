package bagian3.kontak;

public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Tambahan atribut baru

    // Constructor diperbarui untuk menerima 3 parameter
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() { // Tambahan getter baru
        return email;
    }

    // Mengubah objek menjadi satu baris teks dengan pemisah ";"
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak lengkap untuk ditampilkan
    public String info() {
        return nama + " - " + nomor + " (" + email + ")";
    }
}