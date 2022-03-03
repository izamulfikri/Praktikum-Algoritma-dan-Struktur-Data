package Latihan1;

public class Bola {
    public int r;
    public double phi = 3.14;

    public Bola(int jari){
        r = jari;
    }

    public double hitungLuasPermukaan(){
        return (double) 4*phi*r*r;
    }

    public double hitungVolume(){
        return (double) 4/3*phi*r*r*r;
    }

    
}
