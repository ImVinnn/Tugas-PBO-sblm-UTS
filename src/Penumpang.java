public class Penumpang {
    private String idPenumpang;
    private String nama;

    public Penumpang(String idPenumpang, String nama) {
        this.idPenumpang = idPenumpang;
        this.nama = nama;
    }

    public void pesanTiket() {
        System.out.println(nama + " sedang memesan tiket");
    }
}