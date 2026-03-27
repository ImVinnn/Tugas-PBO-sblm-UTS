public class Stasiun {
    private String kodeStasiun;
    private String namaStasiun;

    public Stasiun(String kodeStasiun, String namaStasiun) {
        this.kodeStasiun = kodeStasiun;
        this.namaStasiun = namaStasiun;
    }

    public void cekJadwal() {
        System.out.println("Cek jadwal di stasiun " + namaStasiun);
    }
}