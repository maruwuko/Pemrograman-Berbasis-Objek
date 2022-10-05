//Latihan PBO Minggu 1
//Nama          : Coenraad Samuel Marco Hursepuny
//NIM           : 2021071017
//Mata Kuliah   : Pemrograman Berorientasi Objek

import java.util.Scanner;
public class TugasPBOMinggu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Informasi Diri dan Nilai Anda");
        String nama, nim, angkatan, prodi;
        String predikatNilai = null;
        int nilaiAbsensi;
        int totalNilaiAbsensi;
        int nilaiTugas;
        int totalNilaiTugas;
        int nilaiUts;
        int totalNilaiUts;
        int nilaiUas;
        int totalNilaiUas;
        double nilaiAkhir;


        System.out.print("Masukkan NIM anda             : ");
        nim=input.nextLine();
        System.out.print("Masukkan Nama anda            : ");
        nama=input.nextLine();
        System.out.print("Masukkan Nilai Absensi anda   : ");
        nilaiAbsensi=input.nextInt();
        System.out.print("Masukkan Nilai Tugas anda     : ");
        nilaiTugas=input.nextInt();
        System.out.print("Masukkan Nilai UTS anda       : ");
        nilaiUts=input.nextInt();
        System.out.print("Masukkan Nilai UAS anda       : ");
        nilaiUas=input.nextInt();


        if (nim.substring(4,7).equals("071")){
            prodi = "Informatika";
        } else {
            prodi = "Maaf Prodi Anda Tidak Sesuai";}
        angkatan = nim.substring(0,4);

        totalNilaiAbsensi = nilaiAbsensi*10/100;
        totalNilaiTugas = nilaiTugas*20/100;
        totalNilaiUts = nilaiUts*30/100;
        totalNilaiUas = nilaiUas*40/100;
        nilaiAkhir = totalNilaiAbsensi + totalNilaiTugas + totalNilaiUts + totalNilaiUas;

        System.out.println("\n");
        System.out.println("Hasil Nilai Mata Kuliah PBO");
        System.out.println("=========================");
        System.out.println("      Biodata Anda       ");
        System.out.println("=========================");
        System.out.println("Nama Anda               : "+nama);
        System.out.println("NIM Anda                : "+nim);
        System.out.println("Program Studi           : "+prodi);
        System.out.println("Tahun Angkatan          : "+angkatan);
        System.out.println("=========================");
        System.out.println("     Hasil Nilai Anda    ");
        System.out.println("=========================");
        System.out.println("Absensi Anda            : "+totalNilaiAbsensi);
        System.out.println("Nilai Tugas Anda        : "+totalNilaiTugas);
        System.out.println("Nilai UTS Anda          : "+totalNilaiUts);
        System.out.println("Nilai UAS Anda          : "+totalNilaiUas);
        System.out.println("Nilai Akhir Anda        : "+nilaiAkhir);
        if(nilaiAkhir > 80){
            predikatNilai = "A"; }
          else if (nilaiAkhir >= 70) {
            predikatNilai = "B";
        } else if (nilaiAkhir >= 60) {
            predikatNilai = "C";
        } else if (nilaiAkhir >= 50) {
            predikatNilai = "D";
        } else {
            System.out.println("Ngulang ye bos");
        }
        System.out.println("Predikat Nilai Anda     : "+predikatNilai);
        }

    }


