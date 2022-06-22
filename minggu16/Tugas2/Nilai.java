package Tugas2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Nilai {
    String kdNil;
    double nilai;
    Mahasiswa mhs;
    MataKuliah mk;
    
    public Nilai(String kdNil, double nilai, Mahasiswa mhs, MataKuliah mk){
        this.kdNil = kdNil;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
    

    // Untuk Method
    List<Mahasiswa> mhss = new ArrayList<>();
    List<MataKuliah> mks = new ArrayList<>();
    
    public void tambahMhs(Mahasiswa... Mahasiswa){
        mhss.addAll(Arrays.asList(Mahasiswa));
    }
    
    public void tambahMatkul(MataKuliah... matkul){
        mks.addAll(Arrays.asList(matkul));
    }
    
    public void tampilMhs(){
        mhss.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
        });
    }
    
    public void tampilMatkul(){
        mks.stream().forEach(mk -> {
                System.out.println("" + mk.toString());
        });
    }
    
    int lSearchMhs(String nim){
            for(int i = 0; i < mhss.size(); i++){ 
                if(nim.equals(mhss.get(i).nim)){
                    return i;
                }
            }
            return -1;
    }
    
    int lSearchMatkul(String matkul){
            for(int i = 0; i < mks.size(); i++){ 
                if(matkul.equals(mks.get(i).kode)){
                    return i;
                }
            }
            return -1;
    }
    
    Mahasiswa cariMhs(String nim){
        for(int i = 0; i < mhss.size(); i++){
            if(nim.equals(mhss.get(i).nim)){
                return mhss.get(i);
            }
        }
        return null;
    }
    
    MataKuliah cariMatkul(String matkul){
        for(int i = 0; i < mks.size(); i++){
            if(matkul.equals(mks.get(i).kode)){
                return mks.get(i);
            }
        }
        return null;
    }
    
    public String toString(int idx1, int idx2){
        return mhss.get(idx1).nim + "\t" + mhss.get(idx1).nama + "\t" + mks.get(idx2).matkul + "\t" + mks.get(idx2).sks + "\t";
    }
    
    static Comparator<Nilai> CompNilai = (n1, n2) ->{
        if(n1.nilai < n2.nilai){
            return -1;
        } else if (n1.nilai > (n2).nilai){
            return 1;
        } else {
            return 0;
        }
    };
    



    // Main



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        List<Nilai> nil = new ArrayList<>();
        Nilai n = new Nilai("", 0, null, null);
        
        Mahasiswa m1 = new Mahasiswa("20001", "Sanji", "021xxx");
        Mahasiswa m2 = new Mahasiswa("20002", "Zoro", "021xxx");
        Mahasiswa m3 = new Mahasiswa("20003", "Luffy", "021xxx");
        Mahasiswa m4 = new Mahasiswa("20004", "Ace", "021xxx");
        Mahasiswa m5 = new Mahasiswa("20005", "Brook", "021xxx");
        Mahasiswa m6 = new Mahasiswa("20006", "Nami", "021xxx");
        
        n.tambahMhs(m1, m2, m3, m4, m5, m6);
        
        MataKuliah mk1 = new MataKuliah("00001", "Internet of Things\t\t", 3);
        MataKuliah mk2 = new MataKuliah("00002", "Algoritma dan Struktur Data\t", 3);
        MataKuliah mk3 = new MataKuliah("00003", "Algoritma dan Pemrograman\t", 3);
        MataKuliah mk4 = new MataKuliah("00004", "Pratikum Algoritma dan Struktur Data", 3);
        MataKuliah mk5 = new MataKuliah("00005", "Pratikum Algoritma dan Pemrograman", 3);
        
        n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);
        
        Nilai n1 = null;
        String nimMhs, mkMhs;
        
        int pil = 0;
        do{
            System.out.println("+*********************************************************************+");
            System.out.println("|           SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER           |");
            System.out.println("+*********************************************************************+");
            System.out.println("| 1. Input Nilai");
            System.out.println("| 2. Tampil Nilai");
            System.out.println("| 3. Mencari Nilai Mahasiwa");
            System.out.println("| 4. Urut Data Nilai");
            System.out.println("| 5. Keluar"); 
            System.out.println("+*********************************************************************+");
            System.out.print("Pilih : ");
            pil = sc.nextInt();
            System.out.println("");
            
            switch(pil){
                case 1:
                    System.out.print("Kode\t : ");
                    String kd = in.nextLine();
                    System.out.print("Nilai\t : ");
                    double nilMhs = sc.nextDouble();
                    System.out.println("");
                    
                    System.out.println("+*********************************************************************+");
                    System.out.println("|                          DAFTAR MAHASISWA                           |");
                    System.out.println("+*********************************************************************+");
                    System.out.println("NIM\tNama\tTelf");
                    n.tampilMhs();
                    System.out.print("Pilih Mahasiswa by NIM :");
                    nimMhs = in.nextLine();
                    Mahasiswa MahaSiswa;
                    MahaSiswa = n.cariMhs(nimMhs);
                    
                    System.out.println("");
                    System.out.println("+*********************************************************************+");
                    System.out.println("|                         DAFTAR MATA KULIAH                          |");
                    System.out.println("+*********************************************************************+");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    n.tampilMatkul();
                    System.out.print("Pilih MK by kode : ");
                    mkMhs = in.nextLine();
                    MataKuliah mks;
                    mks = n.cariMatkul(mkMhs);
                    
                    n1 = new Nilai(kd, nilMhs, MahaSiswa, mks);
                    nil.add(n1);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("+*********************************************************************+");
                    System.out.println("|                       DAFTAR NILAI MAHASISWA                        |");
                    System.out.println("+*********************************************************************+");
                    System.out.println("NIM\tNama\tMata Kuliah\t\t\t\tSKS\tNilai");
                    for (int i = 0; i < nil.size(); i++){
                        n.lSearchMhs(nil.get(i).mhs.nim);
                        n.lSearchMatkul(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.lSearchMhs(nil.get(i).mhs.nim), n.lSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                case 3: 
                    System.out.println("+*********************************************************************+");
                    System.out.println("|                       DAFTAR NILAI MAHASISWA                        |");
                    System.out.println("+*********************************************************************+");
                    System.out.println("NIM\tNama\tMata Kuliah\t\t\t\tSKS\tNilai");
                    int sks = 0;
                    for (int i = 0; i < nil.size(); i++){
                        n.lSearchMhs(nil.get(i).mhs.nim);
                        n.lSearchMatkul(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.lSearchMhs(nil.get(i).mhs.nim), n.lSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                    }
                    System.out.print("Masukkan Data Mahasiswa[NIM] : ");
                    String input = in.nextLine();
                    System.out.println("");
                    for (int i = 0; i < nil.size(); i++){
                        if(input.equalsIgnoreCase(nil.get(i).mhs.nim)){
                            sks += n.mks.get(i).sks;
                            n.lSearchMhs(nil.get(i).mhs.nim);
                            n.lSearchMatkul(nil.get(i).mk.kode);
                            System.out.println(n.toString(n.lSearchMhs(nil.get(i).mhs.nim), n.lSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                        }
                    }
                    System.out.println("Total SKS " + sks + " Telah Diambil");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("+*********************************************************************+");
                    System.out.println("|                          DAFTAR MAHASISWA                           |");
                    System.out.println("+*********************************************************************+");
                    System.out.println("NIM\tNama\tMata Kuliah\t\t\t\tSKS\tNilai");
                    nil.sort(CompNilai);
                    for (int i = 0; i < nil.size(); i++){
                        n.lSearchMhs(nil.get(i).mhs.nim);
                        n.lSearchMatkul(nil.get(i).mk.kode);
                        System.out.println(n.toString(n.lSearchMhs(nil.get(i).mhs.nim), n.lSearchMatkul(nil.get(i).mk.kode)) + nil.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                case 5: 
                    System.out.println("+*********************************************************************+");
                    System.out.println("|                           T H A N K - Y O U                         |");
                    System.out.println("+*********************************************************************+");
                    break;    
            }
        } while (pil < 5 && pil > 0);
    }
}