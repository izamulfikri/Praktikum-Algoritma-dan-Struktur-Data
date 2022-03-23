import java.util.Scanner;
/**
 * @author Mohammad Izamul Fikri Fahmi
 */

public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.print("Masukkan jumlah perusahaan : ");
        int pr = sc.nextInt();
        Sum arPr[] = new Sum[pr];
        int elm[] = new int[pr];
        for(int j = 0; j<arPr.length; j++){

            System.out.println("===================================");
            System.out.println("Perusahaan ke-"+(j+1));
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan : ");
            elm[j] = sc.nextInt();
            
            arPr[j] = new Sum(elm[j]);
//            Sum sm = new Sum(elm[j]);
            System.out.println("===================================");
            for (int i = 0; i < arPr[j].elemen ; i++){
                System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
                arPr[j].keuntungan[i] = sc.nextDouble();
            }
    
            System.out.println("===================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan " +(j+1)+ " selama "+ arPr[j].elemen + " bulan adalah = %.2f",arPr[j].totalBF(arPr[j].keuntungan)); //perubahan output %.2f untuk standard sama
            System.out.println("");
    
            System.out.println("===================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan " +(j+1)+ " selama "+ arPr[j].elemen + " bulan adalah = %.2f",arPr[j].totalDC(arPr[j].keuntungan, 0, arPr[j].elemen-1)); //perubahan output %.2f untuk standard sama
            System.out.println("");

        }
        
    }
}
