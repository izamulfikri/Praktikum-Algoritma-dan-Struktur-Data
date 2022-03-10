public class Kuman {
    int powerKuman;
    
    Kuman (int power){
        powerKuman=power;
    }
    
    void makanPacman(int p){
       
        powerKuman += p;
        System.out.println("\nKekuatan kuman bertambah sebesar: "+powerKuman );
        
    }
}