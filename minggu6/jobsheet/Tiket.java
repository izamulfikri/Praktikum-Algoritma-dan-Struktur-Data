package jobsheet;

public class Tiket {
    String maskapai, tujuan, asal;
    int harga;

    Tiket(String m, String a, String t,int h){
        maskapai = m;
        asal = a;
        tujuan = t;
        harga = h;
    }

    void tampil(){
        System.out.println("==============================");
        System.out.println("|   Izamul Fikri TiketStore  |");
        System.out.println("==============================");
        System.out.println("Maskapai     : " + maskapai);
        System.out.println("Asal         : " + asal);
        System.out.println("Tujuan       : " + tujuan);
        System.out.println("Harga        : Rp." + harga+",-");
    }
}
