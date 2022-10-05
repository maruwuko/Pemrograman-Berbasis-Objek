public class MethodOverloading1 {
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        double angka1   = plusMethod(5, 5.6);
        double angka2   = plusMethod(5.6, 5);
        int angka3      = plusMethod(5, 5);
        double angka4   = plusMethod(5.6, 5.6);
        System.out.println("Hasil Angka 1: " + angka1);
        System.out.println("Hasil Angka 2: " + angka2);
        System.out.println("Hasil Angka 3: " + angka3);
        System.out.println("Hasil Angka 4: " + angka4);
    }
}

