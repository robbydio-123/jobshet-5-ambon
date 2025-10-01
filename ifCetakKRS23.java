import java.util.Scanner;


public class ifCetakKRS23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("---Cetak KRS Siakad---");
            System.out.println("Apakah UKT Sudah Lunas? (true/false): ");
            boolean uktLunas = scanner.nextBoolean();

            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("silahkan cetak KRS dan minta tanda tangan dosen DPA");

            scanner.close();
    }
}
