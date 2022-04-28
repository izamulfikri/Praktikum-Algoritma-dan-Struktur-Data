package Praktikum1;
import java.util.Scanner;

class QueueMain {

    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. peekPosition");
        System.out.println("7. peekAt");
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int pilih;
            do {
                menu();
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data baru : ");
                        int dataMasuk = sc.nextInt();
                        int overflow = Q.Enqueue(dataMasuk);
                        if (overflow == 1) {
                            System.out.println("Program Berhenti");
                            return;
                        }
                        break;
                    case 2:
                        int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0) {
                            System.out.println("Data yang dikeluarkan : " + dataKeluar);
                            break;
                        } else if (dataKeluar == 0) {
                            System.out.println("Program Berhenti");
                            return;
                        }
                    case 3:
                        Q.print();
                        break;
                    case 4:
                        Q.peek();
                        break;
                    case 5:
                        Q.clear();
                        break;
                    case 6:
                        System.out.print("Masukkan data : ");
                        int dt = sc.nextInt();
                        Q.peekPosition(dt);
                        break;
                    case 7:
                    System.out.print("Masukkan indeks : ");
                    int idx = sc.nextInt();
                    Q.peekAt(idx);
                    break;
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
