package Praktikum_2;
import java.util.Scanner;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        // int[] data = {6,4,8,3,5,7,9,0,0,0};
        // int idxLast = 6;
        // bta.populateData(data, idxLast);
        // bta.traverseInOrder(0);

        // tambahan untuk tugas no 5
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Jumlah data : ");
        int dt = in.nextInt();
        int data[] = new int[dt];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan Angka : ");
            int angka = in.nextInt();
            bta.add(angka, i);
            bta.updateData(data);
        }
        System.out.println("---------------");
        System.out.print("Pilih Angka : ");
        int idxlast = in.nextInt();
        bta.populateData(data, idxlast);
        System.out.println("InOrder   : ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.println("PreOrder  : ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.println("PostOrder :");
        bta.traversePostOrder(0);
        System.out.println("");

    }
}
