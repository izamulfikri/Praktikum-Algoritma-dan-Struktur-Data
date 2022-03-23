import java.util.Scanner;

/**
 * @author Mohammad Izamul Fikri Fahmi
 */
public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opsi;

        do{
        System.out.println("Program Menghitung Pangkat Dengan Brute Force atau Divide Conquer");
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt(); 

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("_________________________________________________________________");
        System.out.println("pilih menu 1-3");
        System.out.println("1. Hitung Pangkat Metode Brute Force");
        System.out.println("2. Hitung Pangkat Metode Brute Divide and Conquer");
        System.out.println("3. Keluar");
        System.out.print("masukkan pilihanmu : ");
        opsi = sc.nextInt();

        switch(opsi){
            case 1 :
            System.out.println("========================================");
            System.out.println("Hasil pangkat dengan Brute Force");
            for(int i = 0; i < elemen ; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
            break;
            case 2 :
            System.out.println("========================================");
            System.out.println("Hasil pangkat dengan Divide Conquer");
            for(int i = 0; i < elemen ; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            System.out.println("========================================");
            break;
            case 3 :
            System.out.println("anda keluar dari program");
            break;
            default :
            System.out.println("Pilihan yang anda masukkan salah, pilih ulang");
            break;
        }
        }while(opsi!=3&&opsi!=1&&opsi!=2);
/* 
        //modifikasi pemberian nilai dengan konstruktor
        Pangkat[] png = new Pangkat[5];
        png[0] = new Pangkat(5, 3);
        png[1] = new Pangkat(4, 5);
        png[2] = new Pangkat(6, 2);
        png[3] = new Pangkat(7, 3);
        png[4] = new Pangkat(2, 6); */

        System.out.println("---- Terimakasih ----");
        sc.close();
    }
    
}
