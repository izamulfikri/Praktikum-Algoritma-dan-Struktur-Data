package Tugas5;
public class NodeTugas5 {
    
    String nim, nama;
    int absen;
    double ipk;
    NodeTugas5 next;

    NodeTugas5(String nm, String nma, int ab, double pk, NodeTugas5 berikutnya){
        this.nim = nm;
        this.nama = nma;
        this.absen = ab;
        this.ipk = pk;
        this.next = berikutnya;
    }
}

