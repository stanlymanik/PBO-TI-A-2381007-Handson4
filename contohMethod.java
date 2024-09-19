public class contohMethod {
    public static int hitungLuasPersegi(int sisi){
        return sisi*sisi;
    }
    public static void main (String[]args){
        int sisi = 5;
        int luas = hitungLuasPersegi(sisi);
        System.out.println("luas persegi dengan sisi" + sisi + "adalah : " + luas);
    }
}
