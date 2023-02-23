// import library
#include <iostream>
#include <string>

// menggunakan standard namespace
using namespace std;

// deklarasi kelas Human
class Human
{
    // atribut private
private:
    string nik, nama;
    char jenis_kelamin;

public:
    /* konstruktor */

    // konstruktor tanpa parameter
    Human()
    {
        // set isi atribut secara default
        this->nik = "";
        this->nama = "";
        this->jenis_kelamin = '-';
    }

    // konstruktor dengan parameter
    Human(string nik, string nama, char jenis_kelamin)
    {
        // set isi atribut berdasarkan isi parameter
        this->nik = nik;
        this->nama = nama;
        this->jenis_kelamin = jenis_kelamin;
    }

    /* Getter dan Setter*/

    // Get nik
    string get_nik()
    {
        return this->nik;
    }

    // Set nik
    void set_nik(string nik)
    {
        this->nik = nik;
    }
    // Get nama
    string get_nama()
    {
        return this->nama;
    }

    // Set nama
    void set_nama(string nama)
    {
        this->nama = nama;
    }

    // Get jenis_kelamin
    char get_jenis_kelamin()
    {
        return this->jenis_kelamin;
    }

    // Set jenis_kelamin
    void set_jenis_kelamin(char jenis_kelamin)
    {
        this->jenis_kelamin = jenis_kelamin;
    }

    /* desktruktor */

    // default
    ~Human() // desktruktor
    {
    }
};
