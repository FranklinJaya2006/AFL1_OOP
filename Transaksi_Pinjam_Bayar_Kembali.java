public class Transaksi_Pinjam_Bayar_Kembali {
    private int kd_transaksi;
    private int tanggal_pinjam;
    private int tanggal_kembali;
    private String jenis_pembayaran;
    private int total_barang_rusak;
    private int total_bayar;
    private String status_buku;
    private int total_pinjam;
    private int isbnatauissn;
    private int id_pus;
    private int nimataunik;
    private int total_denda;

    // Constructor
    public Transaksi_Pinjam_Bayar_Kembali(int kd_transaksi, int tanggal_pinjam, int tanggal_kembali, String jenis_pembayaran, int total_barang_rusak, int total_bayar, String status_buku, int total_pinjam, int isbnatauissn, int id_pus, int nimataunik, int total_denda) {
        this.kd_transaksi = kd_transaksi;
        this.tanggal_pinjam = tanggal_pinjam;
        this.tanggal_kembali = tanggal_kembali;
        this.jenis_pembayaran = jenis_pembayaran;
        this.total_barang_rusak = total_barang_rusak;
        this.total_bayar = total_bayar;
        this.status_buku = status_buku;
        this.total_pinjam = total_pinjam;
        this.isbnatauissn = isbnatauissn;
        this.id_pus = id_pus;
        this.nimataunik = nimataunik;
        this.total_denda = total_denda;
    }

    // Getter dan Setter untuk kd_transaksi
    public int getKd_transaksi() {
        return kd_transaksi;
    }

    public void setKd_transaksi(int kd_transaksi) {
        this.kd_transaksi = kd_transaksi;
    }

    // Getter dan Setter untuk tanggal_pinjam
    public int getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(int tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

    // Getter dan Setter untuk tanggal_kembali
    public int getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(int tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }

    // Getter dan Setter untuk jenis_pembayaran
    public String getJenis_pembayaran() {
        return jenis_pembayaran;
    }

    public void setJenis_pembayaran(String jenis_pembayaran) {
        this.jenis_pembayaran = jenis_pembayaran;
    }

    // Getter dan Setter untuk total_barang_rusak
    public int getTotal_barang_rusak() {
        return total_barang_rusak;
    }

    public void setTotal_barang_rusak(int total_barang_rusak) {
        this.total_barang_rusak = total_barang_rusak;
    }

    // Getter dan Setter untuk total_bayar
    public int getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(int total_bayar) {
        this.total_bayar = total_bayar;
    }

    // Getter dan Setter untuk status_buku
    public String getStatus_buku() {
        return status_buku;
    }

    public void setStatus_buku(String status_buku) {
        this.status_buku = status_buku;
    }

    // Getter dan Setter untuk total_pinjam
    public int getTotal_pinjam() {
        return total_pinjam;
    }

    public void setTotal_pinjam(int total_pinjam) {
        this.total_pinjam = total_pinjam;
    }

    // Getter dan Setter untuk isbnatauissn
    public int getIsbnatauissn() {
        return isbnatauissn;
    }

    public void setIsbnatauissn(int isbnatauissn) {
        this.isbnatauissn = isbnatauissn;
    }

    // Getter dan Setter untuk id_pus
    public int getId_pus() {
        return id_pus;
    }

    public void setId_pus(int id_pus) {
        this.id_pus = id_pus;
    }

    // Getter dan Setter untuk nimataunik
    public int getNimataunik() {
        return nimataunik;
    }

    public void setNimataunik(int nimataunik) {
        this.nimataunik = nimataunik;
    }

    // Getter dan Setter untuk total_denda
    public int getTotal_denda() {
        return total_denda;
    }

    public void setTotal_denda(int total_denda) {
        this.total_denda = total_denda;
    }
}
