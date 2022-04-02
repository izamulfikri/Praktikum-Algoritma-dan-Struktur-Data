package minggu7;
import java.util.Scanner;

// Mohammad Izamul FIkri Fahmi  

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = s.nextInt();
        Mahasiswa[] a = new Mahasiswa[jumlah];
        data.listMHs = a;

        System.out.println("-------------------------------------------");
   //     System.out.println("Masukkan data mahasiswa secara Urut dari NIM terkecil");
   System.out.println("Masukkan data mahasiswa (nim tidak harus urut)"); //modfikasi tugas 1
        for(int i = 0; i < jumlah; i++){
            System.out.println("------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("___________________________________________");
        //modfikasi keperluan tugas 1
        System.out.println("data setelah diurutkan dengan selection sort descending");
        data.selectionSort();
        data.tampil();
        //akhir dari modifikasi tugas 1
        System.out.println("___________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari = s1.nextLine();
        System.out.println("menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);

        data.Tampilposisi(cari, posisi);

        data.TampilData(cari, posisi);

        //untuk keperluan tugas nomor 2 , maka bagian ini tidak ditampilkan

        // modifikasi penambahan percobaan 6.3 Binary Search
        // System.out.println("===========================================");
        // System.out.println("menggunakan binary Search");
        // posisi = data.FindBinarySearch(cari, 0, jumlah - 1);
        // data.Tampilposisi(cari, posisi);
        // data.TampilData(cari, posisi);
    }
}
