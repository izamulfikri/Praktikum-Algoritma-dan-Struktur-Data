import java.util.Scanner;
/**
 * @author Mohammad Izamul Fikri Fahmi
 */
public class ZamLatihanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("=      Hitung Mayoritas Suara         =");
        System.out.println("=======================================\n");

        System.out.print("Masukkan Jumlah Suara Terkumpul (harus genap) : ");
        int suara = sc.nextInt();
        if (suara%2==1&&suara%2!=0){
            System.out.println("Anda Menginputkan bilangan ganjil/inputan yang tidak sesuai");
            return;
        }
        ZamLatihan objekMayo = new ZamLatihan();
        objekMayo.jSuara = suara;

        objekMayo.inputNama();
        objekMayo.cekNama();
        objekMayo.cekMenang();

    }
}
