package Tugas4;
import java.util.Scanner;
public class MainTugas4 {
    public static void main(String[] args) {

        System.out.println("+----------------------------------+");
        System.out.println("|    Antrian KRS Mahasiswa SSL     |");
        System.out.println("+----------------------------------+");

        SLLTugas4 sll = new SLLTugas4();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        char pilih;
        int menu;
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data Terakhir");
            System.out.println("3. Lihat Antrian Paling Depan");
            System.out.println("4. Lihat Antrian Paling Belakang");
            System.out.println("5. Mencari Data Mahasiswa Melalui Index");
            System.out.println("6. Mencari Data Mahasiswa Melalui NIM");
            System.out.println("7. Tampilkan Data");
            System.out.println("8. Keluar");
            System.out.print("Masukkan opsi (1-8) : ");
            menu = sc.nextInt();
            System.out.println("");
            if (menu < 1 || menu > 8) {
                System.out.println("Masukkan Pilihan Menu Yang Benar!");
            }

            switch (menu) {
                case 1: {
                    do {
                        System.out.print("NIM Mahasiswa     : ");
                        String nim = in.nextLine();
                        System.out.print("Nama Mahasiswa    : ");
                        String nama = in.nextLine();
                        System.out.print("No Absen Mahasiwa : ");
                        int absen = in.nextInt();
                        System.out.print("Nilai IPK         : ");
                        double ipk = sc.nextDouble();
                        System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                        pilih = sc.next().charAt(0);
                        sll.tambahData(nim, nama, absen, ipk);
                        System.out.println("");
                        in.nextLine();
                    } while (pilih == 'y' || pilih == 'Y');
                }
                break;
                case 2: {
                    sll.remove();
                    System.out.println("");
                }
                break;
                case 3: {
                    sll.antrianDepan();
                    System.out.println("");
                }
                break;
                case 4: {
                    sll.antrianBelakang();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.print("Masukkan Index Pada Data Yang Dicari : ");
                    int idx = sc.nextInt();
                    sll.cariIndex(idx);
                    System.out.println("");
                }
                break;
                case 6: {
                    System.out.print("Masukkan NIM Yang Ingin Dicari : ");
                    String nim = in.nextLine();
                    sll.cariNim(nim);
                    System.out.println("");
                }
                break;
                case 7: {
                    sll.print();
                    System.out.println("");
                }
            }
        } while (menu > 0 && menu < 8);
        System.out.println("Terimakasih....");
    }
}
