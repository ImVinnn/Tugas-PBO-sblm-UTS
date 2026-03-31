// File : Masinis.java
// Deskripsi : Class Masinis yang merupakan subclass dari Petugas dan merepresentasikan masinis
// Anggota: 
// 1.Ida Bagus Ngurah Yudistira K (24060124140128)
// 2.Reynaldi Bertinus Hutagaol (24060124140157)
// 3.Mohammad Banyuputra Eka Pramudhita (24060124140193)
// 4.Laurensius Brian Prayoga (24060124130077)
// 5.Restu Surya (24060124130078)

public class Masinis extends Petugas {

    // constructor dengan parameter untuk inisialisasi atribut idPetugas dan nama
    public Masinis(String idPetugas, String nama) {
        super(idPetugas, nama);
    }

    // Override method kerja() dari abstract class Petugas
    @Override
    public void kerja() {
        System.out.println("Masinis " + getNama() + " sedang mengemudikan kereta.");
    }
}
