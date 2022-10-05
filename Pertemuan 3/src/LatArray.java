public class LatArray {
    public static void main(String[] args) {
        int [] angka = {4,5,10,6,8,13};

        //Untuk mengakses nilai pada Array
        System.out.println("Menampilkan data secara Manual");
        System.out.println("Nilai ke-1 adalah: " + angka[0]);
        System.out.println("Nilai ke-2 adalah: " + angka[1]);
        System.out.println("Nilai ke-3 adalah: " + angka[2]);
        System.out.println("Nilai ke-4 adalah: " + angka[3]);
        System.out.println("Nilai ke-5 adalah: " + angka[4]);
        System.out.println("Nilai ke-6 adalah: " + angka[5]);


        //Untuk mengakses nilai dengan Loop
        System.out.println("Menampilkan data dengan Loop");
        for (int i=0; 1 < angka.length; i++) {
            System.out.println("Nilai ke-"+(i+1)+" adalah: "+angka[i]);
        }
        System.out.println("Menampilkan data dengan Loop 2");
        int j = 1;
        for (int nilai : angka) {
            System.out.println("Nilai ke- adalah" + nilai);
            j++;
        }
        //Mengganti nilai Array
        angka[2] = 30;
        System.out.println("Nilai ke-3 setelah diganti adalah: " + angka[2]);

    }
}
