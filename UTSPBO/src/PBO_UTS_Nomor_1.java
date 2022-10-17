import java.util.Scanner;
public class PBO_UTS_Nomor_1 {
    static int totaljam(int jamSelesai, int jamMulai) {return 3600 * (jamSelesai-jamMulai); }
    static int totalmenit(int menitSelesai, int menitMulai) {return 60 * (menitSelesai-menitMulai); }
    static int totaldetik(int detikSelesai, int detikMulai) {return detikSelesai-detikMulai; }
    static int totalBayarPulsa(int biaya, int detik, int jam, int menit, int jamMulai, int menitMulai, int detikMulai) {
        return ((totaljam(jam,jamMulai) + totalmenit(menit,menitMulai) + totaldetik(detik,detikMulai))/5)*biaya ; }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPulsa = 150;
        int jamMulai;
        int menitMulai;
        int detikMulai;
        int jamSelesai;
        int menitSelesai;
        int detikSelesai;
        System.out.println("Soal Nomor 1");
        System.out.println("Ujian Tengah Semester Pemrograman Berbasis Objek");
        System.out.println("Nama: Coenraad Samuel Marco Hursepuny");
        System.out.println("NIM: 2021071017");
        System.out.println("Selamat datang di Aplikasi Telepon!");
        System.out.print("Masukkan jam anda mulai menelepon: ");
        jamMulai = input.nextInt();
        System.out.print("Masukkan menit anda mulai menelepon: ");
        menitMulai = input.nextInt();
        System.out.print("Masukkan detik anda mulai menelepon: ");
        detikMulai = input.nextInt();
        System.out.println("Waktu mulai menelepon:");
        System.out.print(jamMulai + " Jam : " + menitMulai + " Menit : " + detikMulai+ " Detik");
        System.out.println(" ");
        System.out.print("Masukkan jam anda selesai menelepon: ");
        jamSelesai = input.nextInt();
        System.out.print("Masukkan menit anda selesai menelepon: ");
        menitSelesai = input.nextInt();
        System.out.print("Masukkan Detik anda selesai menelepon: ");
        detikSelesai = input.nextInt();
        System.out.println("Waktu selesai menelepon:");
        System.out.print(jamSelesai + " Jam : " + menitSelesai + " Menit : " + detikSelesai+" Detik");
        System.out.println(" ");
        System.out.printf("Pulsa anda terpakai sebesar:Rp.  " + totalBayarPulsa(hargaPulsa, detikSelesai, jamSelesai, menitSelesai, jamMulai, menitMulai, detikMulai));
        System.out.println(" ");
        System.out.println("Terima Kasih sudah menggunakan Layanan kami!");
    }
}