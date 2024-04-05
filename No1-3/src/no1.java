import java.util.Random;

public class no1 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Random
        Random random = new Random();
        
        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int randomMonthNumber = random.nextInt(12) + 1;
        
        // Array untuk nama-nama bulan dalam bahasa Indonesia
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        // Menampilkan nomor bulan dan nama bulan 
        if (randomMonthNumber >= 1 && randomMonthNumber <= 12) {
            System.out.println("Nomor Bulan: " + randomMonthNumber + ", Bulan: " + namaBulan[randomMonthNumber - 1]);
        } else {
            System.out.println("Nomor Bulan tidak valid.");
        }
    }
}
