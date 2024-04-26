public class Mahasiswa extends Client {
    private int nim;

    public Mahasiswa () {
        
    }

    // Constructor
    public Mahasiswa(int nim, String fakultas, String nama, String prodi, int p_denda, int j_denda) {
        super(nama, fakultas, prodi, p_denda, j_denda); // Memanggil constructor superclass dengan parameter yang sesuai
        this.nim = nim;
    }

    // Getter dan Setter untuk nim
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}