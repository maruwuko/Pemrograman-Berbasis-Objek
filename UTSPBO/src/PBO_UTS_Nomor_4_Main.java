import java.util.Scanner;
public class PBO_UTS_Nomor_4_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PBO_UTS_Nomor_4.hitungLingkaran lingkaran = new PBO_UTS_Nomor_4.hitungLingkaran();
        System.out.println("Soal Nomor 4");
        System.out.println("Ujian Tengah Semester Pemrograman Berbasis Objek");
        System.out.println("Nama: Coenraad Samuel Marco Hursepuny");
        System.out.println("NIM: 2021071017");
        System.out.println("Silakan untuk menggunakan aplikasi penghitung Luas dan Keliling Lingkaran!");
        System.out.println("Silakan Masukkan nilai jari-jarinya: ");
        lingkaran.setNilaiJariJari(input.nextInt());
        System.out.println("Luas Lingkarannya adalah: "+lingkaran.hitungNilaiLuasLingkaran());
        System.out.println("Keliling Lingkarannya adalah: "+lingkaran.hitungNilaiKelilingLingkaran());
    }
}
