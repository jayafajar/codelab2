import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public static void tampilUniversitas() {
        System.out.println("Data Mahasiswa:");
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public void tampilDataMahasiswa() {
        System.out.print("Nama: " + nama);
        System.out.print(", NIM: " + nim);
        System.out.println(", Jurusan: " + jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();

            if (pilih == 1) {
                System.out.print("Masukkan nama: ");
                String nama = scanner.next();
                String nim;
                do {
                    System.out.print("Masukkan NIM (harus 15 angka): ");
                    nim = scanner.next();
                    if (nim.length() != 15) {
                        System.out.println("NIM harus memiliki panjang tepat 15 angka.");
                    }
                } while (nim.length() != 15); 
                System.out.print("Masukkan prodi: ");
                String prodi = scanner.next();
                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi);
                mahasiswaList.add(mahasiswa);
                System.out.println("Data mahasiswa berhasil diinput!");
            } else if (pilih == 2) {
                Mahasiswa.tampilUniversitas();
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    mahasiswa.tampilDataMahasiswa();
                }
            } else if (pilih == 3) {
                System.out.println("Keluar dari program");
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }

        scanner.close();
    }
}