package Tugas4;
public class NodeTugas4 {
    
    String nim, nama;
    int absen;
    double ipk;

    NodeTugas4 next;

    NodeTugas4(String nm, String nma, int ab, double pk, NodeTugas4 berikutnya){
        this.nim = nm;
        this.nama = nma;
        this.absen = ab;
        this.ipk = pk;
        this.next = berikutnya;
    }
}

