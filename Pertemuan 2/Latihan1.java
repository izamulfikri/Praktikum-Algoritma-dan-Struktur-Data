public class Latihan1 {
    String nama;
    int hargaSatuan, jumlah;

    int hitungHargaTotal(){
        int total = hargaSatuan * jumlah;
        return total;
    }
    double hitungDiskon(){
        if(hargaSatuan>100000){
            return hargaSatuan*0.1;
        } else if (hargaSatuan>=50000){
            return hargaSatuan*0.05;
        } else {
            return 0;
        }
    }
    double hitungHargaBayar(){
        return hitungHargaTotal()-hitungDiskon()*jumlah;
    }
}
