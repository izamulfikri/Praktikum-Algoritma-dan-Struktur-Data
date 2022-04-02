package minggu7;

// Mohammad Izamul FIkri Fahmi  

public class PencarianMhs {
    Mahasiswa listMHs[];
    int idx;

    
    void tambah(Mahasiswa m){
        if(idx < listMHs.length){
        listMHs[idx] = m;
        idx++;
        }else{
        System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMHs){
            m.tampil();;
            System.out.println("----------------------------");
        }
    }

    // mengubah int cari menjadi String cari untuk tugas nomor 2

    public int FindSeqSearch(String cari){ 
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++){
            // modifikasi keperluan tugas nomor 2
            if(listMHs[j].nama.equals(cari)){   // mengganti if(listMHs[j].nim==cari) menjadi if(listMHs[j].nama.equals(cari)
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos){
        if(pos!=-1){
            System.out.println("data\t : " + x + " ditemukan pada indeks "+ pos);
        } else {
            System.out.println("data\t : " + x + "tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : " +listMHs[pos].nim);
            System.out.println("Nama\t : "+listMHs[pos].nama);
            System.out.println("Umur\t : "+listMHs[pos].umur);
            System.out.println("IPK\t : "+listMHs[pos].ipk);
        } else {
            System.out.println("data "+ x + " tidak ditemukan");
        }
    }

    // menambahkan metode sorting dengan selection sort descending
    public void selectionSort(){
        for (int i=0; i<listMHs.length; i++){
            int idxMin = i;
            for (int j=i+1; j < listMHs.length; j++){
                if (listMHs[j].nim > listMHs[idxMin].nim){
                    idxMin = j;
                }
            }
            //swap proses
            Mahasiswa tmp = listMHs[idxMin];
            listMHs[idxMin] = listMHs[i];
            listMHs[i] = tmp;
        }
    }

    // Dijadikan komentar karena untuk keperluan tugas soal nomor 2, yang hanya meminta penggunaan sequential search

    // modifikasi penambahan percobaan 6.3 Binary Search
    // public int FindBinarySearch(int cari, int left, int right){
    //     int mid;
    //     if ( right >= left){
    //         mid = (left + right) / 2;
    //         if (cari == listMHs[mid].nim){
    //             return (mid);
    //         } else if (listMHs[mid].nim < cari){ // perubahan untuk soal nomor 4 percobaan 2
    //             return FindBinarySearch(cari, left, mid-1); 
    //         } else {
    //             return FindBinarySearch(cari, mid+1, right);
    //         }
    //     }
    //     return -1;
    // }
}


