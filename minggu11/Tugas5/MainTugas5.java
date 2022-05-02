package Tugas5;
import java.util.Scanner;
public class MainTugas5 {
    public static void main(String[] args) {

        System.out.println("+----------------------------------+");
        System.out.println("| Antrian KRS Mahasiswa SSL (Queue)|");
        System.out.println("+----------------------------------+");

        SLLTugas5 sll = new SLLTugas5();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int menu, jmlh;
        int i = 0;
        System.out.print("Masukkan jumlah nasabah : ");
        jmlh = sc.nextInt();
        System.out.println("");
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah Data (Enqueue)");
            System.out.println("2. Hapus Data Terakhir (Dequeue)");
            System.out.println("3. Lihat Antrian Paling Depan (Peek)");
            System.out.println("4. Lihat Antrian Paling Belakang (Peek Rear)");
            System.out.println("5. Mencari Data Mahasiswa Melalui Index");
            System.out.println("6. Mencari Data Mahasiswa Melalui NIM");
            System.out.println("7. Tampilkan Data (print");
            System.out.println("8. Kosongkan semua (clear)");
            System.out.println("9. Keluar");
            System.out.print("Masukkan opsi (1-9) : ");
            menu = sc.nextInt();
            System.out.println("");
            if (menu < 1 || menu > 9) {
                System.out.println("Masukkan Pilihan Menu Yang Benar!");
            }

            switch (menu) {
                case 1: {
                    do {
                        if (i == jmlh) {
                            System.out.println("Data sudah penuh");
                            continue;
                        }
                        System.out.print("NIM Mahasiswa     : ");
                        String nim = in.nextLine();
                        System.out.print("Nama Mahasiswa    : ");
                        String nama = in.nextLine();
                        System.out.print("No Absen Mahasiwa : ");
                        int absen = in.nextInt();
                        System.out.print("Nilai IPK         : ");
                        double ipk = sc.nextDouble();
                        sll.Enqueue(nim, nama, absen, ipk);
                        System.out.println("");
                        in.nextLine();
                        i++;
                    } while (i < jmlh);
                }
                break;
                case 2: {
                    sll.Dequeue();
                    System.out.println("");
                }
                break;
                case 3: {
                    sll.peek();
                    System.out.println("");
                }
                break;
                case 4: {
                    sll.peekRear();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.print("Masukkan Index Pada Data Yang Dicari : ");
                    int idx = sc.nextInt();
                    sll.peekAt(idx);
                    System.out.println("");
                }
                break;
                case 6: {
                    System.out.print("Masukkan NIM Yang Ingin Dicari : ");
                    String nim = in.nextLine();
                    sll.peekPosition(nim);
                    System.out.println("");
                }
                break;
                case 7: {
                    sll.print();
                    System.out.println("");
                }
                break;
                case 8: {
                    sll.clear(jmlh);
                    System.out.println("");
                }
                break;
            }
        } while (menu > 0 && menu < 9);
        System.out.println("Terimakasih....");
    }
}
