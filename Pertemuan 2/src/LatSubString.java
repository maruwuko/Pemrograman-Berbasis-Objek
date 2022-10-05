public class LatSubString {
    public static void main(String[] args) {
        String nim = "2021071017";
        String kodeProdi = nim.substring(4,7);
        String angkatan = nim.substring(0,4);
        String namaProdi;
        if (kodeProdi.equals("071")) {
            namaProdi = "Informatika"; }
        else{
            namaProdi = "Prodi Tidak Valid";}
        System.out.println("NIM: "+nim);
        System.out.println("Angkatan: "+angkatan);
        System.out.println("Prodi: "+namaProdi);


    }
}
