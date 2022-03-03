package Latihan2;
import java.util.Scanner;
public class MainTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar;

        System.out.println("Program Menghitung Luas Tanah\n==============================");
        System.out.print("Jumlah Tanah: ");
        int loop = sc.nextInt();

        System.out.println("");

         //deklarasi array tanah
         Tanah[] tArray = new Tanah[loop];
         //menampung luas
        int[] luas = new int[loop];

         for(int i=0;i<loop;i++){
             System.out.printf("Tanah %d \n",i+1);
             System.out.print("Panjang : ");
             panjang = sc.nextInt();
             System.out.print("Lebar : ");
             lebar = sc.nextInt();

             //masukkan ke kontruksi berparameter
             tArray[i] = new Tanah(panjang, lebar);
             luas[i] = tArray[i].hitungLuas();
         }

         System.out.println("");

         int banding=0;
         int max=0;
         for(int i=0;i<loop;i++){
            System.out.println("Luas Tanah "+(i+1)+": "+luas[i]);
            if (luas[i]>banding){
                banding = luas[i];
                max = i+1;

            }
         }

         System.out.println("\nTanah terluas: Tanah "+max);



    }
}
