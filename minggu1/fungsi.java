package pertemuan1;
//Nama : Mohammad Izamul Fikri Fahmi
//Kelas : 1F
//Absen : 17
//NIM : 2141720171
public class fungsi {
    static int[][] royalGarden = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};

    //data royalgarden1
    public static void royalGarden1(){
        int aglonema = royalGarden[0][0];
        int keladi = royalGarden[0][1];
        int alocasia = royalGarden[0][2];
        int mawar = royalGarden[0][3];

        //menampilkannya
        System.out.println("--STOK BUNGA DI ROYAL GARDEN 1--");
        System.out.println("Stok Aglonema   : "+aglonema);
        System.out.println("Stok Keladi     : "+keladi);
        System.out.println("Stok Alocasia   : "+alocasia);
        System.out.println("Stok Mawar      : "+mawar);
    }
    //data royal garden2
    public static void royalGarden2(){
      int aglonema = royalGarden[1][0];
      int keladi = royalGarden[1][1];
      int alocasia = royalGarden[1][2];
      int mawar = royalGarden[1][3];

      //menampilkannya
      System.out.println("\n--STOK BUNGA DI ROYAL GARDEN 2--");
      System.out.println("Stok Aglonema   : "+aglonema);
      System.out.println("Stok Keladi     : "+keladi);
      System.out.println("Stok Alocasia   : "+alocasia);
      System.out.println("Stok Mawar      : "+mawar);
  }
  //data royal garden3
  public static void royalGarden3(){
    int aglonema = royalGarden[2][0];
    int keladi = royalGarden[2][1];
    int alocasia = royalGarden[2][2];
    int mawar = royalGarden[2][3];

    //menampilkannya
    System.out.println("\n--STOK BUNGA DI ROYAL GARDEN 3--");
    System.out.println("Stok Aglonema   : "+aglonema);
    System.out.println("Stok Keladi     : "+keladi);
    System.out.println("Stok Alocasia   : "+alocasia);
    System.out.println("Stok Mawar      : "+mawar);
  }
  //data royal garden4
  public static void royalGarden4(){
    int aglonema = royalGarden[3][0];
    int keladi = royalGarden[3][1];
    int alocasia = royalGarden[3][2];
    int mawar = royalGarden[3][3];

    //menampilkannya
    System.out.println("\n--STOK BUNGA DI ROYAL GARDEN 4--");
    System.out.println("Stok Aglonema   : "+aglonema);
    System.out.println("Stok Keladi     : "+keladi);
    System.out.println("Stok Alocasia   : "+alocasia);
    System.out.println("Stok Mawar      : "+mawar);
  }
  //stok bunga di seluruh cabang
  public static void totalStok(){
        int aglonema = royalGarden[0][0] + royalGarden[0][1] + royalGarden[0][2] + royalGarden[0][3];
        int keladi =  royalGarden[1][0] + royalGarden[1][1] + royalGarden[1][2] + royalGarden[1][3];
        int alocasia =  royalGarden[2][0] + royalGarden[2][1] + royalGarden[2][2] + royalGarden[2][3];
        int mawar =   royalGarden[3][0] + royalGarden[3][1] + royalGarden[3][2] + royalGarden[3][3];

        //menampilkan
        System.out.println("Stok Aglonema   : "+aglonema);
        System.out.println("Stok Keladi     : "+keladi);
        System.out.println("Stok Alocasia   : "+alocasia);
        System.out.println("Stok Mawar      : "+mawar);
  }
    public static void main(String[] args) {
      royalGarden1();
      royalGarden2();
      royalGarden3();
      royalGarden4();

      System.out.println("\n=============================\n");
      System.out.println("TOTAL STOK SETIAP BUNGA SEMUA CABANG");
      totalStok();
    }
}
