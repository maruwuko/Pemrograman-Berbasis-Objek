import java.util.Random;
import java.util.Scanner;
public class TugasPBO2_Bag3_1 {
    public static void main(String[] args) {
        while (true) {
            String[] suit = {"j", "t", "k"};
            String jariBot = suit[new Random().nextInt(suit.length)];
            String jariPemain, lanjutTidak;
            Scanner input = new Scanner(System.in);

            System.out.println("JEMPOL, TELUNJUK, KELINGKING. SUIT!");
            while (true) {
                System.out.print("Masukkan pilihan jari Anda!: ");
                jariPemain = input.nextLine();
                if (jariPemain.equals("j") || jariPemain.equals("t") || jariPemain.equals("k")) {
                    break;
                }
                System.out.println(jariPemain + " Pilihan kamu tidak sesuai!");
            }
            System.out.println("Pilihan Komputer adalah : " + jariBot);

            if (jariPemain.equals(jariBot)) {
                System.out.println("Seri!");
            } else if (jariPemain.equals("j")) {
                if (jariBot.equals("t")) {
                    System.out.println("Hebat! Kamu Menang!");
                } else if (jariBot.equals("k")) {
                    System.out.println("Kamu Kalah! Semangat ya!");
                }
            } else if (jariPemain.equals("t")) {
                if (jariBot.equals("j")) {
                    System.out.println("Kamu Kalah! Semangat ya!");
                } else if (jariBot.equals("k")) {
                    System.out.println("Hebat! Kamu Menang!");
                }
            } else if (jariPemain.equals("k")) {
                if (jariBot.equals("j")) {
                    System.out.println("Hebat! Kamu Menang!");
                } else if (jariBot.equals("t")) {
                    System.out.println("Kamu Kalah! Semangat ya!");
                }
            }
            System.out.print("Apakah mau main lagi? [y/n] : ");
            lanjutTidak = input.nextLine();
            if (lanjutTidak.equals("n")) {
                System.out.println("Terima kasih sudah bermain!");
                break;
            }
        }
    }
}