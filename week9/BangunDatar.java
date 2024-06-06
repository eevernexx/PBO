package week9; // Mendefinisikan paket bernama week9

// Aryasatya Muhammad Aqsel
// A11.2022.14198
// PBO

public class BangunDatar {
    // Mendeklarasikan variabel instance
    private int panjang; // Variabel panjang
    private int lebar; // Variabel lebar
    private int diameter; // Variabel diameter (tidak digunakan di konstruktor atau metode)
    private int sisi; // Variabel sisi
    protected static final double pi = 3.14; // Konstanta pi yang bersifat protected dan final

    // Konstruktor dengan satu parameter sisi
    public BangunDatar(int sisi) {
        this.sisi = sisi; // Menginisialisasi variabel instance sisi dengan nilai parameter sisi
    }

    
        // Konstruktor tanpa argumen
        public BangunDatar() {
            // Bisa diisi dengan inisialisasi default jika diperlukan
        }

        // Konstruktor dengan dua parameter panjang dan lebar
        public BangunDatar(int panjang, int lebar) {
            this.panjang = panjang; // Menginisialisasi variabel instance panjang dengan nilai parameter panjang
            this.lebar = lebar; // Menginisialisasi variabel instance lebar dengan nilai parameter lebar
        }

        // Metode untuk menghitung luas persegi
        public int luas(int a) {
            return a * a; // Mengembalikan hasil perkalian a dengan a
        }

        // Metode untuk menghitung luas persegi panjang
        public int luas(int a, int b) {
            return a * b; // Mengembalikan hasil perkalian a dengan b
        }

        // Metode untuk menghitung luas segitiga
        public double luas(double a, double b) {
            return (a * b) / 2; // Mengembalikan hasil perkalian a dengan b dibagi 2
        }

        // Metode untuk menghitung luas lingkaran
        public double luas(double a) {
            return pi * a * a; // Mengembalikan hasil perkalian pi dengan a dikali a
        }

        // Metode untuk menghitung keliling persegi
        public int keliling(int a) {
            return 4 * a; // Mengembalikan hasil perkalian 4 dengan a
        }

        // Metode untuk menghitung keliling persegi panjang
        public int keliling(int a, int b) {
            return 2 * (a + b); // Mengembalikan hasil perkalian 2 dengan jumlah a dan b
        }

        // Metode untuk menghitung keliling lingkaran
        public double keliling(double a) {
            return 2 * pi * a; // Mengembalikan hasil perkalian 2 dengan pi dan a
        }

        // Getter untuk variabel panjang
        public int getPanjang() {
            return panjang; // Mengembalikan nilai panjang
        }

        // Getter untuk variabel lebar
        public int getLebar() {
            return lebar; // Mengembalikan nilai lebar
        }

        // Getter untuk variabel diameter
        public int getDiameter() {
            return diameter; // Mengembalikan nilai diameter
        }

        // Getter untuk variabel sisi
        public int getSisi() {
            return sisi; // Mengembalikan nilai sisi
        }
    }
