import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan bulat: ");
        long number = scanner.nextLong();
        
        int sum = sumDigits(number);
        
        System.out.println("Jumlah semua digit dalam bilangan " + number + " adalah: " + sum);
        
        scanner.close();
    }
    
    public static int sumDigits(long n) {
        int sum = 0;
        
        // Mengambil nilai mutlak dari bilangan n untuk menangani bilangan negatif
        n = Math.abs(n);
        
        // Loop untuk mengekstrak dan menambahkan setiap digit
        while (n != 0) {
            sum += n % 10;  // Menambahkan digit terakhir
            n /= 10;        // Menghapus digit terakhir
        }
        
        return sum;
    }
}
