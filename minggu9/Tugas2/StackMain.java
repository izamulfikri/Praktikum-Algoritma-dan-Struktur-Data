package Tugas2;
import java.util.Scanner;

public class StackMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack s = new Stack(8);

        System.out.println("+-----------------------+");
        System.out.println("| Masukkan 8 Data Struk |");
        System.out.println("+-----------------------+");
        for(int i=0; i<8; i++){
            System.out.print("No Transaksi         : ");
            int transaksi = sc.nextInt();
            sc.nextLine();
            System.out.print("Tanggal (Minggu-n)   : ");
            String tanggal = sc.nextLine();
            System.out.print("Jumlah Barang        : ");
            int barang = sc.nextInt();
            System.out.print("Total Harga          : ");
            int total = sc.nextInt();
            System.out.println("________________________");
           
            Struk sk = new Struk(transaksi, barang, tanggal, total);
            sc.nextLine();
            s.push(sk);
        }

        System.out.println("\n");
        System.out.println("+-----------------------+");
        System.out.println("| 5 Data Yang Di Ambil  |");
        System.out.println("+-----------------------+");

        // batasnya 5
        for(int j=0; j<5; j++){
            s.pop();
        }

        // menampilkan keseluruhan
        System.out.println("+-----------------------+");
        System.out.println("|  Data Yang Tersisa  |");
        System.out.println("+-----------------------+");

        s.print();
    }
}
