public class LuasSegitigaDanLingkaran {

    static class lingkaran {
        private int nilaijarijari;

        public void setNilaiJariJari(int j) {
            this.nilaijarijari = j;
        }

        public double hitungLuasLingkarandanSegitiga() {
            return Math.PI * nilaijarijari * nilaijarijari;
        }
    }

    static class segitiga {
        private int nilaiAlas;
        private int nilaiTinggi;

        public void setNilaiAlas(int hasilAlas) {
            this.nilaiAlas = hasilAlas;
        }

        public void setNilaiTinggi(int hasilTinggi) {
            this.nilaiTinggi = hasilTinggi;
        }
        public double hitungLuasLingkarandanSegitiga(){
            return 0.5*this.nilaiAlas*this.nilaiTinggi;
        }
    }
}
