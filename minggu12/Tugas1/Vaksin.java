package Tugas1;

public class Vaksin {
    int antrian;
    String nama;
    Vaksin prev, next;

    Vaksin(Vaksin prev, int antrian, String nama, Vaksin next) {
        this.prev = prev;
        this.antrian = antrian;
        this.nama = nama;
        this.next = next;
    }
}
