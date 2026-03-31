// File : Masinis.java
// Deskripsi : Class Masinis yang merupakan subclass dari Petugas dan merepresentasikan masinis

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
