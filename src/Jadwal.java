public class Jadwal {
    private String jamDatang;
    private String jamBerangkat;

    public Jadwal(String jamDatang, String jamBerangkat) {
        this.jamDatang = jamDatang;
        this.jamBerangkat = jamBerangkat;
    }

    public void tampilJadwal() {
        System.out.println("Jam Datang: " + jamDatang);
        System.out.println("Jam Berangkat: " + jamBerangkat);
    }
}