public class Kategori {
    private int kd_kategori;
    private String deskripsi;
    private String nama;

    // Constructor
    public Kategori(int kd_kategori, String deskripsi, String nama) {
        this.kd_kategori = kd_kategori;
        this.deskripsi = deskripsi;
        this.nama = nama;
    }
    
    // Getter dan Setter untuk kd_kategori
    public int getKd_kategori() {
        return kd_kategori;
    }
    
    public void setKd_kategori(int kd_kategori) {
        this.kd_kategori = kd_kategori;
    }
    
        // Getter dan Setter untuk deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
}
