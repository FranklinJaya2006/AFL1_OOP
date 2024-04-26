// Kelas abstrak Pengguna
public abstract class Pengguna {
    private String nama;

    public Pengguna () {
        
    }

    // Constructor
    public Pengguna(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
