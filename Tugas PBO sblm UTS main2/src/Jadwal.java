// File : Jadwal.java
// Deskripsi : Class Jadwal yang merepresentasikan jadwal kedatangan dan keberangkatan kereta di stasiun
// Anggota: 
// 1.Ida Bagus Ngurah Yudistira K (24060124140128)
// 2.Reynaldi Bertinus Hutagaol (24060124140157)
// 3.Mohammad Banyuputra Eka Pramudhita (24060124140193)
// 4.Laurensius Brian Prayoga (24060124130077)
// 5.Restu Surya (24060124130078)

public class Jadwal {
    // atribut jamDatang, jamBerangkat, kereta, dan stasiun dengan akses private
    private String jamDatang;
    private String jamBerangkat;
    private Kereta kereta;
    private Stasiun stasiun;

    // constructor dengan parameter untuk inisialisasi atribut
    public Jadwal(String jamDatang, String jamBerangkat, Kereta kereta, Stasiun stasiun) {
        this.jamDatang = jamDatang;
        this.jamBerangkat = jamBerangkat;
        this.kereta = kereta;
        this.stasiun = stasiun;
    }


    // method untuk menampilkan jadwal
    public void tampilJadwal() {
        System.out.println("Jam Datang: " + jamDatang);
        System.out.println("Jam Berangkat: " + jamBerangkat);
    }

    // getter getJamDatang() untuk mengakses jam datang
    public String getJamDatang() {
        return jamDatang;
    }

    // getter getJamBerangkat() untuk mengakses jam berangkat
    public String getJamBerangkat() {
        return jamBerangkat;
    }

    // getter getKereta() untuk mengakses kereta
    public Kereta getKereta() {
        return kereta;
    }

    // getter getStasiun() untuk mengakses stasiun
    public Stasiun getStasiun() {
        return stasiun;
    }

    // setter setJamDatang() untuk input jam datang
    public void setJamDatang(String jamDatang) {
        this.jamDatang = jamDatang;
    }

    // setter setJamBerangkat() untuk input jam berangkat
    public void setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }
    
    // setter setKereta() untuk input kereta
    public void setKereta(Kereta kereta) {
        this.kereta = kereta;
    }
    
    // setter setStasiun() untuk input stasiun
    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

}