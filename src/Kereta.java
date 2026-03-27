public class Kereta {
    private String noKA;
    private String namaKA;
    private String kelasKA;

    public Kereta(String noKA, String namaKA, String kelasKA) {
        this.noKA = noKA;
        this.namaKA = namaKA;
        this.kelasKA = kelasKA;
    }

    public void ruteTujuan() {
        System.out.println("Menampilkan rute tujuan kereta " + namaKA);
    }
}