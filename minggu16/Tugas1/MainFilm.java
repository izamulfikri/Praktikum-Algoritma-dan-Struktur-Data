package Tugas1;
import java.util.Scanner;
import java.util.Stack;

public class MainFilm{
    static void menu() {
        System.out.println("+======================================+");
        System.out.println("+ Data Film Layar Lebar Izamul FIkri   +");
        System.out.println("+======================================+");
        System.out.println("|1. Input Judul Film");
        System.out.println("|2. Hapus Data Film Teratas");
        System.out.println("|3. Cek Judul Film Teratas");
        System.out.println("|4. Info Semua Judul Film");
        System.out.println("|5. Tutup Program");
        System.out.println("+======================================+");
        System.out.print("|Pilih Menu : ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner a = new Scanner(System.in);

        Stack <Film> films = new Stack();

        char opsi;
        int pilih;

        do{
            menu();
            pilih = a.nextInt();
            switch(pilih) {
                case 1:
                    do{
                        System.out.println("+-------------------------------------------------+");
                        System.out.println("+               Menambahkan Data Film             +");
                        System.out.println("+-------------------------------------------------+");
                        System.out.print("ID Film \t: ");
                        int id = sc.nextInt();
                        System.out.print("Judul Film \t: ");
                        String judul = in.nextLine();
                        sc.nextLine();
                        System.out.print("Tahun Tayang \t: ");
                        int tahun = sc.nextInt();
                        System.out.print("Director \t: ");
                        String director = in.nextLine();

                        Film f = new Film(id, judul, tahun, director);
                        films.push(f);

                        System.out.println("Menambah Data Lagi ketik 'Y/y'");
                        opsi = sc.next().charAt(0);
                        System.out.println("");                        
                    } while (opsi =='y' || opsi  == 'Y');
                break;

                case 2:
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("+           Menghapus Data Film Teratas           +");
                    System.out.println("+-------------------------------------------------+");
                    System.out.println(films.pop());
                    System.out.println("");
                break;

                case 3:
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("+              Judul Film Teratas                 +");
                    System.out.println("+-------------------------------------------------+");
                    System.out.println(films.peek());
                    System.out.println("");
                break;
                
                case 4:
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("+                 Semua Data Film                 +");
                    System.out.println("+-------------------------------------------------+");
                for(int i=0; i<films.size(); i++){
                    System.out.println(films.get(i));
                    }
                    System.out.println("");
                break;

                case 5:
                    System.out.println("");
                    System.out.println("Terimakasih.......");
                break;
            }
        }while(pilih < 5 && pilih > 0);
    }
}