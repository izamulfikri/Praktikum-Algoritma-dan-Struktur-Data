public class Pacman {
    int pil;
    
    Pacman (int a){
        pil = a;
        System.out.println("Energi default sebesar: " + pil + " diberikan kepada ");
    }
    
    
    
    void makanPil(int n){
        pil += n;
        System.out.println("Energi yang diperoleh Pacman: " + pil);
    }
}
