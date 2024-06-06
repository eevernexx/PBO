package week9; // Mendefinisikan paket bernama week9
import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util untuk input pengguna

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat instance Scanner untuk membaca input dari pengguna
        BangunDatar bangunDatar = null; // Mendeklarasikan variabel bangunDatar dengan tipe BangunDatar, diinisialisasi dengan null
        BangunRuang bangunRuang = null; // Mendeklarasikan variabel bangunRuang dengan tipe BangunRuang, diinisialisasi dengan null

        // Menampilkan menu pilihan operasi kepada pengguna
        System.out.println("Pilih operasi:");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Segitiga");
        System.out.println("4. Luas Lingkaran");
        System.out.println("5. Volume Kubus");
        System.out.println("6. Volume Balok");
        System.out.println("7. Volume Bola");

        System.out.print("Pilih : "); // Meminta pengguna untuk memilih salah satu opsi
        int pilihan = scanner.nextInt(); // Membaca input pengguna dan menyimpannya dalam variabel pilihan

        // Menggunakan switch case untuk menangani berbagai pilihan pengguna
        switch (pilihan) {
            case 1:
                // Menghitung dan menampilkan luas serta keliling persegi
                System.out.print("Masukkan sisi: ");
                int sisi = scanner.nextInt(); // Membaca input sisi persegi dari pengguna
                bangunDatar = new BangunDatar(sisi); // Membuat instance BangunDatar dengan parameter sisi
                System.out.println("Luas Persegi: " + bangunDatar.luas(sisi)); // Menampilkan luas persegi
                System.out.println("Keliling Persegi: " + bangunDatar.keliling(sisi)); // Menampilkan keliling persegi
                break;
            case 2:
                // Menghitung dan menampilkan luas serta keliling persegi panjang
                System.out.print("Masukkan panjang: ");
                int panjang = scanner.nextInt(); // Membaca input panjang persegi panjang dari pengguna
                System.out.print("Masukkan lebar: ");
                int lebar = scanner.nextInt(); // Membaca input lebar persegi panjang dari pengguna
                bangunDatar = new BangunDatar(panjang, lebar); // Membuat instance BangunDatar dengan parameter panjang dan lebar
                System.out.println("Luas Persegi Panjang: " + bangunDatar.luas(panjang, lebar)); // Menampilkan luas persegi panjang
                System.out.println("Keliling Persegi Panjang: " + bangunDatar.keliling(panjang, lebar)); // Menampilkan keliling persegi panjang
                break;
            case 3:
                // Menghitung dan menampilkan luas segitiga
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble(); // Membaca input alas segitiga dari pengguna
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble(); // Membaca input tinggi segitiga dari pengguna
                bangunDatar = new BangunDatar(0); // Membuat instance BangunDatar dengan parameter dummy
                System.out.println("Luas Segitiga: " + bangunDatar.luas(alas, tinggi)); // Menampilkan luas segitiga
                break;
            case 4:
                // Menghitung dan menampilkan luas serta keliling lingkaran
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble(); // Membaca input jari-jari lingkaran dari pengguna
                bangunDatar = new BangunDatar(0); // Membuat instance BangunDatar dengan parameter dummy
                System.out.println("Luas Lingkaran: " + bangunDatar.luas(jariJari)); // Menampilkan luas lingkaran
                System.out.println("Keliling Lingkaran: " + bangunDatar.keliling(jariJari)); // Menampilkan keliling lingkaran
                break;
            case 5:
                // Menghitung dan menampilkan volume kubus
                System.out.print("Masukkan sisi: ");
                sisi = scanner.nextInt(); // Membaca input sisi kubus dari pengguna
                bangunRuang = new BangunRuang(sisi); // Membuat instance BangunRuang dengan parameter sisi
                System.out.println("Volume Kubus: " + bangunRuang.volumeKubus(sisi)); // Menampilkan volume kubus
                break;
            case 6:
                // Menghitung dan menampilkan volume balok
                System.out.print("Masukkan panjang: ");
                panjang = scanner.nextInt(); // Membaca input panjang balok dari pengguna
                System.out.print("Masukkan lebar: ");
                lebar = scanner.nextInt(); // Membaca input lebar balok dari pengguna
                System.out.print("Masukkan tinggi: ");
                tinggi = scanner.nextInt(); // Membaca input tinggi balok dari pengguna
                bangunRuang = new BangunRuang(panjang, lebar); // Membuat instance BangunRuang dengan parameter panjang dan lebar
                System.out.println("Volume Balok: " + bangunRuang.volumeBalok(panjang, lebar, tinggi)); // Menampilkan volume balok
                break;
            case 7:
                // Menghitung dan menampilkan volume bola
                System.out.print("Masukkan jari-jari: ");
                jariJari = scanner.nextDouble(); // Membaca input jari-jari bola dari pengguna
                bangunRuang = new BangunRuang(0); // Membuat instance BangunRuang dengan parameter dummy
                System.out.println("Volume Bola: " + bangunRuang.volumeBola(jariJari)); // Menampilkan volume bola
                break;
            default:
                // Menampilkan pesan jika pilihan tidak valid
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close(); // Menutup scanner untuk membebaskan sumber daya
    }
}
