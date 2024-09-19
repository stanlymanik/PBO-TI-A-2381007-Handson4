public class contohParameterMethod {
    public static int kaliDua ( int angka){
        return angka * 2;
    }
    public static double
    hitungLuasSegitiga (int alas,int tinggi){
        return 0.5*alas*tinggi;
    }
    public static void main(String[]args){
        int hasilKaliDua = kaliDua(5);
        System.out.println("5*2 = " + hasilKaliDua);

        double hasilHitungLuasSegitiga = hitungLuasSegitiga(3,2);
        System.out.println("luas Segitiga : " + hasilHitungLuasSegitiga );
    }
}
