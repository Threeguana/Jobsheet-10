import java.util.Scanner;
public class MainSurat02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat02 stack = new StackSurat02(10);
        int pilih;

        do {
            System.out.println("\n=== Menu Surat Izin Mahasiswa ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.println("---Masukkan data surat---");
                    System.out.print("ID Surat      : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas         : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)   : ");
                    int durasi = sc.nextInt(); sc.nextLine();

                    Surat02 surat = new Surat02(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat berhasil diterima.");
                    break;
                case 2:
                    Surat02 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("---Memproses surat---");
                        System.out.println("ID Surat      : " + proses.IdSurat());
                        System.out.println("Nama Mahasiswa: " + proses.NamaMhs());
                        System.out.println("Kelas         : " + proses.Kelas());
                        System.out.println("Jenis Izin    : " + (proses.JenisIzin() == 'S' ? "Sakit" : "Izin Keperluan"));
                        System.out.println("Durasi        : " + proses.Durasi() + " hari");
                    }
                    break;
                case 3:
                    Surat02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMhs);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String dicari = sc.nextLine();
                    if (stack.cariSurat(dicari)) {
                        System.out.println("Surat dari mahasiswa \"" + dicari + "\" ditemukan.");
                    } else {
                        System.out.println("Surat dari mahasiswa \"" + dicari + "\" tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
        sc.close();
    }
}
