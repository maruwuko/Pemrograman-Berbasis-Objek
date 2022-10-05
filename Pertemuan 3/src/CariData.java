public class CariData {
    public static void main(String[] args) {
        int[] bil = {10, 3, 40, 50, 15, 5, 7, 8};
        int cari = 40;
        int i = 0;
        int posisi = 0;
        boolean ketemu = false;
        while ((!ketemu) && (i < bil.length)){
            if (bil[i] == cari) {
                ketemu = true;
                posisi = i;
            }
            i++;
        }
        if (ketemu) {
            System.out.println("Angka " + cari + "ada pada array");
        }
        else {
            System.out.println("Angka " + cari + " tidak ada pada array");
        }
    }
}
