import java.util.Scanner;
public class LoopFor {
    public static void main(String[] args) {
        String pilihan = null;
        Scanner scan = new Scanner(System.in);

        while (pilihan.equals("y")) {
            System.out.println("Halo Selamat Datang!");
            System.out.println("Apakah ingin mengulang?[y/t]: ");
            pilihan = scan.nextLine();
             {
                System.out.println("Terima kasih sudah menggunakan ini");
            }
        }
    }
}

