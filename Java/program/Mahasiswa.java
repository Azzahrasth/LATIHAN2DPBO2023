// deklarasi kelas mahasiswa
// kelas mahasiswa adalah child dari kelas Sivitas
public class Mahasiswa extends Sivitas {
    // atribut private
    private String nim, prodi, fakultas;

    /* konstruktor */

    // konstruktor tanpa parameter
    public Mahasiswa() {
        // set isi atribut secara default
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
    }

    /* Getter dan Setter */

    // Get nim
    public String getNim() {
        return this.nim;
    }

    // set nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // get prodi
    public String getProdi() {
        return this.prodi;
    }

    // set prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // get fakultas
    public String getFakultas() {
        return this.fakultas;
    }

    // set fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
