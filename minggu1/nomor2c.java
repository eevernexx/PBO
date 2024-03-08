package minggu1;
public class nomor2c {
    public static void main(String[] args) {
        double diameter = 5;
        double tinggi = 10;
        
        double radius = diameter / 2;
        double pi = Math.PI;
        
        double volume = pi * Math.pow(radius, 2) * tinggi;
        
        System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah: " + volume);
    }
}
