import java.util.Scanner;
public class TugasPBO2_Bag2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean pencarian;
        String isiKalimat = "Tekunlah dalam belajar agar segera lulus sebagai sarjana dan kamu bisa bekerja juga menafkahi keluargamu";
        String isiKata;
        System.out.println("Kalimat: "+isiKalimat);
        do {
            System.out.println("Silakan memasukkan kata yang ingin anda cari dari kalimat diatas: ");
            isiKata = input.nextLine();
            pencarian = isiKalimat.contains(isiKata);
            if(!pencarian){
                System.out.println("Hasil pencarian tidak ditemukan, Silakan ulangi lagi");
            } else {
                System.out.println("Hasil pencarian ditemukan!");
            }
        } while (!pencarian);
    }
}
