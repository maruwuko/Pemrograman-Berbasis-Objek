public class PBO_UTS_Nomor_4 {
    static class hitungLingkaran {
        private int nilaiJariJari;

        public void setNilaiJariJari(int j) {
            this.nilaiJariJari = j;
        }

        public double hitungNilaiLuasLingkaran() {
            return Math.PI * nilaiJariJari * nilaiJariJari;
        }
        public double hitungNilaiKelilingLingkaran(){
           return  2 * Math.PI * nilaiJariJari;
        }
    }
}