package Tugas1;

public class Film {
    
    int id, tahun;
    String judul, director;

    public Film(int id, String judul, int tahun, String director) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    @Override

    public String toString() {
        return "film\n" + "id : "+id+"\njudul : "+judul+"\ntahun : "+tahun+"\ndirector : "+director;
    }
}