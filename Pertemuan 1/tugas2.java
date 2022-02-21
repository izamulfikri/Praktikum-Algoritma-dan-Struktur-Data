package pertemuan1;
//Nama : Mohammad Izamul Fikri Fahmi
//Kelas : 1F
//Absen : 17
//NIM : 2141720171
import java.util.Scanner;
public class tugas2 {
    /* keterangan
    v = kecepatan
    s = jarak
    t = waktu */
    static Scanner sc = new Scanner(System.in);

    public static void kecepatan(){
        double v,s,t;
        System.out.println("\n*-- Menghitung Kecepatan --*");
        System.out.println("===================================================");
        System.out.print("Masukkan jarak (satuan km)  : ");
        s = sc.nextInt();
        System.out.print("Masukkan Waktu (satuan jam) : ");
        t = sc.nextInt();
        v = s / t;
        System.out.printf("Kecepatan                   : %.1fkm/jam\n\n",v);
        jeda();
    }
    public static void jarak(){
        double v,s,t;
        System.out.println("\n*-- Menghitung Jarak --*");
        System.out.println("===================================================");
        System.out.print("Masukkan Kecepatan (satuan km/jam)  : ");
        v = sc.nextInt();
        System.out.print("Masukkan Waktu     (satuan jam)     : ");
        t = sc.nextInt();
        s = v * t;
        System.out.printf("Jarak                               : %.1fkm\n\n",s);
        jeda();
        
    }
    public static void waktu(){
        double v,s,t;
        System.out.println("\n*-- Menghitung waktu --*");
        System.out.println("===================================================");
        System.out.print("Masukkan jarak     (satuan km)     : ");
        s = sc.nextInt();
        System.out.print("Masukkan Kecepatan (satuan km/jam) : ");
        v = sc.nextInt();
        t = s / v;
        System.out.printf("Waktu                              : %.2fjam\n\n",t);
        jeda();
    }
    //Fungsi input untuk lanjut
    public static void jeda() {
	Scanner enter = new Scanner(System.in);
    System.out.print("\n\nKetik Enter Untuk Lanjut...");
	enter.nextLine();
	System.out.println();
    }
    
    public static void main(String[] args) {
        
    int opsi;
    do{
        System.out.println("*-- PROGRAM MENGHITUNG KECEPATAN JARAK & WAKTU --*");
        System.out.println("===================================================");
        System.out.println("1. Menghitung kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.println("4. Keluar");
        System.out.println("___________________________________________________");
        System.out.print("Masukkan Opsi : ");
        opsi = sc.nextInt();
        switch(opsi){
            case 1:
            kecepatan();
            break;
            case 2:
            jarak();
            break;
            case 3:
            waktu();
            break;
            case 4:
            System.out.println("\nTerima kasih telah menggunakan program ini ^_^\n");
            break;
            default:
            System.out.println("\nopsi yang anda masukkan salah\n");
        }
    }while(opsi!=4);
    }
}
