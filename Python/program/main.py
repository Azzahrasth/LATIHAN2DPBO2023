# Saya Azzahra Siti Hadjar NIM 2100901 mengerjakan soal Latihan 2
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan
# seperti yang telah dispesifikasikan. Aamiin. 

# import class file
from Mahasiswa import Mahasiswa

# membuat list of objek mahasiswa
llist = []
# Intansiasi objek mahasiswa 1
mhs1 = Mahasiswa()
# inisialisasi mahasiswa 1 menggunakan method setter
mhs1.set_nik("11223344")
mhs1.set_nama("Azzahra_Siti")
mhs1.set_jenis_kelamin('P')
mhs1.set_asal_univ("UPI")
mhs1.set_email_edu("azzahrasth@upi.edu")
mhs1.set_nim("2100901")
mhs1.set_prodi("Ilmu_Komputer")
mhs1.set_fakultas("FPMIPA")
llist.append(mhs1)

# Intansiasi objek mahasiswa 2
mhs2 = Mahasiswa()
# inisialisasi mahasiswa 2 menggunakan method setter
mhs2.set_nik("12345678")
mhs2.set_nama("Choi_Yeonjun")
mhs2.set_jenis_kelamin('L')
mhs2.set_asal_univ("UPI")
mhs2.set_email_edu("yawnzzn@upi.edu")
mhs2.set_nim("2100111")
mhs2.set_prodi("Seni_Musik")
mhs2.set_fakultas("FPSD")
llist.append(mhs2)

# Intansiasi objek mahasiswa 3
mhs3 = Mahasiswa()
# inisialisasi mahasiswa 3 menggunakan method setter
mhs3.set_nik("12348765")
mhs3.set_nama("Ara_Zafira")
mhs3.set_jenis_kelamin('P')
mhs3.set_asal_univ("UPI")
mhs3.set_email_edu("zafiraa@upi.edu")
mhs3.set_nim("2101234")
mhs3.set_prodi("Kedokteran")
mhs3.set_fakultas("FK")
llist.append(mhs3)

# menampilkan isi list of objek mahasiswa
print("        ==== List Mahasiswa ====")
for mhs in llist:
    print("+--------------------------------------+")
    print("NIK             :", mhs.get_nik())
    print("Nama            :", mhs.get_nama())
    print("Jenis_Kelamin   :", mhs.get_jenis_kelamin())
    print("Asal_Univ       :", mhs.get_asal_univ())
    print("Email_Edu       :", mhs.get_email_edu())
    print("NIM             :", mhs.get_nim())
    print("Prodi           :", mhs.get_prodi())
    print("Fakultas        :", mhs.get_fakultas())
    print("+--------------------------------------+")
