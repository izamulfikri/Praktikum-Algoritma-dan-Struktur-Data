package Tugas2;

public class Mahasiswa {
    String nim, nama, notelp;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    
    @Override
    public String toString(){
        return nim + "\t" + nama + "\t" + notelp;
    }
}
