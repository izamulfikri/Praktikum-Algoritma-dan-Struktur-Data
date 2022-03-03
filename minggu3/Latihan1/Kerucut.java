package Latihan1;

public class Kerucut {
    public int r, t, s;
    public double phi = 3.14;

    public Kerucut(int jari, int tinggi, int sisi){
        r = jari;
        t = tinggi;
        s = sisi;
    }
    
    public double hitungLuasPermukaan(){
        return (double) phi*r*(r+s);
    }
    
    public double hitungVolume(){
        return (double) 1/3*phi*r*r*t;
    }
    
}

