import java.util.Scanner;

public class LatihanVar2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a;
        double t;
        double luas;

        System.out.print("Masukkan Alas         : ");
        a=input.nextDouble();
        System.out.print("Masukkan Tinggi       : ");
        t=input.nextDouble();

        luas=0.5*a*t;
        System.out.println("Luas Segitiga       : "+luas+" cm");
        System.out.print("Nilai Alas adalah     : " +a + " cm");
        System.out.print("\nNilai Tinggi adalah : " +t + " cm");
        System.out.println("\nLuas Segitiga     : " +luas+" cm");
    }
}
