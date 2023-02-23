<?php

// deklarasi kelas Human
class Human {
    // atribut private
    private $nik = '';
    private $nama = '';
    private $jenis_kelamin = '';

    // konstruktor
    public function __construct( $nik = '', $nama = '' , $jenis_kelamin = '') {
        $this->nik = $nik;
        $this->nama = $nama;
        $this->jenis_kelamin = $jenis_kelamin;
    }
 /* Getter dan Setter */
    public function set_nik($nik){
        $this->nik = $nik;
    }

    public function get_nik(){
        return $this->nik;
    }
    
    public function set_nama($nama){
        $this->nama = $nama;
    }
    public function get_nama(){
        return $this->nama;
    }
    public function set_jenis_kelamin($jenis_kelamin){
        $this->jenis_kelamin = $jenis_kelamin;
    }

    public function get_jenis_kelamin(){
        return $this->jenis_kelamin;
    }

}

?>