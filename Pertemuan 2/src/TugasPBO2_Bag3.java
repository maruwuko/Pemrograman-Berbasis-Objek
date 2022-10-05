import java.util.*;
import java.util.Scanner;
public class TugasPBO2_Bag3 {
            public static void main(String[] args) {
                char[] jtk = {'j', 't', 'k'};
                Scanner input = new Scanner(System.in);
                char jariPlayer;
                char jariBot;

                System.out.println("JEMPOL, TELUNJUK, KELINGKING. SUIT!");
                while (true) {
                    jariBot = jtk[new Random().nextInt(jtk.length)];
                    while (true) {
                        System.out.print("Masukkan pilihan jari anda!: ");
                        jariPlayer = input.nextLine().charAt(0);

                        if (jariPlayer == 'j' || jariPlayer == 't' || jariPlayer == 'k') {
                            break;
                        } else {
                            System.out.println("Masukkan anda salah!");
                        }
                    }

                    System.out.println("Pilihan komputer adalah: " + jariBot);
                    if (jariPlayer == 'j') {
                        if (jariBot == 't') {
                            System.out.println("Hebat! Anda Menang!\n");
                            break;
                        } else if (jariBot == 'k') {
                            System.out.println("Anda Kalah! Semangat terus ya!\n");
                        }
                    } else if (jariPlayer == 't') {
                        if (jariBot == 'k') {
                            System.out.println("Hebat! Anda Menang!\n");
                            break;
                        } else if (jariBot == 'j') {
                            System.out.println("Hebat! Anda Menang!\n");
                            break;
                        }
                    } else if (jariBot == 'k') {
                        if (jariBot == 'j') {
                            System.out.println("Hebat! Anda Menang!\n");
                            break;
                        } else if (jariBot == 't') {
                            System.out.println("Anda Kalah! Semangat terus ya!\n");
                        }
                    }

                    if (jariPlayer == jariBot) {
                        System.out.println("Seri! Silakan ulang kembali!\n");
                    }
                }
            }
        }


