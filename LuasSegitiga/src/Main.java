import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        LuasSegitigaDanLingkaran.lingkaran lingkaran = new LuasSegitigaDanLingkaran.lingkaran();
        System.out.println("Selamat Datang! Silakan Hitung Luas Lingkaran disini!");
        System.out.println("Berapa nilai jari jarinya?: ");
        lingkaran.setNilaiJariJari(input.nextInt());
        System.out.println("Hasil Luas Lingkarannya adalah: " +lingkaran.hitungLuasLingkarandanSegitiga());

        LuasSegitigaDanLingkaran.segitiga segitiga = new LuasSegitigaDanLingkaran.segitiga();
        System.out.println("Silakan Dilanjutkan untuk Luas Segitiganya!");
        System.out.println("Berapa nilai alasnya?: ");
        segitiga.setNilaiAlas(input.nextInt());
        System.out.println("Berapa nilai tingginya?: ");
        segitiga.setNilaiTinggi(input.nextInt());
        System.out.println("Hasil Luas Segitiganya adalah: " +segitiga.hitungLuasLingkarandanSegitiga()+"CM^2");
        input.close();
    }
}
