package jobsheet;
import java.util.Scanner;

public class TiketMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaftarTiket list = new DaftarTiket();

        // Data ini hanya fiktif, keperluan rancangan saja
        Tiket t1 = new Tiket("Zam Air", "Banyuwangi", "Malang", 1200000);
        Tiket t2 = new Tiket("Fikri Air", "Bali", "Surabaya", 1900000);
        Tiket t3 = new Tiket("Angel Wings", "Banyuwangi", "Medan", 2500000);
        Tiket t4 = new Tiket("Berkah Udara", "Jakarta", "Mekah", 10000000);
        Tiket t5 = new Tiket("Izamul AirAsia", "Bali", "Tokyo", 5000000);
        Tiket t6 = new Tiket("Garuda jayalangit", "Nusantara", "Moskow", 7000000);

        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        list.tambah(t6);
        System.out.println("------------------------");
        System.out.println("| Data Sebelum Sorting |");
        System.out.println("------------------------");
        list.tampil();
        System.out.println();


        System.out.println("> Harga Termurah ke Termahal <");
        System.out.println("---------------------------------------------------");
        System.out.println("| Data Penerbangan Sorting Asc dengan Bubble sort |");
        System.out.println("---------------------------------------------------");
        list.bubbleSort();;
        list.tampil();


        System.out.println("> Harga Termurah ke Termahal <");
        System.out.println("---------------------------------------------------");
        System.out.println("| Data Penerbangan Sorting Asc dengan Selection sort |");
        System.out.println("---------------------------------------------------");
        list.selecionSort();
        list.tampil();
    }
}
