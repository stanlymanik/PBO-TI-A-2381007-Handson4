public class contohMethodOverloading {
    public static double hitungLuas (double sisi){
        return sisi*sisi;
    }
    public static double hitungLuas(double panjang, double lebar){
        return panjang*lebar;
    }
    public static double hitungLuas (double Jarijari, boolean isLingkaran){
        if (isLingkaran){
        return Math.PI*Jarijari*Jarijari;
        }else{
        return 0;
        }
    }

    public static void main(String[]args){
    double luasPersegi = hitungLuas(5);
        System.out.println(luasPersegi);

        double luasPersegiPanjang = hitungLuas(4,6);
        System.out.println(luasPersegiPanjang);

        double luasLingkaran = hitungLuas(4,true);
        System.out.println(luasLingkaran);
    }
}
