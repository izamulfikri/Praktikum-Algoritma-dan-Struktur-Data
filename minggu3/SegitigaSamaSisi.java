import java.util.Scanner;
public class SegitigaSamaSisi {
    public int sisi;

public class ArrayObject2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SegitigaSamaSisi[][] arrayDua = new SegitigaSamaSisi[2][2];

        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){

                arrayDua[i][j] = new SegitigaSamaSisi();
                System.out.print("Masukkan sisi segitiga baris-"+i+" kolom-"+j+" =");
                arrayDua[i][j].sisi = sc.nextInt();
            }
        }
        //menampilkan
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){

                System.out.println("sisi segitiga baris-"+i+" kolom-"+j+" ="+arrayDua[i][j].sisi);

            }
        }
    }
}
}
