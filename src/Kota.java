// File : Kota.java
// Deskripsi : Class Kota untuk menyimpan informasi tentang kota, seperti ID dan nama kota

public class Kota {
    private String idKota;
    private String namaKota;

    // Constructor untuk inisialisasi ID dan nama kota
    public Kota(String idKota, String namaKota) {
        this.idKota = idKota;
        this.namaKota = namaKota;
    }

    // Setter untuk ID dan nama kota
    public String setIdKota(String idKota) {
        this.idKota = idKota;
        return idKota;
    }

    public String setNamaKota(String namaKota) {
        this.namaKota = namaKota;
        return namaKota;
    }

    // Getter untuk ID dan nama kota
    public String getIdKota() {
        return idKota;
    }

    public String getNamaKota() {
        return namaKota;
    }

    // Method untuk menampilkan informasi kota
    public void printKota() {
        System.out.println("ID Kota: " + idKota);
        System.out.println("Nama Kota: " + namaKota);
    }
}