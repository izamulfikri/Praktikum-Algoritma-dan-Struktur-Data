package Tugas5;
public class SLLTugas5 {
    
    NodeTugas5 front;
    NodeTugas5 rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        if(!isEmpty()) {
            NodeTugas5 tmp = front;
            int urut = 0;
            System.out.println("List : ");
            while (tmp != null) {
                System.out.println("Mahasiswa ke-"+urut);
                System.out.println("nim   : " + tmp.nim);
                System.out.println("nama  : " + tmp.nama);
                System.out.println("absen : " + tmp.absen);
                System.out.println("ipk   : " + tmp.ipk);
                tmp = tmp.next;
                urut++;
            }
        } else {
            System.out.println("List Masih Kosong");
        }
    }

    public void peek() {
        if(!isEmpty()) {
            NodeTugas5 tmp = front;
            System.out.println("- Antrian Terdepan -");
            System.out.println("nim   : " + tmp.nim);
            System.out.println("nama  : " + tmp.nama);
            System.out.println("absen : " + tmp.absen);
            System.out.println("ipk   : " + tmp.ipk);
        } else {
            System.out.println("Antrian Terdepan Masih Kosong");
        }
    }

    public void peekRear() {
        if(!isEmpty()) {
            NodeTugas5 tmp = front;
            while (tmp!=null) {
                if(tmp==rear){
                    System.out.println("- Antrian Terbelakang -");
                    System.out.println("nim   : " + tmp.nim);
                    System.out.println("nama  : " + tmp.nama);
                    System.out.println("absen : " + tmp.absen);
                    System.out.println("ipk   : " + tmp.ipk);
                }
                tmp = tmp.next;
            } 
        } else {
                System.out.println("Antrian Terbelakang Masih Kosong");
        }
    }

    public void Enqueue(String nim, String nama, int absen, double ipk) {
        NodeTugas5 ndInput = new NodeTugas5(nim, nama, absen, ipk, null);
        if (isEmpty()) {
            front = ndInput;
            rear = ndInput;
        } else {
            rear.next = ndInput;
            rear = ndInput;
        }
        System.out.println("Data berhasil ditambahkan");
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("List Masih kosong tidak dapat dihapus");
        } else if (front == rear){
            front = rear = null;
        } else {
            front = front.next;
            System.out.println("Dequeue Berhasil");
        }
    }

    public void peekAt(int idx) {
        if(isEmpty()) {
            System.out.println("List masih kosong");
        } else {
            NodeTugas5 tmp = front;
            for (int i = 0; i < idx; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada index ke : " + idx);
            System.out.println("nim   : " + tmp.nim);
            System.out.println("nama  : " + tmp.nama);
            System.out.println("absen : " + tmp.absen);
            System.out.println("ipk   : " + tmp.ipk);
        }
    }

    public void peekPosition(String key) {
        NodeTugas5 tmp = front;
        int idx = 0;
        while (tmp != null && (!(tmp.nim.equals(key)))) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) {
            System.out.println("List masih kosong");
        } else {
            System.out.println("Data pada index ke : " + idx);
            System.out.println("nim   : " + tmp.nim);
            System.out.println("nama  : " + tmp.nama);
            System.out.println("absen : " + tmp.absen);
            System.out.println("ipk   : " + tmp.ipk);
        }
    }

        public void clear(int jmlh) {
            if (!isEmpty()) {
                front = rear = null;
                jmlh = 0;
                System.out.println("List berhasil dikosongkan");
            } else {
                System.out.println("List masih kosong");
            }
        }
    
}
