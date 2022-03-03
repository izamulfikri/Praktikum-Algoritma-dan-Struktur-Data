package Latihan1;

public class Kubus {
    public int sisi;

    public Kubus(int s){
        sisi = s;
    }

    public int hitungLuasPermukaan(){
        return sisi*sisi*6;
    }

    public int hitungVolume(){
        return sisi*sisi*sisi;
    }
}
