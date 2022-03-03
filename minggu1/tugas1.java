package pertemuan1;
//Nama : Mohammad Izamul Fikri Fahmi
//Kelas : 1F
//Absen : 17
//NIM : 2141720171
public class tugas1 {
    static int[] customer = {4,15,6,11};
    static int total;

    //menghitung masing masing
    public static int menghiitungbagian(int j){
        int hitung = customer[j] * 4500;
        if(customer[j]>10){
            hitung -= hitung * 0.05;
        }
        return hitung;
    }

    public static void main(String[] args) {
        System.out.println("*--PRROGRAM MENGHITUNG PENDAPATAN SMILE LAUNDRY--*");
        System.out.println("===================================");
        for (int i = 0;i<customer.length;i++){
            if(i==0){
                System.out.println("Biaya Ani            : Rp."+menghiitungbagian(i));
                total+=menghiitungbagian(i);
            } else if (i==1){
                System.out.println("Biaya Budi           : Rp."+menghiitungbagian(i));
                total+=menghiitungbagian(i);
            } else if (i==2){   
                System.out.println("Biaya Bina           : Rp."+menghiitungbagian(i));
                total+=menghiitungbagian(i);
            } else {
                System.out.println("Biaya Cita           : Rp."+menghiitungbagian(i));
                total+=menghiitungbagian(i);    
            }
        }
        System.out.println("_________________________________");
        System.out.printf("Total Pendapatan     : Rp.%d",total);

    }
}
