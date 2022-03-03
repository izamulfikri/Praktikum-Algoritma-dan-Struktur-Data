package pertemuan1;
//Nama : Mohammad Izamul Fikri Fahmi
//Kelas : 1F
//Absen : 17
//NIM : 2141720171
public class array {
    public static void main(String[] args) {
        int[][] royalGarden = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        int aglonema = royalGarden[0][0] + royalGarden[0][1] + royalGarden[0][2] + royalGarden[0][3];
        int keladi =  royalGarden[1][0] + royalGarden[1][1] + royalGarden[1][2] + royalGarden[1][3];
        int alocasia =  royalGarden[2][0] + royalGarden[2][1] + royalGarden[2][2] + royalGarden[2][3];
        int mawar =   royalGarden[3][0] + royalGarden[3][1] + royalGarden[3][2] + royalGarden[3][3];

        //menghitung stok
        System.out.println("A. JUMLAH STOK JENIS BUNGA DI SELURUH CABANG");
        System.out.println("Jumlah Stok Aglonema    : "+aglonema);
        System.out.println("Jumlah Stok Keladi      : "+keladi);
        System.out.println("Jumlah Stok Alocasia    ; "+alocasia);
        System.out.println("Jumlah Stok Mawar       : "+mawar);

        //menghitung total pendapatan royal garden 1
        long total = (((royalGarden[0][0]-1)*75000)+((royalGarden[0][1]-2)*50000)+((royalGarden[0][2])*60000)+((royalGarden[0][3]-5)*10000));
        System.out.println("\nB. JUMLAH TOTAL PENDAPATAN ROYAL GARDEN 1");
        System.out.println("Total Pendapatan        : "+total);

    }
}
