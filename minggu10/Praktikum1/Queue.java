package Praktikum1;
/* 
@author izamul fikri
*/
class Queue {

    int[] data;
    int front;
    int rear;
    int size;
    int max;
    
    public Queue(int n) {
        max = n;
        data = new int[max];
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
    
    public void  peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear - -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }


    public int Enqueue(int dt) { // merubah yang semula void menajadi int untuk kondisi penghentian program soal no 7
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            return 1; // untuk menghentikan program ketika mendapat kondisi overflow
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
        data[rear] = dt;
        size++;
        }
        return 0;
    }

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            return 0; // untuk menghentikan progra ketika mendapat kondisi underflow
        } else {
            dt = data[front];
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
        return dt;
    }

    // untuk menampilkan posisi indek suatu data
    public void peekPosition(int dt) {
        if (IsEmpty()) {
            System.out.println("Data Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                if (data[i]==dt) {
                    System.out.println("Data berada di indeks : "+i);
                }
                i = (i + 1) % max;
            }
            if (data[i] == dt) {
                System.out.println("Data berada di indeks : "+i);
            } else {
                System.out.println("Data tidak ada  ");
            }
        }
    }

    // untuk mengetahui suatu data denga indeks
    public void peekAt(int position) {
        if (IsEmpty()){
            System.out.println("Data masih kosong");
        } else {
            int i = front;
            if(i==position) {
                System.out.println(data[i] + " pada indeks : " + i);
                return;
            }
            while (i != rear) {
                if (i==position){
                    System.out.println(data[i] + " pada indeks : " + i);
                    return;
                }
                i = (i + 1) % max;
            }
            if (i == position){
                System.out.println(data[i] + " pada indeks : " + i);
                return;
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }


}

