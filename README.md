# Jobsheet-10
## Deskripsi
Program ini adalah implementasi sederhana dari sistem manajemen tugas mahasiswa menggunakan konsep _Stack_ (tumpukan). Mahasiswa dapat mengumpulkan tugas, tugas dapat dinilai oleh dosen, dan daftar tugas yang telah dikumpulkan dapat dilihat.

## Fitur
- **Mengumpulkan Tugas**: Mahasiswa dapat memasukkan nama, NIM, dan kelas untuk menyimpan tugas mereka dalam sistem.
- **Menilai Tugas**: Dosen dapat memberikan nilai untuk tugas yang telah dikumpulkan.
- **Melihat Tugas Teratas**: Sistem dapat menampilkan tugas yang terakhir dikumpulkan.
- **Melihat Daftar Tugas**: Semua tugas yang telah dikumpulkan dapat ditampilkan.

## Struktur Kode
Program ini terdiri dari beberapa kelas utama:
- `Mahasiswa02`: Merepresentasikan data mahasiswa dan nilai tugas mereka.
- `StackTugasMahasiswa02`: Implementasi _Stack_ untuk menyimpan dan mengelola tugas mahasiswa.
- `MahasiswaMain02`: Mengelola interaksi dengan pengguna melalui menu berbasis teks.

## Cara Menjalankan
1. Pastikan kamu memiliki Java Development Kit (JDK) terinstal di sistem.
2. Kompilasi semua file dengan perintah:
   ```sh
   javac Mahasiswa02.java StackTugasMahasiswa02.java MahasiswaMain02.java
