// File : Kota.java
// Deskripsi : Class Kota yang merepresentasikan kota dengan atribut id dan nama
// Anggota: 
// 1.Ida Bagus Ngurah Yudistira K (24060124140128)
// 2.Reynaldi Bertinus Hutagaol (24060124140157)
// 3.Mohammad Banyuputra Eka Pramudhita (24060124140193)
// 4.Laurensius Brian Prayoga (24060124130077)
// 5.Restu Surya (24060124130078)

public class Kota {
    // atribut idKota dan namaKota dengan akses private
    private String idKota;
    private String namaKota;

    // constructor dengan parameter untuk inisialisasi atribut idKota dan namaKota
    public Kota(String idKota, String namaKota) {
        this.idKota = idKota;
        this.namaKota = namaKota;
    }

    // getter getIdKota() untuk mengakses id kota
    public String getIdKota() {
        return idKota;
    }

    // getter getNamaKota() untuk mengakses nama kota
    public String getNamaKota() {
        return namaKota;
    }

    // setter setIdKota() untuk input id kota dengan validasi
    public void setIdKota(String idKota) {
        if (idKota == null || idKota.isEmpty()) {
            throw new IllegalArgumentException("ID Kota tidak boleh kosong");
        }
        this.idKota = idKota;
    }
    
    // setter setNamaKota() untuk input nama kota dengan validasi
    public void setNamaKota(String namaKota) {
        if (namaKota == null || namaKota.isEmpty()) {
            throw new IllegalArgumentException("Nama kota tidak boleh kosong");
        }
        this.namaKota = namaKota;
    }
}