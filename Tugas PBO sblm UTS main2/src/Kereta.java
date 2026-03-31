// File : Kereta.java
// Deskripsi : Class Kereta yang merepresentasikan kereta api dengan atribut nomor, nama, dan class

public class Kereta {
    // atribut noKA, namaKA, dan kelasKA dengan akses private
    private String noKA;
    private String namaKA;
    private String kelasKA;

    // constructor dengan parameter untuk inisialisasi atribut
    public Kereta(String noKA, String namaKA, String kelasKA) {
        this.noKA = noKA;
        this.namaKA = namaKA;
        this.kelasKA = kelasKA;
    }

    // method ruteTujuan() untuk menampilkan rute tujuan kereta
    public void ruteTujuan(Stasiun asal, Stasiun tujuan) {
        System.out.println("Kereta " + namaKA + " berangkat dari " + asal.getNamaStasiun() + " ke " + tujuan.getNamaStasiun());
    }

    // getter getNoKA() untuk mengakses nomor kereta
    public String getNoKA() {
        return noKA;
    }

    // getter getNamaKA() untuk mengakses nama kereta
    public String getNamaKA() {
        return namaKA;
    }

    // getter getKelasKA() untuk mengakses kelas kereta
    public String getKelasKA() {
        return kelasKA;
    }
    
    // setter setNoKA() untuk input nomor kereta
    public void setNoKA(String noKA) {
        this.noKA = noKA;
    }

    // setter setNamaKA() untuk input nama kereta
    public void setNamaKA(String namaKA) {
        this.namaKA = namaKA;
    }

    // setter setKelasKA() untuk input kelas kereta
    public void setKelasKA(String kelasKA) {
        this.kelasKA = kelasKA;
    }
}