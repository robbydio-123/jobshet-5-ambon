import java.util.Scanner;

public class nestedUjianSkripsi23 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Apakah mahasiswa sudah kompen? (ya/tidak): ");
        String kompen = scanner.nextLine().trim();

        System.out.println("Masukkan jumlah log pembimbing 1: ");
        int logPembimbing1 = scanner.nextInt();
        System.out.println("Masukkan jumlah log pembimbing 2: ");
        int logPembimbing2 = scanner.nextInt();

        if (kompen.equalsIgnoreCase("Ya")) {
            if (logPembimbing1 >= 3 && logPembimbing2 >= 4) {
                System.out.println("Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.");
            } else if (logPembimbing1 < 8 && logPembimbing2 <= 4) {
                System.out.println("Gagal log pembimbing p1 kurang dari 8 kali dan p2 kurang dari 4 kali");
            }
        } else if (logPembimbing1 < 8) {
            System.out.println("gagal log pembimbing p1 belum mencapai 8 kali");
        } else if (logPembimbing2 < 4) {
            System.out.println("gagal log pembimbing p2 belum mencapai 4 kali");
        } else {
            // String pesan = "";
            System.out.println("gagal! mahasiswa masih memiliki taggungan kompen");
        // System.out.println(pesan);
        }
    }
}