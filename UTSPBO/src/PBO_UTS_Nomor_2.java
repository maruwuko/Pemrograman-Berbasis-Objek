import java.util.Scanner;
public class PBO_UTS_Nomor_2 {
    public static void main(String[] args) {
        float beratBadan = 0;
        float tinggiBadan = 0;
        float hitungBmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Soal Nomor 2");
        System.out.println("Ujian Tengah Semester Pemrograman Berbasis Objek");
        System.out.println("Nama: Coenraad Samuel Marco Hursepuny");
        System.out.println("NIM: 2021071017");
        System.out.println("Selamat Datang diaplikasi penghitung BMI!");
        System.out.println("Silakan Masukkan Berat Badan Anda(dalam Kg): ");
        beratBadan=input.nextFloat();
        System.out.println("Silakan Masukkan Tinggi Badan Anda(dalam M): ");
        tinggiBadan=input.nextFloat();
        System.out.println("Berat badan anda: "+beratBadan);
        System.out.println("Tinggi badan anda: "+tinggiBadan);
        hitungBmi = (beratBadan/(tinggiBadan*tinggiBadan));
        System.out.println("Hasil perhitungan BMI Anda: "+hitungBmi);
        if (hitungBmi >= 18.5 && hitungBmi <= 22.9){
            System.out.println("BMI Anda: Ideal");
        } else if (hitungBmi < 18.5) {
            System.out.println("BMI Anda: Underweight");
        } else if (hitungBmi > 22.9) {
            System.out.println("BMI Anda: Overweight");
        } else
            System.out.println("Silakan Ulangi");
    }
}
