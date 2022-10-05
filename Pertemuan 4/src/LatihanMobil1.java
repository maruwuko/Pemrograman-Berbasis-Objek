class LatihanMobil1 {
    //Attribute
    private boolean brake = false;
    private String nama;
    //Method
    public void brakeOn() {
        this.brake = true;
        System.out.println("Status rem Mobil: " + this.brake);
    }
    public void brakeOff(){
        this.brake = false;
        System.out.println("Status Rem Mobil: " + this.brake);

    }
    public void setNama(String nama){
        this.nama = nama;
    }
}

