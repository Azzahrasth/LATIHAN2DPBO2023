/* Saya Azzahra SIti Hadjar NIM 2100901 mengerjakan soal Latihan 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin. */

// Import library
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // membuat list of objek mahasiswa
        ArrayList<Mahasiswa> list = new ArrayList<>();

        // Intansiasi objek mahasiswa ke 1
        Mahasiswa mhs1 = new Mahasiswa();
        // inisialisasi mahasiswa 1 menggunakan method setter
        mhs1.setNik("11223344");
        mhs1.setNama("Azzahra_Siti");
        mhs1.setJenis_kelamin('P');
        mhs1.setAsal_universitas("UPI");
        mhs1.setEmail_edu("azzahrasth@upi.edu");
        mhs1.setNim("2100901");
        mhs1.setProdi("Ilmu_Komputer");
        mhs1.setFakultas("FPMIPA");
        list.add(mhs1);

        // Intansiasi objek mahasiswa ke 2
        Mahasiswa mhs2 = new Mahasiswa();
        // inisialisasi mahasiswa 2 menggunakan method setter
        mhs2.setNik("12345678");
        mhs2.setNama("Choi_Yeonjun");
        mhs2.setJenis_kelamin('L');
        mhs2.setAsal_universitas("UPI");
        mhs2.setEmail_edu("yawnzzn@upi.edu");
        mhs2.setNim("2100111");
        mhs2.setProdi("Seni_Musik");
        mhs2.setFakultas("FPSD");
        list.add(mhs2);

        // Intansiasi objek mahasiswa ke 3
        Mahasiswa mhs3 = new Mahasiswa();
        // inisialisasi mahasiswa 3 menggunakan method setter
        mhs3.setNik("12348765");
        mhs3.setNama("Ara_Zafira");
        mhs3.setJenis_kelamin('P');
        mhs3.setAsal_universitas("UPI");
        mhs3.setEmail_edu("zafiraa@upi.edu");
        mhs3.setNim("2101234");
        mhs3.setProdi("Kedokteran");
        mhs3.setFakultas("FK");
        list.add(mhs3);

        // menampilkan isi list of objek mahasiswa
        System.out.println("\n        ==== List Mahasiswa ====\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("+-------------------------------------+");
            System.out.println("NIK             :" + list.get(i).getNik());
            System.out.println("Nama            :" + list.get(i).getNama());
            System.out.println("Jenis Kelamin   :" + list.get(i).getJenis_kelamin());
            System.out.println("Asal Univ       :" + list.get(i).getAsal_universitas());
            System.out.println("Email Edu       :" + list.get(i).getEmail_edu());
            System.out.println("NIM             :" + list.get(i).getNim());
            System.out.println("Prodi           :" + list.get(i).getProdi());
            System.out.println("Fakultas        :" + list.get(i).getFakultas());
            System.out.println("+-------------------------------------+\n");
        }
    }
}