import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ulang = 1 ;
        System.out.print("Nilai:    ");
        ulang= input.nextInt();
        do {
            System.out.println(ulang + ". Halo apa kabar?");
            ulang = ulang + 1;
        }
        while (ulang <= 5);
        System.out.println("Terima kasih");
    }
}
