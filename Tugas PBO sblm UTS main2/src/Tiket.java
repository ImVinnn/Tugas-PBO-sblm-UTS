// Tiket.java
// Deskripsi : Class Tiket yang merepresentasikan tiket dengan atribut idTiket, harga
// Anggota: 
// 1.Ida Bagus Ngurah Yudistira K (24060124140128)
// 2.Reynaldi Bertinus Hutagaol (24060124140157)
// 3.Mohammad Banyuputra Eka Pramudhita (24060124140193)
// 4.Laurensius Brian Prayoga (24060124130077)
// 5.Restu Surya (24060124130078)

public class Tiket {
    // atribut idTiket, harga, jadwal, dan pembayaran dengan akses private
    private String idTiket;
    private double harga;
    private Jadwal jadwal;
    private Pembayaran pembayaran;

    // constructor dengan parameter untuk inisialisasi atribut idTiket, harga, jadwal, dan pembayaran
    public Tiket(String idTiket, double harga, Jadwal jadwal, Pembayaran pembayaran) {
        // Assertion: harga tidak boleh negatif
        assert harga >= 0 : "Harga tiket tidak boleh negatif";
        // Exception: idTiket tidak boleh null atau kosong
        if (idTiket == null || idTiket.isEmpty()) {
            throw new IllegalArgumentException("ID Tiket tidak boleh kosong");
        }
        this.idTiket = idTiket;
        this.harga = harga;
        this.jadwal = jadwal;
        this.pembayaran = pembayaran;
    }

    // Overloading method hitungHarga
    public double hitungHarga() {
        return harga;
    }

    // Overloading method hitungHarga dengan parameter diskon
    public double hitungHarga(double diskon) {
        // Exception: diskon harus antara 0 dan 1
        if (diskon < 0 || diskon > 1) {
            throw new IllegalArgumentException("Diskon harus bernilai antara 0.0 dan 1.0");
        }
        return harga - (harga * diskon);
    }

    // method bayarTiket() untuk melakukan pembayaran tiket menggunakan objek pembayaran
    public void bayarTiket() {
        pembayaran.bayar(harga);
    }

    // getter dan setter untuk atribut idTiket, harga, jadwal, dan pembayaran dengan validasi
    public String getIdTiket() {
        return idTiket;
    }

    // getter getHarga() untuk mengakses harga tiket
    public double getHarga() {
        return harga;
    }

    // getter getJadwal() untuk mengakses jadwal keberangkatan tiket
    public Jadwal getJadwal() {
        return jadwal;
    }

    // getter getPembayaran() untuk mengakses objek pembayaran yang digunakan untuk membayar tiket
    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    // setter setIdTiket() untuk input id tiket dengan validasi
    public void setIdTiket(String idTiket) {
        if (idTiket == null || idTiket.isEmpty()) {
            throw new IllegalArgumentException("ID Tiket tidak boleh kosong");
        }
        this.idTiket = idTiket;
    }
    
    // setter setHarga() untuk input harga tiket dengan validasi
    public void setHarga(double harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }
    
    // setter setJadwal() untuk input jadwal keberangkatan tiket
    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
    
    // setter setPembayaran() untuk input objek pembayaran yang digunakan untuk membayar tiket
    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }
}