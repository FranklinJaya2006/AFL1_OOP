public class Penerbit {
    private int id_penerbit;
    private String alamat;
    private String nama;
    private String no_telp;
    private String email;

    // Constructor
    public Penerbit(int id_penerbit, String alamat, String nama, String no_telp, String email) {
        this.id_penerbit = id_penerbit;
        this.alamat = alamat;
        this.nama = nama;
        this.no_telp = no_telp;
        this.email = email;
    }

    // Getter dan Setter untuk id_penerbit
    public int getId_penerbit() {
        return id_penerbit;
    }

    public void setId_penerbit(int id_penerbit) {
        this.id_penerbit = id_penerbit;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk no_telp
    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    // Getter dan Setter untuk email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
