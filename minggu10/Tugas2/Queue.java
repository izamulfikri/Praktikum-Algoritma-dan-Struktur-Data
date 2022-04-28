package Tugas2;

public class Queue {
    Mahasiswa[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Mahasiswa antri) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;          
                } else {
                rear++;
                }
        }
        antrian[rear] = antri;
        size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa antri = new Mahasiswa();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            antri = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("Data Mahasiswa Kosong");
        } else {
            System.out.println("nim   : " + antrian[front].nim);
            System.out.println("nama  : " + antrian[front].nama);
            System.out.println("absen : " + antrian[front].absen);
            System.out.println("ipk   : " + antrian[front].ipk);
        }
    }

    public void peekRear() {
        if (IsEmpty()) {
            System.out.println("Data Mahasiswa Kosong");
        } else {
            System.out.println("nim   : " + antrian[rear].nim);
            System.out.println("nama  : " + antrian[rear].nama);
            System.out.println("absen : " + antrian[rear].absen);
            System.out.println("ipk   : " + antrian[rear].ipk);
        }
    }

    public void peekPosition(String nm) {
        if (IsEmpty()) {
            System.out.println("Data Masih Kosong");
        } else {
            int i = front;
            if (antrian[i].nim.equals(nm)) {
                System.out.println("Data berada di indeks : "+i);
                return;
            }
            while (i != rear) {
                if (antrian[i].nim.equals(nm)) {
                    System.out.println("Data berada di indeks : "+i);
                    return;
                }
                i = (i + 1) % max;
            }
            if (antrian[i].nim.equals(nm)) {
                System.out.println("Data berada di indeks : "+i);
            } else {
                System.out.println("Data tidak ada  ");
            }
        }
    }

    public void printMahasiswa(int posisi) {
        if (IsEmpty()){
            System.out.println("Data masih kosong");
        } else {
            int i = front;
            if(i == posisi) {
            System.out.println("nim   : " + antrian[i].nim);
            System.out.println("nama  : " + antrian[i].nama);
            System.out.println("absen : " + antrian[i].absen);
            System.out.println("ipk   : " + antrian[i].ipk);
                return;
            }
            while (i != rear) {
                if (i == posisi){
            System.out.println("nim   : " + antrian[i].nim);
            System.out.println("nama  : " + antrian[i].nama);
            System.out.println("absen : " + antrian[i].absen);
            System.out.println("ipk   : " + antrian[i].ipk);
                    return;
                }
                i = (i + 1) % max;
            }
            if (i == posisi){
            System.out.println("nim   : " + antrian[i].nim);
            System.out.println("nama  : " + antrian[i].nama);
            System.out.println("absen : " + antrian[i].absen);
            System.out.println("ipk   : " + antrian[i].ipk);
                return;
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
}
