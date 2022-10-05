import java.util.Scanner;
public class MethodLuasSegitiga {
    static double luasSegitiga(){
        Scanner input = new Scanner(System.in);
        double alas, tinggi, luas;
        System.out.println("Masukkan alas: ");
        alas = input.nextDouble();
        System.out.println("Masukkan tinggi: ");
        tinggi = input.nextDouble();
        luas = 0.5 * alas * tinggi;
        return luas;
    }
    public static void main(String[] args){
        System.out.println("Luas Segitiga: " + luasSegitiga());
    }
}
