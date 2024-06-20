package week12;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Week12 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/java_db";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Show Data");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue;
            }
            
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    update(scanner);
                    break;
                case 3:
                    delete(scanner);
                    break;
                case 4:
                    show();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
    public static void insert(Scanner scanner) {
        System.out.print("Masukkan ID Buku: ");
        int id = 0;
        while (true) {
            try {
                id = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for ID Buku.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.nextLine(); // Consume newline
        
        System.out.print("Judul Buku: ");
        String judul_buku = scanner.nextLine();
        
        System.out.print("Tahun: ");
        int tahun = 0;
        while (true) {
            try {
                tahun = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for Tahun.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        System.out.print("Stok: ");
        int stok = 0;
        while (true) {
            try {
                stok = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for Stok.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        scanner.nextLine(); // Consume newline
        
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO buku (id, judul_buku, tahun, stok, penulis) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.setString(2, judul_buku);
            ps.setInt(3, tahun);
            ps.setInt(4, stok);
            ps.setString(5, penulis);
            
            ps.execute();
            
            ps.close();
            stmt.close();
            conn.close();
            System.out.println("Data inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void update(Scanner scanner) {
        System.out.print("Masukkan ID Buku yang ingin diupdate: ");
        int id = 0;
        while (true) {
            try {
                id = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for ID Buku.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.nextLine(); // Consume newline
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "SELECT * FROM buku WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                System.out.println("Data saat ini:");
                System.out.println("ID Buku: " + rs.getInt("id"));
                System.out.println("Judul Buku: " + rs.getString("judul_buku"));
                System.out.println("Tahun: " + rs.getInt("tahun"));
                System.out.println("Stok: " + rs.getInt("stok"));
                System.out.println("Penulis: " + rs.getString("penulis"));
                
                System.out.print("Masukkan Judul Buku baru (kosongkan jika tidak ingin mengubah): ");
                String judul_buku = scanner.nextLine();
                if (judul_buku.isEmpty()) {
                    judul_buku = rs.getString("judul_buku");
                }
                
                System.out.print("Masukkan Tahun baru (kosongkan jika tidak ingin mengubah): ");
                String tahunStr = scanner.nextLine();
                int tahun = tahunStr.isEmpty() ? rs.getInt("tahun") : Integer.parseInt(tahunStr);
                
                System.out.print("Masukkan Stok baru (kosongkan jika tidak ingin mengubah): ");
                String stokStr = scanner.nextLine();
                int stok = stokStr.isEmpty() ? rs.getInt("stok") : Integer.parseInt(stokStr);
                
                System.out.print("Masukkan Penulis baru (kosongkan jika tidak ingin mengubah): ");
                String penulisStr = scanner.nextLine();
                String penulis = penulisStr.isEmpty() ? rs.getString("penulis") : penulisStr;
                
                sql = "UPDATE buku SET judul_buku = ?, tahun = ?, stok = ?, penulis = ? WHERE id = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, judul_buku);
                ps.setInt(2, tahun);
                ps.setInt(3, stok);
                ps.setString(4, penulis);
                ps.setInt(5, id);
                
                ps.execute();
                System.out.println("Data updated successfully.");
            } else {
                System.out.println("No data found with ID Buku: " + id);
            }
            
            ps.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void delete(Scanner scanner) {
        System.out.print("Masukkan ID Buku yang ingin dihapus: ");
        int id = 0;
        while (true) {
            try {
                id = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for ID Buku.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.nextLine(); // Consume newline
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "SELECT * FROM buku WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                sql = "DELETE FROM buku WHERE id = ?";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
                System.out.println("Data deleted successfully.");
            } else {
                System.out.println("No data found with ID Buku: " + id);
            }
            
            ps.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void show() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM buku");
            int i = 1;
            while (rs.next()) {
                System.out.println("Data ke-" + i);
                System.out.println("ID Buku: " + rs.getInt("id"));
                System.out.println("Judul Buku: " + rs.getString("judul_buku"));
                System.out.println("Tahun: " + rs.getInt("tahun"));
                System.out.println("Stok: " + rs.getInt("stok"));
                System.out.println("Penulis: " + rs.getString("penulis"));
                i++;
            }
            
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
 }
}
}