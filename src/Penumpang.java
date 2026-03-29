public class Penumpang {
    private String idPenumpang;
    private String nama;
    private String noTelphone;
    private String email;

    public Penumpang(String idPenumpang, String nama) {
        this.idPenumpang = idPenumpang;
        this.nama = nama;
    }

    public void pesanTiket() {
        System.out.println(nama + " sedang memesan tiket");
    }

    public String getIdPenumpang() {
        return idPenumpang;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelphone() {
        return noTelphone;
    }

    public String getEmail() {
        return email;
    }

}