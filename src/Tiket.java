// File : Tiket.java
// Deskripsi : Class Tiket untuk menyimpan informasi tentang tiket, seperti ID dan harga

public class Tiket {
    private String idTiket;
    private double harga;

    public Tiket(String idTiket, double harga) {
        // Assertion: harga tidak boleh negatif
        assert harga >= 0 : "Harga tiket tidak boleh negatif";
        // Exception: idTiket tidak boleh null atau kosong
        if (idTiket == null || idTiket.isEmpty()) {
            throw new IllegalArgumentException("ID Tiket tidak boleh kosong");
        }
        this.idTiket = idTiket;
        this.harga = harga;
    }

    // Overloading method hitungHarga
    public double hitungHarga() {
        return harga;
    }

    public double hitungHarga(double diskon) {
        // Exception: diskon harus antara 0 dan 1
        if (diskon < 0 || diskon > 1) {
            throw new IllegalArgumentException("Diskon harus bernilai antara 0.0 dan 1.0");
        }
        return harga - (harga * diskon);
    }

    // Setter untuk ID dan harga tiket
    public String setIdTiket(String idTiket) {
        this.idTiket = idTiket;
        return idTiket;
    }
    
    public double setHarga(double harga) {
        // Assertion: harga tidak boleh negatif
        assert harga >= 0 : "Harga tiket tidak boleh negatif";
        this.harga = harga;
        return harga;
    }

    // Getter untuk ID dan harga tiket
    public String getIdTiket() {
        return idTiket;
    }

    public double getHarga() {
        return harga;
    }

    // Method untuk menampilkan informasi tiket
    public void printTiket() {
        System.out.println("ID Tiket: " + idTiket);
        System.out.println("Harga: " + harga);
    }
}