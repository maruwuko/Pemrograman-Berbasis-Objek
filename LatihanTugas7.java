import java.util.Scanner;
public class LatihanTugas7 {
    static Scanner input = new Scanner(System.in);
    public static int  waktuKerja, bonusLembur,golonganKerja;
    public static double gajiKotor,uangLembur,gajiBersih;
    static void kurangwaktu(){
        do{
            System.out.print("Masukan Durasi Kerja     : ");waktuKerja=input.nextInt();
            bonusLembur = waktuKerja - 173;
            if (waktuKerja<173){
                System.out.println("Waktu minimal lembur ada 173 Jam. Silakan Input ulang");
                System.out.println(" ");
            }
        }while (waktuKerja<173);
    }
    public static void golonganKerja1(){
        gajiKotor = 1486500-((double)1486500*0.005);
        uangLembur = 250000-((double)250000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur Anda               : "+bonusLembur+" jam");
        bonusLembur = bonusLembur*20000;
        gajiBersih = gajiKotor+uangLembur+bonusLembur;
        System.out.println("Durasi Kerja Anda               : "+waktuKerja+" jam");
        System.out.println("Gaji Anda                       : Rp."+gajiKotor);
        System.out.println("Bonus Tunjangan Anda            : Rp."+uangLembur);
        System.out.println("Bonus Lembur Anda               : Rp."+bonusLembur);
        System.out.println("=====================================");
        System.out.println("Gaji Total Anda = Rp."+gajiBersih);
        System.out.println("=====================================");
    }
    public static void golonganKerja2(){
        gajiKotor = 1926000-((double)1926000*0.005);
        uangLembur = 300000-((double)300000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur Anda               : "+bonusLembur+" jam");
        bonusLembur = bonusLembur*20000;
        gajiBersih = gajiKotor+uangLembur+bonusLembur;
        System.out.println("Durasi Kerja Anda               : "+waktuKerja+" jam");
        System.out.println("Gaji Anda                       : Rp."+gajiKotor);
        System.out.println("Bonus Tunjangan Anda            : Rp."+uangLembur);
        System.out.println("Bonus Lembur Anda               : Rp."+bonusLembur);
        System.out.println("=====================================");
        System.out.println("Gaji Total Anda = Rp."+gajiBersih);
        System.out.println("=====================================");
    }
    public static void golonganKerja3(){
        gajiKotor = 2456700-((double)2456700*0.005);
        uangLembur = 350000-((double)350000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur Anda       : "+bonusLembur+" jam");
        bonusLembur = bonusLembur*20000;
        gajiBersih = gajiKotor+uangLembur+bonusLembur;
        System.out.println("Durasi Kerja Anda               : "+waktuKerja+" jam");
        System.out.println("Gaji Anda                       : Rp."+gajiKotor);
        System.out.println("Bonus Tunjangan Anda            : Rp."+uangLembur);
        System.out.println("Bonus Lembur Anda               : Rp."+bonusLembur);
        System.out.println("=====================================");
        System.out.println("Gaji Total Anda = Rp."+gajiBersih);
        System.out.println("=====================================");
    }
    public static void golonganKerja4(){
        gajiKotor = 2899500-((double)2899500*0.005);
        uangLembur = 400000-((double)400000*0.005);
        kurangwaktu();
        System.out.println("Waktu lembur Anda       : "+bonusLembur+" jam");
        bonusLembur = bonusLembur*20000;
        gajiBersih = gajiKotor+uangLembur+bonusLembur;
        System.out.println("Durasi Kerja Anda               : "+waktuKerja+" jam");
        System.out.println("Gaji Anda                       : Rp."+gajiKotor);
        System.out.println("Bonus Tunjangan Anda            : Rp."+uangLembur);
        System.out.println("Bonus Lembur Anda               : Rp."+bonusLembur);
        System.out.println("=====================================");
        System.out.println("Gaji Total Anda = Rp."+gajiBersih);
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        String jawab;
        do {
            System.out.print("Masukan golongan (1/2/3/4) : "); golonganKerja=input.nextInt();
            switch (golonganKerja){
                case 1 -> golonganKerja1();
                case 2 -> golonganKerja2();
                case 3 -> golonganKerja3();
                case 4 -> golonganKerja4();
                default -> System.out.println("Input Salah, silakan ulangi!");
            }
            System.out.print("Input ulang (y/n) ? "); jawab=input.next().toUpperCase();
            System.out.println(" ");
        }while(jawab.equals("Y"));
        System.out.println("Terima kasih. Jangan makan gaji buta ya");
    }
}