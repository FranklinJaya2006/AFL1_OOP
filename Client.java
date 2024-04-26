// Kelas abstrak PenggunaPendidikan
public abstract class Client extends Pengguna {
    private String fakultas;
    private String nama;
    private String prodi;
    private int p_denda;
    private int j_denda;

    public Client () {}

    // Constructor
    public Client(String nama, String fakultas, String prodi, int p_denda, int j_denda) {
        super(); // Memanggil constructor superclass dengan parameter yang sesuai
        this.fakultas = fakultas;
        this.nama = nama;
        this.prodi = prodi;
        this.p_denda = p_denda;
        this.j_denda = j_denda;
    }

    // Getter dan Setter untuk fakultas
    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk prodi
    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Getter dan Setter untuk p_denda
    public int getP_denda() {
        return p_denda;
    }

    public void setP_denda(int p_denda) {
        this.p_denda = p_denda;
    }

    // Getter dan Setter untuk j_denda
    public int getJ_denda() {
        return j_denda;
    }

    public void setJ_denda(int j_denda) {
        this.j_denda = j_denda;
    }
}
