import java.util.Scanner;

public class tugasnomer2absen23 {
    public static void main(String[] args) {
        
        int angka;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Program Cek Genap atau Ganjil ---");
        System.out.print("Masukkan sebuah angka: ");
        angka = scanner.nextInt(); 

        
        if (angka % 2 == 0) {
            System.out.println("output \"Genap\"");
        } else {
        
            System.out.println("output \"Ganjil\"");
        }

        scanner.close();
        System.out.println("--- End ---");
    }
}