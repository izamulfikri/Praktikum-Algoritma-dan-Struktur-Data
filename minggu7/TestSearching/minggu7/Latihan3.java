package minggu7;

// Mohammad Izamul FIkri Fahmi  

public class Latihan3 {
        int[] data;
        int max = 0;
        int posisi;
        int jumlah = 0;

        Latihan3(int d[]){
            data = d;
        }

        void tampil(){
            for (int i = 0; i < data.length; i++){
                System.out.print(data[i]+" | ");
            }
        }

        void bubblesort() {
            for (int i = 0; i < data.length - 1; i++) {
                for (int j = 1; j < data.length - i; j++) {
                    if (data[j] < data[j - 1]) {
                        int tmp = data[j];
                        data[j] = data[j - 1];
                        data[j - 1] = tmp;
                    }
                }
            }
        }

        void nilaiTerbesar(){
            for (int i = 0; i < data.length; i++) {
                if (data[i] > max) {
                    max = data[i];
                }
            }
            System.out.println("\nNilai Terbesar : " + max);
        }

        void tampilPosisi() {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == max) {
                    jumlah++;
                }
            }
            System.out.println("Jumlah Nilai Terbesar : " + jumlah);
            posisi = max;
            for (int i = 0; i < data.length; i++) {
                if (posisi == data[i]) {
                    System.out.println("Data ditemukan pada indeks ke-" + i);
                }
            }
        }
}
