package Tugas2;
import java.util.List;
public class MataKuliah {
    String kode, matkul;
    int sks;
    
    public MataKuliah(){
        
    }
    public MataKuliah(String kode, String matkul, int sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }
    
    public String toString(){
        return kode + "\t" + matkul + "\t" + sks;
    }
}
