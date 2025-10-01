import java.util.Scanner;

public class wifitugas3absen23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sistem Cek Akses WiFi ---");
           
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String jenisPengguna = scanner.nextLine();
       
        if (jenisPengguna.equals("dosen")) { 
            System.out.println("Akses WiFi diberikan (dosen)");

        } else if (jenisPengguna.equals("mahasiswa")) {
            
            System.out.print("Masukkan jumlah SKS saat ini: ");
            int jumlahSKS = 15;
            
            if(scanner.hasNextInt()) {
                jumlahSKS = scanner.nextInt();
            } else {
                System.out.println("Input SKS tidak valid. Akses ditolak.");
                scanner.close();
            }
            
            if (jumlahSKS >= 15) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
            
        } else {
            System.out.println("Akses ditolak");
        }

        scanner.close();
        System.out.println("--- Selesai ---");
    }
}