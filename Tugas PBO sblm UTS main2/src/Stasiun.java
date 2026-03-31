// File: Stasiun.java
// Deskripsi: Class Stasiun yang merepresentasikan stasiun dengan atribut kodeSt

public class Stasiun {
    // atribut kodeStasiun, namaStasiun, dan kota dengan akses private
    private String kodeStasiun;
    private String namaStasiun;
    private Kota kota;

    // constructor dengan parameter untuk inisialisasi atribut kodeStasiun, namaStasiun, dan kota
    public Stasiun(String kodeStasiun, String namaStasiun, Kota kota) {
        this.kodeStasiun = kodeStasiun;
        this.namaStasiun = namaStasiun;
        this.kota = kota;
    }

    // method cekJadwal() untuk menampilkan jadwal kedatangan dan keberangkatan kereta di stasiun
    public void cekJadwal() {
        System.out.println("Cek jadwal di stasiun " + namaStasiun);
    }

    // getter getKodeStasiun() untuk mengakses kode stasiun
    public String getKodeStasiun() {
        return kodeStasiun;
    }

    // getter getNamaStasiun() untuk mengakses nama stasiun
    public String getNamaStasiun() {
        return namaStasiun;
    }

    // getter getKota() untuk mengakses kota tempat stasiun berada
    public Kota getKota(){
        return kota;
    }

    // setter setKodeStasiun() untuk input kode stasiun
    public void setKodeStasiun(String kodeStasiun) {
        this.kodeStasiun = kodeStasiun;
    }
    
    // setter setNamaStasiun() untuk input nama stasiun
    public void setNamaStasiun(String namaStasiun) {
        this.namaStasiun = namaStasiun;
    }
    
    // setter setKota() untuk input kota tempat stasiun berada
    public void setKota(Kota kota) {
        this.kota = kota;
    }
}