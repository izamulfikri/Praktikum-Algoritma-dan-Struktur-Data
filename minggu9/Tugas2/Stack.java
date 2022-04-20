package Tugas2;

public class Stack {
    int size, top;
    Struk data[];

    public Stack(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }

    // mengecek kekosongan atau kepenuhan
    public boolean IsEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        } 
    }

    public boolean IsFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    // end line mengecek kekosongan atau kepenuhan

    public void push (Struk sk) {
        if (!IsFull()) {
            top++;
            data[top] = sk;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            Struk x = data[top];
            top--;
            System.out.println("Struk yang diambil : " + x.no_tx + " " + x.tgl + " " + x.jum + " " + x.total_byr);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print() {
        System.out.println("Isi stack: ");

        System.out.println("--------------------------------------");
        for (int i = top; i >= 0; i--) {
        System.out.println("No Transaksi       : "+data[i].no_tx);
        System.out.println("Tanggal            : "+data[i].tgl);
        System.out.println("Jumlah Barang      : "+data[i].jum);
        System.out.println("Total Bayar        : "+data[i].total_byr);
        System.out.println("--------------------------------------");
        }
        System.out.println("");
    }

}
