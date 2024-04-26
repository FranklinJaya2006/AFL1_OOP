// Kelas Dosen_Staff
public class Dosen_Staff extends Client {
    private int nik;

    public Dosen_Staff () {
        
    }

    // Constructor
    public Dosen_Staff(int nik, String fakultas, String nama, String prodi, int p_denda, int j_denda) {
        super(nama, fakultas, prodi, p_denda, j_denda); // Memanggil constructor superclass dengan parameter yang sesuai
        this.nik = nik;
    }

    // Getter dan Setter untuk nik
    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }
}
