public class LatihanClass3 {
    private String nim;
    private String nama;
    private String umur;
    private String jenisKelamin;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(String umur){
        this.umur = umur;
    }

    public  void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getUmur() {
        return this.umur;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public static void main(String[] args) {
        LatihanClass3 latihanClass3 = new LatihanClass3();
        latihanClass3.setNim("2021071017");
        latihanClass3.setNama("Marukoo");
        latihanClass3.setUmur("21");
        latihanClass3.setJenisKelamin("LAKIK");

        System.out.println("NIM: " + latihanClass3.getNim());
        System.out.println("Nama: " + latihanClass3.getNama());
        System.out.println("Umur: " + latihanClass3.getUmur());
        System.out.println("Jenis Kelamin: " + latihanClass3.getJenisKelamin());
    }
}
