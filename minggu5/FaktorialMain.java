import java.util.Scanner;
/**
 * @author Mohammad Izamul Fikri Fahmi
 */

public class FaktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.print("Masukkan Jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i = 0; i < elemen; i ++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("===================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startTime = System.currentTimeMillis(); // mengambil waktu mulai eksekusi
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        long endTime = System.currentTimeMillis(); // mengambil waktu akhir eksekusi
        System.out.println("Waktu eksekusi program BF dalam milidetik : "+(endTime-startTime)); // menampilkan waktu eksekusi

        System.out.println("===================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        long startTime1 = System.currentTimeMillis(); // mengambil waktu mulai eksekusi
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        long endTime1 = System.currentTimeMillis(); // mengambil waktu akhir eksekusi
        System.out.println("Waktu eksekusi program DC dalam milidetik : "+(endTime1-startTime1)); // menampilkan waktu eksekusi
        System.out.println("====================================");

        sc.close();
    }
}
