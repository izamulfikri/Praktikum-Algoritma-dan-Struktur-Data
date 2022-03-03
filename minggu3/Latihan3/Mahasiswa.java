package Latihan3;

public class Mahasiswa {
    public String nama;
    public int nim;
    public float ipk;
    public char gender;

    public Mahasiswa(String nm, int no, float ip, char g){
        nama = nm;
        nim = no;
        ipk = ip;
        gender = g;
    }

    public void tampilData(){
        System.out.println("Nama : "+nama );
        System.out.println("NIM : "+nim );
        System.out.println("Jenis kelamin : "+gender );
        System.out.println("Nilai IPK : "+ipk );

    }
}
