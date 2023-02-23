/* Saya Azzahra Siti Hadjar NIM 2100901 mengerjakan soal Latihan 2
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin. */

// import library dan file
#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

// menggunakan standarad namespace
using namespace std;

int main()
{
    // membuat list of objek mahasiswa
    list<Mahasiswa> llist;

    Mahasiswa mhs1; // Intansiasi objek mahasiswa 1
    // inisialisasi mahasiswa 1 menggunakan method setter
    mhs1.set_nik("11223344");
    mhs1.set_nama("Azzahra_Siti");
    mhs1.set_jenis_kelamin('P');
    mhs1.set_asal_univ("UPI");
    mhs1.set_email_edu("azzahrasth@upi.edu");
    mhs1.set_nim("2100901");
    mhs1.set_prodi("Ilmu_Komputer");
    mhs1.set_fakultas("FPMIPA");
    llist.push_back(mhs1);

    Mahasiswa mhs2; // Intansiasi objek mahasiswa 2
    // inisialisasi mahasiswa 2 menggunakan method setter
    mhs2.set_nik("12345678");
    mhs2.set_nama("Choi_Yeonjun");
    mhs2.set_jenis_kelamin('L');
    mhs2.set_asal_univ("UPI");
    mhs2.set_email_edu("yawnzzn@upi.edu");
    mhs2.set_nim("2100111");
    mhs2.set_prodi("Seni_Musik");
    mhs2.set_fakultas("FPSD");
    llist.push_back(mhs2);

    Mahasiswa mhs3; // Intansiasi objek mahasiswa 3
    // inisialisasi mahasiswa 3 menggunakan method setter
    mhs3.set_nik("12348765");
    mhs3.set_nama("Ara_Zafira");
    mhs3.set_jenis_kelamin('P');
    mhs3.set_asal_univ("UPI");
    mhs3.set_email_edu("zafiraa@upi.edu");
    mhs3.set_nim("2101234");
    mhs3.set_prodi("Kedokteran");
    mhs3.set_fakultas("FK");
    llist.push_back(mhs3);

    // menampilkan isi list of objek mahasiswa
    cout << "        ==== List Mahasiswa ====" << endl;
    for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
    {
        cout << "+--------------------------------------+" << endl;
        cout << "NIK             :" << it->get_nik() << endl;
        cout << "Nama            :" << it->get_nama() << endl;
        cout << "Jenis_Kelamin   :" << it->get_jenis_kelamin() << endl;
        cout << "Asal_Univ       :" << it->get_asal_univ() << endl;
        cout << "Email_Edu       :" << it->get_email_edu() << endl;
        cout << "NIM             :" << it->get_nim() << endl;
        cout << "Prodi           :" << it->get_prodi() << endl;
        cout << "Fakultas        :" << it->get_fakultas() << endl;
        cout << "+--------------------------------------+" << endl;
    }

    return 0;
}