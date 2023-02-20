// deklarasi kelas Sivitas
// kelas sivitas adalah child dari kelas human
public class Sivitas extends Human {
    // atribut private
    private String asal_universitas, email_edu;

    /* konstruktor */

    // konstruktor tanpa parameter
    public Sivitas() {
        // set isi atribut secara default
        this.asal_universitas = "";
        this.email_edu = "";
    }

    // konstruktor dengan parameter
    public Sivitas(String asal_universitas, String email_edu) {
        // set isi atribut secara default
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
    }
    /* Getter dan Setter */

    // Get asal_universitas
    public String getAsal_universitas() {
        return this.asal_universitas;
    }

    // set asal_universitas
    public void setAsal_universitas(String asal_universitas) {
        this.asal_universitas = asal_universitas;
    }

    // Get email_edu
    public String getEmail_edu() {
        return this.email_edu;
    }

    // set email_edu
    public void setEmail_edu(String email_edu) {
        this.email_edu = email_edu;
    }
}
