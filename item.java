// Kelas abstrak Item
public abstract class item {
    private String judul;
    private int j_total;
    private int j_pinjam;
    private int j_rusak;
    private int j_tersedia;

    // Constructor
    public item(String judul, String tahun_terbit, int j_total, int j_pinjam, int j_rusak, int j_tersedia) {
        this.judul = judul;
        this.j_total = j_total;
        this.j_pinjam = j_pinjam;
        this.j_rusak = j_rusak;
        this.j_tersedia = j_tersedia;
    }

    // Getter dan Setter untuk judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }


    // Getter dan Setter untuk j_total
    public int getJ_total() {
        return j_total;
    }

    public void setJ_total(int j_total) {
        this.j_total = j_total;
    }

    // Getter dan Setter untuk j_pinjam
    public int getJ_pinjam() {
        return j_pinjam;
    }

    public void setJ_pinjam(int j_pinjam) {
        this.j_pinjam = j_pinjam;
    }

    // Getter dan Setter untuk j_rusak
    public int getJ_rusak() {
        return j_rusak;
    }

    public void setJ_rusak(int j_rusak) {
        this.j_rusak = j_rusak;
    }

    // Getter dan Setter untuk j_tersedia
    public int getJ_tersedia() {
        return j_tersedia;
    }

    public void setJ_tersedia(int j_tersedia) {
        this.j_tersedia = j_tersedia;
    }

    public void kurangiJumlahTersedia() {
        j_tersedia--;
    }
    
    // Metode untuk menambah jumlah dipinjam
    public void tambahJumlahDipinjam() {
        j_pinjam++;
    }
}
