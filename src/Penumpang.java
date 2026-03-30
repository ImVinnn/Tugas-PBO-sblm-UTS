// File : Penumpang.java
// Deskripsi : Class Penumpang untuk menyimpan informasi tentang penumpang, seperti ID, nama, nomor telepon, dan email

public class Penumpang {
    private String idPenumpang;
    private String nama;
    private String noTelphone;
    private String email;

    // Constructor untuk inisialisasi ID dan nama penumpang
    public Penumpang(String idPenumpang, String nama) {
        // Exception: parameter tidak boleh null atau kosong
        if (idPenumpang == null || idPenumpang.isEmpty()) {
            throw new IllegalArgumentException("ID Penumpang tidak boleh kosong");
        }
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama penumpang tidak boleh kosong");
        }
        this.idPenumpang = idPenumpang;
        this.nama = nama;
    }

    // Setter untuk ID, nama, nomor telepon, dan email penumpang
    public String setIdPenumpang(String idPenumpang) {
        this.idPenumpang = idPenumpang;
        return idPenumpang;
    }

    public String setNama(String nama) {
        this.nama = nama;
        return nama;
    }

    public String setNoTelphone(String noTelphone) {
        this.noTelphone = noTelphone;
        return noTelphone;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    // Getter untuk ID, nama, nomor telepon, dan email penumpang
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

    // Method untuk menampilkan informasi penumpang
    public void printPenumpang() {
        System.out.println("ID Penumpang: " + idPenumpang);
        System.out.println("Nama: " + nama);
        System.out.println("No Telphone: " + noTelphone);
        System.out.println("Email: " + email);
    }
}