package Tugas1;

public class VaksinDLL {
    
    Vaksin head;
    int size;
    
    public VaksinDLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambah(int no, String nama) {
        if(isEmpty()) {
            head = new Vaksin(null, no, nama, null);
        } else {
        Vaksin current = head;
        while (current.next != null) {
            current = current.next;
        }
        Vaksin newNode = new Vaksin(current, no, nama, null);
        current.next = newNode;
        }
        size++;
    }

    public void hapus() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Masih Kosong");
        } else {
            System.out.println(head.nama + " telah selesai vaksinasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Vaksin tmp = head;
            System.out.println("|No.\t|Nama\t|");
            while (tmp != null) {
                System.out.println("|"+tmp.antrian+"\t|"+tmp.nama+"\t|");
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : "+size);
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }
}
