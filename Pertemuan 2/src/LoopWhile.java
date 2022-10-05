import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ulang = 1 ;
        System.out.print("Nilai:    ");
        ulang= input.nextInt();
                while (ulang <=5) {
                    System.out.println( "Halo apa kabar?");
                    ulang = ulang + 1;
                }
        System.out.println("Terima kasih");
    }

}
