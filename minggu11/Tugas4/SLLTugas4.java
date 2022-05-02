package Tugas4;
public class SLLTugas4 {
    
    NodeTugas4 head;
    NodeTugas4 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if(!isEmpty()) {
            NodeTugas4 tmp = head;
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

    public void antrianDepan() {
        if(!isEmpty()) {
            NodeTugas4 tmp = head;
            System.out.println("- Antrian Terdepan -");
            System.out.println("nim   : " + tmp.nim);
            System.out.println("nama  : " + tmp.nama);
            System.out.println("absen : " + tmp.absen);
            System.out.println("ipk   : " + tmp.ipk);
        } else {
            System.out.println("Antrian Terdepan Masih Kosong");
        }
    }

    public void antrianBelakang() {
        if(!isEmpty()) {
            NodeTugas4 tmp = head;
            while (tmp!=null) {
                if(tmp==tail){
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

    public void tambahData(String nim, String nama, int absen, double ipk) {
        NodeTugas4 ndInput = new NodeTugas4(nim, nama, absen, ipk, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        System.out.println("Data berhasil ditambahkan");
    }

    public void cariIndex(int idx) {
        if(isEmpty()) {
            System.out.println("List masih kosong");
        } else {
            NodeTugas4 tmp = head;
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

    public void cariNim(String key) {
        NodeTugas4 tmp = head;
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

        public void remove() {
            if (isEmpty()) {
                System.out.println("List masih kosong, tidak ada data yang dapat dihapus");
            } else if (head == tail) {
                head = tail = null;
                System.out.println("Berhasil Dihapus");
            } else {
                NodeTugas4 temp = head;
                while(temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                System.out.println("Berhasil Dihapus");
            }
        }
    
}
