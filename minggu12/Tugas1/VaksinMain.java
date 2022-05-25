package Tugas1;
import java.util.Scanner;
public class VaksinMain {
    public static void main(String[] args) throws Exception{
        VaksinDLL vk = new VaksinDLL();
        Scanner sc = new Scanner(System.in);
        int opsi;
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println();

            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("pilihan anda : ");
            opsi = sc.nextInt();

            switch(opsi) {
                case 1:
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.println("Nomor Antrian:");
                int antri = sc.nextInt();
                sc.nextLine();
                System.out.println("-Nama Antrian:");
                String nama = sc.nextLine();
                vk.tambah(antri, nama);
                break;
                
                case 2:
                vk.hapus();
                break;

                case 3:
                System.out.println("++++++++++++++++++++++++");
                System.out.println("Daftar Pengantri Vaksin");
                System.out.println("++++++++++++++++++++++++");
                vk.print();
                break;

                case 4:
                System.out.println("Anda Keluar Program");
                break;

                default:
                System.out.println("Masukkan pilihan dengan benar");
                break;
            }
        } while (opsi!=4);
        System.out.println("Terimakasih ^_^"); 
    }
}
