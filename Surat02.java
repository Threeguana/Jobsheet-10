public class Surat02 {
    public String idSurat, namaMhs, kelas;
    public char jenisIzin;
    public int durasi;

    public Surat02() {

    }

    public Surat02(String idSurat, String namaMhs, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMhs = namaMhs;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public String IdSurat() {
        return idSurat;
    }
    
    public String NamaMhs() {
        return namaMhs;
    }

    public String Kelas() {
        return kelas;
    }

    public char JenisIzin() {
        return jenisIzin;
    }

    public int Durasi() {
        return durasi;
    }
}
