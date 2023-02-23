<?php
// import file
require ('Sivitas.php');

// deklarasi kelas mahasiswa
class Mahasiswa extends Sivitas {
    // atribut private
    private $nim = '';
    private $prodi = '';
    private $fakultas = '';

    // konstruktor
    public function __construct( $nim = '', $prodi = '', $fakultas = '',$foto='' ) {
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }
 /* Getter dan Setter */
    public function set_nim($nim){
        $this->nim = $nim;
    }

    public function get_nim(){
        return $this->nim;
    }
    
    public function set_prodi($prodi){
        $this->prodi = $prodi;
    }

    public function get_prodi(){
        return $this->prodi;
    }
    
    public function set_fakultas($fakultas){
        $this->fakultas = $fakultas;
    }
    public function get_fakultas(){
        return $this->fakultas;
    }

}

?>