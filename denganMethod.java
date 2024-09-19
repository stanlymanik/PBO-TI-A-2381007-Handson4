public class denganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjangTransport = 5000000;
        int tunjanganMakan = 3000000;
        int bonus = 10000000;
        //
        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok,tunjangTransport,tunjanganMakan,bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan,pajak);

        tampilankanDetailGaji(gajiPokok,tunjangTransport,tunjanganMakan,bonus,pajak,gajiBersih);

    }
    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan,int bonus){
        return gajiPokok + tunjanganMakan + tunjanganTransport + tunjanganTransport + bonus;
    }
    public static int hitungPajak(int totalPenghasilan){
        return totalPenghasilan * 10 /100;
    }
    public static int hitungGajiBersih(int totalPenghasilan, int pajak){
        return totalPenghasilan - pajak;
    }

    public static void tampilankanDetailGaji(int gajiPokok, int tunjanganTransport, int tunjanganMakan,int bonus, int pajak, int gajiBersih){
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan Transport : " + tunjanganTransport);
        System.out.println("Tunjangan Makan : " + tunjanganMakan);
        System.out.println("Bonus : " + bonus);
        System.out.println("Pajak : " + pajak);
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
}