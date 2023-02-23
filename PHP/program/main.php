<!-- Saya Azzahra Siti Hadjar NIM 2100901 mengerjakan soal Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin.  -->

<?php
// import file
require ('Mahasiswa.php');

// membuat list of objek mahasiswa
$arraymhs = array(); 
# Intansiasi objek mahasiswa 1
$mhs1 = new Mahasiswa();
// inisialisasi mahasiswa 1 menggunakan method setter
$mhs1->set_nik("11223344");
$mhs1->set_nama("Azzahra_Siti");
$mhs1->set_jenis_kelamin('P');
$mhs1->set_asal_univ("UPI");
$mhs1->set_email_edu("azzahrasth@upi.edu");
$mhs1->set_nim("2100901");
$mhs1->set_prodi("Ilmu_Komputer");
$mhs1->set_fakultas("FPMIPA");
array_push($arraymhs, $mhs1);

# Intansiasi objek mahasiswa 2
$mhs2 = new Mahasiswa();
// inisialisasi mahasiswa 2 menggunakan method setter
$mhs2->set_nik("12345678");
$mhs2->set_nama("Choi_Yeonjun");
$mhs2->set_jenis_kelamin('L');
$mhs2->set_asal_univ("UPI");
$mhs2->set_email_edu("yawnzzn@upi.edu");
$mhs2->set_nim("2100111");
$mhs2->set_prodi("Seni_Musik");
$mhs2->set_fakultas("FPSD");
array_push($arraymhs, $mhs2);

# Intansiasi objek mahasiswa 3
$mhs3 = new Mahasiswa();
// inisialisasi mahasiswa 3 menggunakan method setter
$mhs3->set_nik("12348765");
$mhs3->set_nama("Ara_Zafira");
$mhs3->set_jenis_kelamin('P');
$mhs3->set_asal_univ("UPI");
$mhs3->set_email_edu("zafiraa@upi.edu");
$mhs3->set_nim("2101234");
$mhs3->set_prodi("Kedokteran");
$mhs3->set_fakultas("FK");
array_push($arraymhs, $mhs3);

// menampilkan isi list of objek mahasiswa dalam bentuk tabel 
echo '<center>List Mahasiswa<br><br>';
// judul kolom tabel
echo "<center><table border='3'>";
        echo "<tr>
            <th> NIK </th>
            <th> Nama </th>
            <th> Jenis Kelamin </th>
            <th> Asal Univ </th>
            <th> Email Edu </th>
            <th> NIM </th>
            <th> Prodi </th>
            <th> Fakultas </th>
            </tr>";
// isi kolom tabel
for ($i=0; $i < count($arraymhs); $i++)
{
echo "<tr><td>";
                echo $arraymhs[$i]->get_nik();
                echo "</td><td>";
                echo $arraymhs[$i]->get_nama();
                echo "</td><td>";
                echo $arraymhs[$i]->get_jenis_kelamin();
                echo "</td><td>";
                echo $arraymhs[$i]->get_asal_univ();
                echo "</td><td>";
                echo $arraymhs[$i]->get_email_edu();
                echo "</td><td>";
                echo $arraymhs[$i]->get_nim();
                echo "</td><td>";
                echo $arraymhs[$i]->get_prodi();
                echo "</td><td>";
                echo $arraymhs[$i]->get_fakultas();
                echo "</td>";
                echo "</tr>";
    }
 echo "</table> </center>";
        
?>