// Kelas Pustakawan
public class Pustakawan {
    private int id_pus;
    private String username;
    private String password;
    private char j_kel;
    private int level;
    private String email;
    private String no_telp;

    public Pustakawan () {
        
    }

    // Constructor
    public Pustakawan(int id_pus, String nama, String email, String no_telp, String username, String password, char j_kel, int level) {
        this.id_pus = id_pus;
        this.username = username;
        this.password = password;
        this.j_kel = j_kel;
        this.level = level;
        this.email = email; // Menambahkan atribut email
        this.no_telp = no_telp; // Menambahkan atribut no_telp
    }

    // Getter dan Setter untuk id_pus
    public int getId_pus() {
        return id_pus;
    }

    public void setId_pus(int id_pus) {
        this.id_pus = id_pus;
    }

    // Getter dan Setter untuk email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter dan Setter untuk no_telp
    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    // Getter dan Setter untuk username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter dan Setter untuk password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter dan Setter untuk j_kel
    public char getJ_kel() {
        return j_kel;
    }

    public void setJ_kel(char j_kel) {
        this.j_kel = j_kel;
    }

    // Getter dan Setter untuk level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}