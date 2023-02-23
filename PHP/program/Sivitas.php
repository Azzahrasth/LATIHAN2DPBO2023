<?php
// import file
require ('Human.php');

// deklarasi kelas Sivitas
class Sivitas extends Human {
    // atribut private
    private $asal_univ = '';
    private $email_edu = '';

    // konstruktor
    public function __construct( $asal_univ = '', $email_edu = ''  ) {
        $this->asal_univ = $asal_univ;
        $this->email_edu = $email_edu;
    }
 /* Getter dan Setter */
    public function set_asal_univ($asal_univ){
        $this->asal_univ = $asal_univ;
    }

    public function get_asal_univ(){
        return $this->asal_univ;
    }
    
    public function set_email_edu($email_edu){
        $this->email_edu = $email_edu;
    }
    public function get_email_edu(){
        return $this->email_edu;
    }

}

?>