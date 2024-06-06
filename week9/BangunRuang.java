package week9; // Mendefinisikan paket bernama week9

// Mendefinisikan kelas BangunRuang yang merupakan subclass dari BangunDatar
public class BangunRuang extends BangunDatar {

    // Konstruktor dengan satu parameter sisi
    public BangunRuang(int sisi) {
        super(sisi); // Memanggil konstruktor superclass BangunDatar dengan parameter sisi
    }

    // Konstruktor dengan dua parameter panjang dan lebar
    public BangunRuang(int panjang, int lebar) {
        super(panjang, lebar); // Memanggil konstruktor superclass BangunDatar dengan parameter panjang dan lebar
    }

    // Metode untuk menghitung volume kubus
    public double volumeKubus(int sisi) {
        return sisi * sisi * sisi; // Mengembalikan hasil perkalian sisi dengan sisi dan sisi (volume kubus)
    }

    // Metode untuk menghitung volume balok dengan parameter panjang, lebar, dan tinggi sebagai integer
    public double volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi; // Mengembalikan hasil perkalian panjang, lebar, dan tinggi (volume balok)
    }

    // Metode untuk menghitung volume balok dengan parameter panjang, lebar, dan tinggi sebagai double
    public double volumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi; // Mengembalikan hasil perkalian panjang, lebar, dan tinggi (volume balok)
    }

    // Metode untuk menghitung volume bola
    public double volumeBola(double radius) {
        return (4 / 3) * pi * Math.pow(radius, 3); // Mengembalikan hasil perkalian 4/3 dengan pi dan pangkat tiga dari radius (volume bola)
    }
}
