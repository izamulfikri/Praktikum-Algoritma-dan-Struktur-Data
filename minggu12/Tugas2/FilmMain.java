package Tugas2;
import java.util.Scanner;
public class FilmMain {

    public static void menu() {
        System.out.println("=======================================");
        System.out.println("     DATA FILM DI ZAM LAYAR LEBAR");
        System.out.println("=======================================");
        System.out.println(" 1. Tambah Data Awal");
        System.out.println(" 2. Tambah Data Akhir");
        System.out.println(" 3. Tambah Data Index Tertentu");
        System.out.println(" 4. Hapus Data Pertama");
        System.out.println(" 5. Hapus Data Terakhir");
        System.out.println(" 6. Hapus Data Tertentu (pakai Index)");
        System.out.println(" 7. Cetak");
        System.out.println(" 8. Cari ID Film");
        System.out.println(" 9. Urut Data Rating Film-DESC");
        System.out.println(" 10. Keluar");
        System.out.println("=======================================");
    }
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    FilmDLL f = new FilmDLL();
    int opsi = 0;
    int id,idx;
    String judul;
    float rating;

    do {
        menu();
        System.out.print("Masukkan Opsi : ");
        opsi = sc.nextInt();
        System.out.println();

        switch(opsi) {
            case 1:
            System.out.println("-- Menambahkan Data Film di Awal --");
            System.out.print("ID Film     : ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Judul Film  : ");
            judul = sc.nextLine();
            System.out.print("Rating Film : ");
            rating = sc.nextFloat();
            f.addFirst(id, judul, rating);
            break;

            case 2:
            System.out.println("-- Menambahkan Data Film di Akhir --");
            System.out.print("ID Film     : ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Judul Film  : ");
            judul = sc.nextLine();
            System.out.print("Rating Film : ");
            rating = sc.nextFloat();
            f.addLast(id, judul, rating);
            break;

            case 3:
            System.out.println("-- Menambahkan Data Film di Index Tertentu --");
            System.out.print("ID Film     : ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Judul Film  : ");
            judul = sc.nextLine();
            System.out.print("Rating Film : ");
            rating = sc.nextFloat();
            System.out.println("Index Ke  : ");
            idx = sc.nextInt();
            f.add(id, judul, rating, idx);
            break;

            case 4:
            f.removeFirst();
            break;

            case 5:
            f.removeLast();
            break;

            case 6:
            System.out.println("-- Menghapus Data Film di Index tertentu --");
            System.out.print("Masukkan index : ");
            idx = sc.nextInt();
            f.remove(idx);
            break;

            case 7:
            f.print();
            break;

            case 8:
            System.out.println("-- Mencari ID Film --");
            System.out.print("Masukkan ID : ");
            id = sc.nextInt();
            f.cariId(id);
            break;

            case 9:
            f.sort();
            System.out.println("-- Data Sudah diUrutkan Descending -- ");
            break;

            case 10:
            f.keluar();
            break;

            default:
            System.out.println("Masukkan Opsi Dengan Benar :)");
        }
    }  while(opsi!=10);
    }
    

}
