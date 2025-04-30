# 📄 Sistem Pengelolaan Surat Izin Mahasiswa (Java CLI)
Program ini merupakan aplikasi Java sederhana berbasis CLI (Command Line Interface) yang digunakan untuk **mengelola surat izin mahasiswa** menggunakan **struktur data stack**. Setiap surat izin yang diterima akan disimpan dan diproses sesuai urutan (LIFO – Last In First Out).

## 🧩 Fitur Program

1. **Terima Surat Izin**  
   Pengguna dapat memasukkan data surat izin mahasiswa, termasuk:
   - ID Surat
   - Nama Mahasiswa
   - Kelas
   - Jenis Izin (`S` untuk sakit, `I` untuk keperluan lain)
   - Durasi (jumlah hari izin)

2. **Proses Surat Izin**  
   Memproses (menghapus dan mencetak) surat izin paling terakhir yang masuk.

3. **Lihat Surat Izin Terakhir**  
   Melihat isi surat izin yang berada di paling atas stack tanpa memprosesnya.

4. **Cari Surat**  
   Mencari apakah ada surat izin dari mahasiswa tertentu berdasarkan nama.

## 🏗️ Struktur Kelas

### 🔹 Class `Surat`
Mewakili objek surat izin dengan atribut:
- `idSurat`: ID unik surat
- `namaMhs`: Nama mahasiswa
- `kelas`: Kelas mahasiswa
- `jenisIzin`: `S` atau `I`
- `durasi`: Lama izin dalam hari

### 🔹 Class `StackSurat`
Implementasi struktur data stack berbasis array untuk menampung objek `Surat`, dilengkapi method:
- `push(Surat s)`
- `pop()`
- `peek()`
- `search(String nama)`

### 🔹 Class `MainSurat`
Berisi menu utama untuk interaksi pengguna melalui terminal:
- Menangani input dari user
- Mengelola logika menu

## 🛠️ Teknologi
- Bahasa: Java
- Tidak menggunakan library eksternal (hanya `import java.util.Scanner`)
- Tidak menggunakan `java.util.Stack` (stack diimplementasikan manual)

## 🚀 Cara Menjalankan
1. Buka terminal dan navigasikan ke folder project.
2. Compile:
   ```
   javac MainSurat.java
   ```
3. Jalankan:
   ```
   java MainSurat
   ```

## ✍️ Catatan
- Method `toString()` **tidak digunakan** untuk mencetak objek `Surat`. Semua atribut dicetak secara manual.
- Program menangani input secara sederhana tanpa validasi kompleks.
- Maksimal jumlah surat dapat disesuaikan di class `StackSurat`.
