public class contohMethodStaticdanNonstatic {
    //method static dapat diakses langsung tanpa melalui sebuah objek
    public static double hitungLuasPersegi(double sisi){
        return sisi * sisi;
    }

    //method non-static (instance) hanya dapat diakses menggunakan sebuah objek
    public void tampilkanPesanSelamatDatang(String Nama){
        System.out.println("Selamat Datang. "+ Nama + " !");
    }

    public static void main(String[] args) {
        double luasPersegi = contohMethodStaticdanNonstatic.hitungLuasPersegi(5);
        System.out.println(luasPersegi);

        //berikut adalah cara mendeklarasikan sebuah objek
        contohMethodStaticdanNonstatic pesan = new contohMethodStaticdanNonstatic();

        //berikut adalah cara untuk memanggil method non static
        pesan.tampilkanPesanSelamatDatang("Harry Stanly Manik");
    }
}