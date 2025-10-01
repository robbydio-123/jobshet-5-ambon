import java.util.Scanner;

public class ifCetakKRS23modif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("---Cetak KRS Siakad---");
            System.out.println("Apakah UKT Sudah Lunas? (true/false): ");
            boolean uktLunas = scanner.nextBoolean();

            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("silahkan cetak KRS dan minta tanda tangan dosen DPA");

            String Pesan = uktLunas ? "sudah" : "belum";
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");

            scanner.close();

     

    }
}

