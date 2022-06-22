package Source_Code;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if(nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    // Nomor 3
    void ascSort() {
        this.mahasiswas.sort((Mahasiswa a1, Mahasiswa a2) -> a1.nama.compareTo(a2.nama));
    }
    void dscSort() {
        this.mahasiswas.sort((Mahasiswa a1, Mahasiswa a2) -> a2.nama.compareTo(a1.nama));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa 
        lm.tampil();
        // update mahasiswa
        // lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        // System.out.println("");
        // lm.tampil();

        Mahasiswa key = new Mahasiswa("201235", null, null);
        lm.update(Collections.binarySearch(lm.mahasiswas, key, new MhsComparator()), new Mahasiswa("201235","Akhleema","021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\n---- Soal Nomor 3 ----\n");

        System.out.println("Ascending : ");
        lm.ascSort();
        lm.tampil();

        System.out.println("");
        System.out.println("Descending : ");
        lm.dscSort();
        lm.tampil();
    }
}