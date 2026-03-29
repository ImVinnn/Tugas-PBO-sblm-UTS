public class Tiket {
    private String idTiket;
    private double harga;

    public Tiket(String idTiket, double harga) {
        this.idTiket = idTiket;
        this.harga = harga;
    }

    public double hitungHarga() {
        return harga;
    }

    public double hitungHarga(double diskon) {
        return harga - (harga * diskon);
    }

    public String getIdTiket() {
        return idTiket;
    }

    public double getHarga() {
        return harga;
    }
}