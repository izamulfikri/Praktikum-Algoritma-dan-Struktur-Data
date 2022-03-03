package Latihan3;
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mArray = new Mahasiswa[3];

        String nama;
        int nim;
        char kelamin;
        float ipk;

        for(int i=0;i<3;i++){
            System.out.println("");
            System.out.println("Masukkan data mahasiswa ke- "+(i+1));
            System.out.print("Masukkan nama : ");
            nama = sc.next();
            System.out.print("Masukkan nim : ");
            nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            kelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            ipk = sc.nextFloat();

            mArray[i] = new Mahasiswa(nama, nim, ipk, kelamin);
        }
        System.out.println("\n");
        for(int i=0;i<3;i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));
            mArray[i].tampilData();
        }

    }
}
