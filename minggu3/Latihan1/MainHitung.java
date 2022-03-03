package Latihan1;
import java.util.Scanner;
public class MainHitung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi array
        Bola[] blArray = new Bola[100];
        Kerucut[] kcArray = new Kerucut[100];
        Kubus[] kbArray = new Kubus[100];

        System.out.println("Selamat Datang Di Program Menghitung");
        System.out.println("-------------------------------------");
        System.out.print("Jumlah Loop : ");
        int loop = sc.nextInt();

        //perulangan untuk menginput konstruksi
        for(int i=0;i<loop;i++){
            //bola
            System.out.println("==================================");
            System.out.printf("------------- BOLA %d------------\n",i+1);
            System.out.print("Masukkan jari-jari : ");
            int jari = sc.nextInt();
            blArray[i] = new Bola(jari);
            System.out.println("Volume : "+blArray[i].hitungVolume());
            System.out.println("Luas Permukaan : "+blArray[i].hitungLuasPermukaan());

            //kerucut
            System.out.println("==================================");
            System.out.printf("------------- KERUCUT %d------------\n",i+1);
            System.out.print("Masukkan jari-jari : ");
            jari = sc.nextInt();
            System.out.print("Masukkan tinggi : ");
            int tinggi = sc.nextInt();
            System.out.print("Masukkan sisi : ");
            int sisi = sc.nextInt();
            kcArray[i] = new Kerucut(jari, tinggi, sisi);
            System.out.println("Volume : "+kcArray[i].hitungVolume());
            System.out.println("Luas Permukaan : "+kcArray[i].hitungLuasPermukaan());

            //Kubus
            System.out.println("==================================");
            System.out.printf("------------- KUBUS %d------------\n",i+1);
            System.out.print("Masukkan sisi : ");
            sisi = sc.nextInt();
            kbArray[i] = new Kubus(sisi);
            System.out.println("Volume : "+kbArray[i].hitungVolume());
            System.out.println("Luas Permukaan : "+kbArray[i].hitungLuasPermukaan());
        }
    }
}
