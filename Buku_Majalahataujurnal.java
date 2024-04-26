public class Buku_Majalahataujurnal extends item {
    private int isbnatauissn;
    private String edisi;
    private String jenis_sampul;

    // Constructor dengan parameter kosong
    public Buku_Majalahataujurnal() {
        super("", "", 0, 0, 0, 0); // Panggil konstruktor superclass dengan parameter kosong
        this.isbnatauissn = 0; // Inisialisasi nilai default untuk isbnatauissn
        this.edisi = ""; // Inisialisasi nilai default untuk edisi
        this.jenis_sampul = ""; // Inisialisasi nilai default untuk jenis_sampul
    }

    // Constructor
    public Buku_Majalahataujurnal(int kd_item, String judul, String tahun_terbit, int j_total, int j_pinjam, int j_rusak, int j_tersedia, int isbnatauissn, String edisi, String jenis_sampul) {
        super(judul, tahun_terbit, j_total, j_pinjam, j_rusak, j_tersedia);
        this.isbnatauissn = isbnatauissn;
        this.edisi = edisi;
        this.jenis_sampul = jenis_sampul;
    }

    // Getter dan Setter untuk isbnatauissn
    public int getIsbnatauissn() {
        return isbnatauissn;
    }

    public void setIsbnatauissn(int isbnatauissn) {
        this.isbnatauissn = isbnatauissn;
    }

    // Getter dan Setter untuk edisi
    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    // Getter dan Setter untuk jenis_sampul
    public String getJenis_sampul() {
        return jenis_sampul;
    }

    public void setJenis_sampul(String jenis_sampul) {
        this.jenis_sampul = jenis_sampul;
    }

    public static void add(Buku_Majalahataujurnal buku_Majalahataujurnal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
