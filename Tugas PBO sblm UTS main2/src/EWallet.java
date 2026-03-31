// File : EWallet.java
// Deskripsi : Class EWallet yang mengimplementasikan interface Pembayaran

public class EWallet implements Pembayaran {
    // atribut saldo dan namaPemilik untuk menyimpan informasi saldo dan nama pemilik e-wallet
    private double saldo;
    private String namaPemilik;

    // constructor dengan parameter untuk inisialisasi atribut
    public EWallet(String namaPemilik, double saldo) {
        // Assertion: saldo awal tidak boleh negatif
        assert saldo >= 0 : "Saldo awal tidak boleh negatif";
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    //method bayar() dari interface Pembayaran
    @Override
    public void bayar(double jumlah) {
        // Exception jika jumlah pembayaran tidak valid
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah pembayaran harus lebih dari 0");
        }
        // Exception jika saldo tidak mencukupi
        if (jumlah > saldo) {
            throw new IllegalStateException("Saldo tidak mencukupi. Saldo saat ini: " + saldo);
        }
        saldo -= jumlah;
        System.out.println(namaPemilik + " berhasil membayar Rp" + jumlah + ". Sisa saldo: Rp" + saldo);
    }

    // getter ugetSaldo() untuk mengakses saldo
    public double getSaldo() {
        return saldo;
    }

    // getter getNamaPemilik() untuk mengakses nama pemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }
    
    // setter untuk saldo dan nama pemilik dengan validasi
    public void setSaldo(double saldo) {
    if (saldo < 0) {
        throw new IllegalArgumentException("Saldo tidak boleh negatif");
    }
    this.saldo = saldo;
    }

    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik == null || namaPemilik.isEmpty()) {
            throw new IllegalArgumentException("Nama pemilik tidak boleh kosong");
        }
        this.namaPemilik = namaPemilik;
    }
}
