public class Pengarang {
    private int id_pengarang;
    private String alamat;
    private String nama;
    private String no_telp;
    private String email;

    // Constructor
    public Pengarang(int id_pengarang, String alamat, String nama, String no_telp, String email) {
        this.id_pengarang = id_pengarang;
        this.alamat = alamat;
        this.nama = nama;
        this.no_telp = no_telp;
        this.email = email;
    }

    // Getter dan Setter untuk id_pengarang
    public int getId_pengarang() {
        return id_pengarang;
    }

    public void setId_pengarang(int id_pengarang) {
        this.id_pengarang = id_pengarang;
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
