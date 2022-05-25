package Tugas2;
public class Film {
    Film prev, next;
    int id;
    String judul;
    float rating;

    Film(Film p, int id, String judul, float rating, Film n){
        this.prev = p;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = n;
    }
}