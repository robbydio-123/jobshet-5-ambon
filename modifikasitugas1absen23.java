import java.util.Scanner;

public class modifikasitugas1absen23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Cetak KRS Siakad---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = scanner.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("silahkan cetak KRS dan minta tanda tangan dosen DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
    
        scanner.close();
        }
    }
}