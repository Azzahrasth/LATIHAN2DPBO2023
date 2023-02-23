// import library
#include <iostream>
#include <string>
#include "Human.cpp"

// menggunakan standard namespace
using namespace std;

// deklarasi kelas Sivitas
class Sivitas : public Human
{
    // atribut private
private:
    string asal_univ, email_edu;

public:
    /* konstruktor */

    // konstruktor tanpa parameter
    Sivitas()
    {
        // set isi atribut secara default
        this->asal_univ = "";
        this->email_edu = "";
    }
    // konstruktor dengan parameter
    Sivitas(string asal_univ, string email_edu)
    {
        // set isi atribut berdasarkan isi parameter
        this->asal_univ = asal_univ;
        this->email_edu = email_edu;
    }

    /* Getter dan Setter*/

    // Get asal_univ
    string get_asal_univ()
    {
        return this->asal_univ;
    }

    // Set asal_univ
    void set_asal_univ(string asal_univ)
    {
        this->asal_univ = asal_univ;
    }

    // Get email_edu
    string get_email_edu()
    {
        return this->email_edu;
    }

    // Set email_edu
    void set_email_edu(string email_edu)
    {
        this->email_edu = email_edu;
    }

    /* desktruktor */

    // default
    ~Sivitas() // desktruktor
    {
    }
};
