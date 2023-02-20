// deklarasi kelas Human
public class Human {
    // atribut private
    private String nik, nama;
    private char jenis_kelamin;

    /* konstruktor */

    // konstruktor tanpa parameter
    public Human() {
        // set isi atribut secara default
        this.nik = "";
        this.nama = "";
        this.jenis_kelamin = '-';
    }

    // konstruktor dengan parameter
    public Human(String nik, String nama, char jenis_kelamin) {
        // set isi atribut secara default
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
    }

    /* Getter dan Setter */

    // Get nik
    public String getNik() {
        return this.nik;
    }

    // set nik
    public void setNik(String nik) {
        this.nik = nik;
    }

    // Get nama
    public String getNama() {
        return this.nama;
    }

    // set nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // get jenis_kelamin
    public char getJenis_kelamin() {
        return this.jenis_kelamin;
    }

    // set jenis_kelamin
    public void setJenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
}
