import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //menerima inputan length array
    System.out.print("Masukkan panjang array : ");
    int panjang = sc.nextInt();
    PersegiPanjang[] ppArray = new PersegiPanjang[panjang];
    
    for (int i = 0; i < panjang; i++){
        ppArray[0] = new PersegiPanjang();//double instansi
        ppArray[i] = new PersegiPanjang();
        System.out.println("Persegi panjang ke-"+ i);
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar = sc.nextInt();
    }
    for (int i = 0; i < panjang; i++){
    System.out.println("Persegi Panjang ke-"+ i);
    System.out.println("Panjang: "+ppArray[i].panjang+", Lebar: "+ppArray[i].lebar);
    }
    }
}