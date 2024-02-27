import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Sistem perpustakaan ===");

        int pilihan;
        do {
            System.out.println("1. Masuk sebagai Mahasiswa");
            System.out.println("2. Masuk sebagai Admin");
            System.out.println("3. Keluar");

            System.out.print("Pilih (1-3) : ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM : ");
                    String nim = scan.next();

                    int digitNim = nim.length();

                    if (digitNim != 15) {
                        System.out.println("NIM tidak ditemukan!");
                    } else {
                        System.out.println("Berhasil masuk sebagai mahasiswa");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nama anda : ");
                    String un = scan.next();

                    System.out.print("Masukkan kata sandi anda :");

                    String pass = scan.next();

                    if (un.equals("ilham") && pass.equals("strata")) {
                        System.out.println("Berhasil Masuk sebagai admin");
                    } else {
                        System.out.println("Pengguna tidak ditemukan!");
                    }
                    break;
                case 3:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihlah 1-3.");
            }
        } while (pilihan!= 3);

        scan.close();
    }
}
