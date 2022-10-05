class Mobil {
    // Attributes / states
     private boolean rem = false;
    // Methods / Behavior
    public void mengerem(){
        System.out.println("Fungsi rem dipanggil");
        if(this.rem){
            System.out.println("Mobil Mengerem");
        } else {
            System.out.println("Mobil tidak Mengerem");
        }
    }
    public void aksesRem(Boolean rem){
        this.rem = rem;
    }
}

public class Main {
    public static void main(String[] args){
        Mobil objMobil = new Mobil();
        // memanggil Method di Public
        objMobil.aksesRem (true);
        objMobil.mengerem();

    }
}