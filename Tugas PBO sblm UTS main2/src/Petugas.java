// File: Petugas.java
// Deskripsi: Class Petugas yang merupakan abstract class dengan atribut idPetugas dan nama,

public abstract class Petugas {
    // atribut idPetugas dan nama dengan akses private
    private String idPetugas;
    private String nama;

    // constructor dengan parameter untuk inisialisasi atribut idPetugas dan nama
    public Petugas(String idPetugas, String nama) {
        // Assertion: idPetugas dan nama tidak boleh null atau kosong
        assert idPetugas != null && !idPetugas.isEmpty() : "ID Petugas tidak boleh kosong";
        assert nama != null && !nama.isEmpty() : "Nama petugas tidak boleh kosong";
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    // Abstract method yang wajib di-override oleh subclass
    public abstract void kerja();

    // getter getIdPetugas() untuk mengakses id petugas
    public String getIdPetugas() {
        return idPetugas;
    }

    // getter getNama() untuk mengakses nama petugas
    public String getNama() {
        return nama;
    }

    // setter setIdPetugas() untuk input id petugas dengan validasi
    public void setIdPetugas(String idPetugas) {
        if (idPetugas == null || idPetugas.isEmpty()) {
            throw new IllegalArgumentException("ID tidak boleh kosong");
        }
        this.idPetugas = idPetugas;
    }
    
    // setter setNama() untuk input nama petugas dengan validasi
    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }
}
