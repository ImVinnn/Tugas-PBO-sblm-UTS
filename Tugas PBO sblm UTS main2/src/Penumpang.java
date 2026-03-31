// File : Penumpang.java
// Deskripsi : Class Penumpang yang merepresentasikan penumpang dengan atribut idPen

public class Penumpang {
    // atribut idPenumpang, nama, noTelphone, dan email dengan akses private
    private String idPenumpang;
    private String nama;
    private String noTelphone;
    private String email;

    // constructor dengan parameter untuk inisialisasi atribut idPenumpang dan nama
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

    // method pesanTiket() untuk menampilkan pesan pemesanan tiket
    public void pesanTiket(Tiket tiket) {
        System.out.println(nama + " memesan tiket dengan ID: " + tiket.getIdTiket());
    }

    // getter dan setter untuk atribut idPenumpang, nama, noTelphone, dan email dengan validasi
    public String getIdPenumpang() {
        return idPenumpang;
    }

    // getter getNama() untuk mengakses nama penumpang
    public String getNama() {
        return nama;
    }

    // getter getNoTelphone() untuk mengakses nomor telepon penumpang
    public String getNoTelphone() {
        return noTelphone;
    }

    // getter getEmail() untuk mengakses email penumpang
    public String getEmail() {
        return email;
    }

    // setter setIdPenumpang() untuk input id penumpang dengan validasi
    public void setIdPenumpang(String idPenumpang) {
        if (idPenumpang == null || idPenumpang.isEmpty()) {
            throw new IllegalArgumentException("ID tidak boleh kosong");
        }
        this.idPenumpang = idPenumpang;
    }
    
    // setter setNama() untuk input nama penumpang dengan validasi
    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }
    
    // setter setNoTelphone() untuk input nomor telepon penumpang
    public void setNoTelphone(String noTelphone) {
        this.noTelphone = noTelphone;
    }
    
    // setter setEmail() untuk input email penumpang
    public void setEmail(String email) {
        this.email = email;
    }
}