package Praktikum1;
import java.util.Scanner;

public class StackMain1 {
    public static void main(String[] args) {
        Stack1 stk = new Stack1(5);
        Scanner sc = new Scanner(System.in);

        char opsi;
        char pilih;
        //perulangan memilih menu
        do {
            System.out.println("+---------------------------+");
            System.out.println("1. Melakukan push");
            System.out.println("2. Melakukan pop");
            System.out.println("3. Melakukan peek");
            System.out.println("4. Melakukan print");
            System.out.println("5. Mencari yang murah");
            System.out.println("6. Keluar");
            System.out.print("Silahkan pilih opsi : ");
            opsi = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("+---------------------------+");
            switch(opsi){
                case '1':
                do {
                System.out.println("Menu Push");
                System.out.println("________________");
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    Pakaian1 p = new Pakaian1(jenis, warna, merk, ukuran, harga);
                    System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    stk.push(p);
                } while (pilih == 'y');
                break;
    
                case '2':
                System.out.println("________________");
                System.out.println("Menu Pop");
                System.out.println("________________");
                stk.pop();
                break;
    
                case '3':
                System.out.println("________________");
                System.out.println("Menu Peek");
                System.out.println("________________");
                stk.peek();
                break;
    
                case '4':
                System.out.println("________________");
                System.out.println("Menu Print");
                System.out.println("________________");
                stk.print();
                break;

                case '5':
                System.out.println("________________");
                System.out.println("Harga Termurah adalah");
                stk.getMin();
                break;

                case '6':
                System.out.println("________________");
                System.out.println("Terimakasih sudah menggunakan program kami");
                break;

                default:
                System.out.println("________________");
                System.out.println("Inputan anda salah");
                System.out.println("________________");
                break;
            }

        } while (opsi!='6');
    }
}
