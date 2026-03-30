// File : Stasiun.java
// Deskripsi : Class Stasiun untuk menyimpan informasi tentang stasiun, seperti kode dan nama stasiun

public class Stasiun {
    private String kodeStasiun;
    private String namaStasiun;

    // Constructor untuk inisialisasi kode dan nama stasiun
    public Stasiun(String kodeStasiun, String namaStasiun) {
        this.kodeStasiun = kodeStasiun;
        this.namaStasiun = namaStasiun;
    }

    // Method untuk mengecek jadwal di stasiun
    public void cekJadwal() {
        System.out.println("Cek jadwal di stasiun " + namaStasiun);
    }

    // Setter untuk kode dan nama stasiun
    public String setKodeStasiun(String kodeStasiun) {
        this.kodeStasiun = kodeStasiun;
        return kodeStasiun;
    }

    public String setNamaStasiun(String namaStasiun) {
        this.namaStasiun = namaStasiun;
        return namaStasiun;
    }

    // Getter untuk kode dan nama stasiun
    public String getKodeStasiun() {
        return kodeStasiun;
    }

    public String getNamaStasiun() {
        return namaStasiun;
    }

    // Method untuk menampilkan informasi stasiun
    public void printStasiun() {
        System.out.println("Kode Stasiun: " + kodeStasiun);
        System.out.println("Nama Stasiun: " + namaStasiun);
    }
}