public class Latihan1Main {
    public static void main(String[] args) {
        //barang di bawah 50000
        Latihan1 b1 = new Latihan1();
        b1.nama = "kaos";
        b1.hargaSatuan = 40000;
        b1.jumlah = 10;
        System.out.println("=== harga <50000 ===");
        System.out.println("Harga total "+b1.nama+" = Rp"+b1.hitungHargaTotal());
        System.out.println("Diskon PerBarang = Rp"+b1.hitungDiskon());
        System.out.println("Harga bersih     = Rp"+b1.hitungHargaBayar());
        
        //barang di harga 50000-100000
        Latihan1 b2 = new Latihan1();
        b2.nama = "Celana";
        b2.hargaSatuan = 70000;
        b2.jumlah = 5;
        System.out.println("\n=== harga 50000-100000 ===");
        System.out.println("Harga total "+b2.nama+" = Rp"+b2.hitungHargaTotal());
        System.out.println("Diskon PerBarang = Rp"+b2.hitungDiskon());
        System.out.println("Harga bersih     = Rp"+b2.hitungHargaBayar());
   
        //barang di harga >100000
        Latihan1 b3 = new Latihan1();
        b3.nama = "Hoodie";
        b3.hargaSatuan = 200000;
        b3.jumlah = 4;
        System.out.println("\n=== harga >100000 ===");
        System.out.println("Harga total "+b3.nama+" = Rp"+b3.hitungHargaTotal());
        System.out.println("Diskon PerBarang = Rp"+b3.hitungDiskon());
        System.out.println("Harga bersih     = Rp"+b3.hitungHargaBayar());
    }
}
