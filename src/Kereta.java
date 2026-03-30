// File : Kereta.java
// Deskripsi : Class Kereta untuk menyimpan informasi tentang kereta, seperti nomor, nama, dan kelas

public class Kereta {
    private String noKA;
    private String namaKA;
    private String kelasKA;

    // Constructor untuk inisialisasi nomor, nama, dan kelas kereta
    public Kereta(String noKA, String namaKA, String kelasKA) {
        this.noKA = noKA;
        this.namaKA = namaKA;
        this.kelasKA = kelasKA;
    }

    // Method untuk menampilkan rute tujuan kereta
    public void ruteTujuan() {
        System.out.println("Menampilkan rute tujuan kereta " + namaKA);
    }

    // Setter untuk nomor, nama, dan kelas kereta
    public String setNoKA(String noKA) {
        this.noKA = noKA;
        return noKA;
    }

    public String setNamaKA(String namaKA) {
        this.namaKA = namaKA;
        return namaKA;
    }

    public String setKelasKA(String kelasKA) {
        this.kelasKA = kelasKA;
        return kelasKA;
    }


    // Getter untuk nomor, nama, dan kelas kereta
    public String getNoKA() {
        return noKA;
    }

    public String getNamaKA() {
        return namaKA;
    }

    public String getKelasKA() {
        return kelasKA;
    }

    // Method untuk menampilkan informasi kereta
    public void printKereta() {
        System.out.println("No KA: " + noKA);
        System.out.println("Nama KA: " + namaKA);
        System.out.println("Kelas KA: " + kelasKA);
    }
}