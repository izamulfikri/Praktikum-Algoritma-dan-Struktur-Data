import java.util.Scanner;
/**
 * @author Mohammad Izamul Fikri Fahmi
 */
public class ZamLatihan {
    public Scanner sc = new Scanner(System.in);
    public int jSuara;
    public int[] arrSuara = new int[999];
    public String nmKandidat[] = new String[999];
    public String kandidat[] = new String[999];

    void inputNama(){
        for(int i=0; i < jSuara; i++){

            System.out.print("Suara ke-"+(i+1)+" Memilih kandidat bernama : ");
            nmKandidat[i] = sc.nextLine();
                
                    for(int j = 0; j <jSuara; j++){
                    if(nmKandidat[i]!=kandidat[j]&&kandidat[j]==null){
                    kandidat[j] = nmKandidat[i];
                    break;
            }
            }
            

        }
    }

    void cekNama(){
        for(int i=0; i < jSuara; i++){
            arrSuara[i] = 1;
            for(int j = i+1; j < jSuara; j++){
                if(kandidat[i].equalsIgnoreCase(nmKandidat[j])){
                    arrSuara[i] += 1;
                }
            }
        } 
    }

    int cekMenang(){
        int mayoritas = jSuara/2+1;
        for(int i=0;i<jSuara;i++){
            if(mayoritas==arrSuara[i]){
                System.out.println("Jumlah Suara Mayoritas-"+mayoritas+"\nDimenangkan oleh : "+kandidat[i]);
            return 0;
            } else {
                System.out.println("Tidak ada pemenang suara mayoritas");
                return arrSuara[i];
            }
        }
        return 0;
    }
    
}
