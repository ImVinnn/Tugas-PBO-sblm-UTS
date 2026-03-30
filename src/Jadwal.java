// File : Jadwal.java
// Desripsi : Class Jadwal untuk menyimpan informasi jadwal kedatangan dan keberangkatan kereta

public class Jadwal {
    private String jamDatang;
    private String jamBerangkat;

    // Constructor untuk inisialisasi jadwal kedatangan dan keberangkatan
    public Jadwal(String jamDatang, String jamBerangkat) {
        this.jamDatang = jamDatang;
        this.jamBerangkat = jamBerangkat;
    }

    // Method untuk menampilkan jadwal kedatangan dan keberangkatan
    public void tampilJadwal() {
        System.out.println("Jam Datang: " + jamDatang);
        System.out.println("Jam Berangkat: " + jamBerangkat);
    }

    // Setter untuk jam datang dan jam berangkat
    public String setJamDatang(String jamDatang) {
        this.jamDatang = jamDatang;
        return jamDatang;
    }

    public String setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
        return jamBerangkat;
    }


    // Getter untuk jam datang dan jam berangkat
    public String getJamDatang() {
        return jamDatang;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    // Method untuk menampilkan jadwal kedatangan dan keberangkatan
    public void printJadwal() {
        System.out.println("Jam Datang: " + jamDatang);
        System.out.println("Jam Berangkat: " + jamBerangkat);
    }

}