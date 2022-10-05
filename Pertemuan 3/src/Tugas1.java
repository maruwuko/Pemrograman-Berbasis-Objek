import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        int[] angka = {10, 3, 40, 50, 15, 5, 7, 8};
        int jumlah;
        double rataRata;
        boolean pencarianAngka;
        int masukkanAngka;
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai ke-1 adalah: " + angka[0]);
        System.out.println("Nilai ke-2 adalah: " + angka[1]);
        System.out.println("Nilai ke-3 adalah: " + angka[2]);
        System.out.println("Nilai ke-4 adalah: " + angka[3]);
        System.out.println("Nilai ke-5 adalah: " + angka[4]);
        System.out.println("Nilai ke-6 adalah: " + angka[5]);
        System.out.println("Nilai ke-7 adalah: " + angka[6]);
        System.out.println("Nilai ke-8 adalah: " + angka[7]);
        jumlah = angka[0] + angka[1] + angka[2] + angka[3] + angka[4] + angka[5] + angka[6] + angka[7];
        rataRata = jumlah / 8;
        System.out.println("Jumlah total dari angka diatas adalah: " + jumlah);
        System.out.println("Nilai Rata-rata dari angka diatas adalah: " + rataRata);

    }
}
