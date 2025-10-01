import java.util.Scanner;

public class ifelsecetakKRS23
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("---Cetak KRS Siakad---");
            System.out.println("Masukkan semester saat ini: ");
            int semester = scanner.nextInt();

            if (semester == 1) {
                System.out.println("KRS Semester 1 di tampilkan");
            } else if (semester == 2) {
                System.out.println("KRS Semester 2 di tampilkan");
            } else if (semester == 3) {
                System.out.println("KRS Semester 3 di tampilkan");
            } else if (semester == 4) {
                System.out.println("KRS Semester 4 di tampilkan");
            } else if (semester == 5) {
                System.out.println("KRS Semester 5 di tampilkan");
            } else if (semester == 6) {
                System.out.println("KRS Semester 6 di tampilkan");
            } else if (semester == 7) {
                System.out.println("KRS Semester 7 di tampilkan");
            } else if (semester == 8) {
                System.out.println("KRS Semester 8 di tampilkan");
            } else {
                System.out.println("Semester tidak valid"); 
                
                scanner.close();


            }
        
    }
}