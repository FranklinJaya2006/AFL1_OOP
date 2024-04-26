// Kelas CD
public class CD extends item {
    private int kd_cd;

    // Constructor
    public CD(int kd_cd, String judul, String tahun_terbit, int j_total, int j_pinjam, int j_rusak, int j_tersedia) {
        super(judul, tahun_terbit, j_total, j_pinjam, j_rusak, j_tersedia);
        this.kd_cd = kd_cd;

    }

    // Getter dan Setter untuk kd_cd
    public int getKd_cd() {
        return kd_cd;
    }

    public void setKd_cd(int kd_cd) {
        this.kd_cd = kd_cd;
    }
}
