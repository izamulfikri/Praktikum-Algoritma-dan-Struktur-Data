public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return (double) alas*tinggi*0.5;
    }

    //dengan asumsi segitiga ini adalah segitiga sama sisi
    public int hitungKeliling(){
        return alas*3;
    }
}