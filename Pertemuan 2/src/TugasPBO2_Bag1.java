import java.util.Scanner;
public class TugasPBO2_Bag1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int nilai;
            System.out.println("Silakan input nilai dari 0-10: ");
            nilai = input.nextInt();
            if (nilai >= 1 && nilai <= 10) {
                System.out.println("Nilai yang anda masukkan Benar!");
                break;
            } else {
                System.out.println("Nilai yang anda masukkan Salah, silakan ulangi!");
            }
        } while (true);
    }
}
