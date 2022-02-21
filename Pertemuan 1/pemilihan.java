package pertemuan1;
//Nama : Mohammad Izamul Fikri Fahmi
//Kelas : 1F
//Absen : 17
//NIM : 2141720171
import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tugas, uts, uas;
        double lastValue;
        String letterValue, status;

        System.out.println("*----------------------------*");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai UTS   : ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai Uas   : ");
        uas = sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        lastValue = (double) (tugas*0.2)+(uts*0.35)+(uas*0.45);

        //pemilihan
        if(lastValue > 80 && lastValue <= 100){
            letterValue = "A";
            System.out.println("nilai akhir          : "+lastValue);
            System.out.println("Nilai Huruf          : "+letterValue);
            status = "SELAMAT LULUS";
        } else if (lastValue > 73 && lastValue <= 80){
            letterValue = "B+";
            System.out.println("nilai akhir          : "+lastValue);
            System.out.println("Nilai Huruf          : "+letterValue);
            status = "SELAMAT LULUS";
        } else if (lastValue > 65 && lastValue <= 73){
            letterValue = "B";
            System.out.println("nilai akhir          : "+lastValue);
            System.out.println("Nilai Huruf          : "+letterValue);
            status = "SELAMAT LULUS";
        } else if (lastValue > 60 && lastValue <= 65){
            letterValue = "C+";
            System.out.println("nilai akhir          : "+lastValue);
            System.out.println("Nilai Huruf          : "+letterValue);
            status = "SELAMAT LULUS";
        } else if (lastValue > 50 && lastValue <= 60){
            letterValue = "C";
            System.out.println("nilai akhir          : "+lastValue);
            System.out.println("Nilai Huruf          : "+letterValue);
            status = "SELAMAT LULUS";
        } else if (lastValue > 39 && lastValue <= 50){
            letterValue = "D";
            System.out.println("nilai akhir          : "+lastValue);
            System.out.println("Nilai Huruf          : "+letterValue);
            status = "TIDAK LULUS";
        } else if (lastValue <= 39){
            letterValue = "E";
            System.out.println("nilai akhir          : "+lastValue);
            System.out.println("Nilai Huruf          : "+letterValue);
            status = "TIDAK LULUS";
        } else {
            System.out.println("Input Yang Anda Masukkan Mungkin Salah");
            status = "TIDAK DIKETAHUI";
        }
        System.out.println("==============================");
        System.out.println(status);
        sc.close();
    }
}
