package jobsheet;

public class DaftarTiket {
    

    Tiket tk[] = new Tiket[6];
    int tik;

    // method tambah
    void tambah(Tiket mskp){
        if(tik<tk.length){
            tk[tik]=mskp;
            tik++;
        } else{
            System.out.println("data sudah penuh!!");
        }
    }

    //method tampil
    void tampil(){
        for (Tiket mskp : tk){
            mskp.tampil();
        }
    }

    //method bubblesort
    void bubbleSort(){
        for (int i = 0; i < tk.length; i++){
            for (int j = 1; j < tk.length; j++){
                if (tk[j].harga < tk[j-1].harga){
                    //proses swap
                    Tiket tmp = tk[j];
                    tk[j] = tk[j-1];
                    tk[j-1] = tmp;
                }
            }
        }
    }

    //method selectionsort
    void selecionSort(){
        for (int i = 0; i < tk.length; i++){
        int idxMin = i;

        for (int j = i + 1; j < tk.length; j++) {
            if (tk[j].harga < tk[idxMin].harga) {
                idxMin = j;
            }

            // swap
            Tiket zam = tk[idxMin];
            tk[idxMin] = tk[i];
            tk[i] = zam;
        }       
    }
    }
}
