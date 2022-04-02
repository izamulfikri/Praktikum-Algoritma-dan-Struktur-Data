package minggu7;

// Mohammad Izamul FIkri Fahmi

public class Latihan3Main {
    public static void main(String[] args) {
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Latihan3 arr = new Latihan3(data);

        System.out.println("=== Data Array 1 Dimensi ===");
        arr.tampil();
        arr.bubblesort();
        System.out.println("\n=== Data Array 1 Dimensi Setelah Sorting ===");
        arr.tampil();
        arr.nilaiTerbesar();
        arr.tampilPosisi();
    }
}
