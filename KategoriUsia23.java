import java.util.Scanner;
/**
 * KategoriUsia23
 */
public class KategoriUsia23 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan Usia: ");
        if (sc.hasNextInt()) { 
            int usia = sc.nextInt();

            if (usia < 0) {
                System.out.println("Error: Usia tidak boleh negatif.");
            } else if (usia >= 0 && usia <= 12) {
                System.out.println("Kategori: Anak");
            } else if (usia >= 13 && usia <= 19) {
                System.out.println("Kategori: Remaja");
            } else if (usia >= 20 && usia <= 64) {
                System.out.println("Kategori: Dewasa");
            } else if (usia >= 65) {
                System.out.println("Kategori: Lansia");
            }
        } else {
            System.out.println("Error: Input harus berupa angka.");
        }

       
    }
}
    
