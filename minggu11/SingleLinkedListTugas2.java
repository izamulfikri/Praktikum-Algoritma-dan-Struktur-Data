public class SingleLinkedListTugas2 {

    NodeTugas2 head; // posisi awal linked list
    NodeTugas2 tail; // posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeTugas2 tmp = head;
            System.out.print("Isi Linked List :\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            } 
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(char input) {
        NodeTugas2 ndInput = new NodeTugas2(input, null);
        if(isEmpty()) { // jika linked list kosong
            head = ndInput; //head dan tail sama dengan nodeTugas2 input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(char input) {
        NodeTugas2 ndInput = new NodeTugas2(input, null);
        if (isEmpty()) {
            head = ndInput; // head dan tail sama dengan nodeTugas2 input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(char key, char input) {
        NodeTugas2 ndInput = new NodeTugas2(input, null);
        NodeTugas2 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next==null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(char key, char input) {
        NodeTugas2 ndInput = new NodeTugas2(input, null);
        NodeTugas2 temp = head;
        while (temp != null) {
            if ((temp.data == key) && (temp == head)) {
                this.addFirst(input);
                System.out.println("Berhasil menambahkan data");
                // maksudnya jika insert dilakukan pada awal linked list maka akan dipanggila method addfirst
                break;
            } else if (temp.next.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                System.out.println("Berhasil menambahkan data");
                break;
            }
            temp = temp.next;
        }
    }
    
    public void inserAt(int index, char input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeTugas2 temp = head;
            for (int i = 0; i < index -1 ; i++) {
                temp = temp.next;
            }
            temp.next = new NodeTugas2(input, temp.next);
            if(temp.next.next==null) tail = temp.next;
        }
    }

    public int getData(int index) {
        NodeTugas2 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(char key) {
        NodeTugas2 tmp = head;
        int index = 0;
        while (tmp!=null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Masing kosong tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeTugas2 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(char key) {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong, tidak dapat dihapus");
        } else {
            NodeTugas2 temp = head;
            while (temp != null) {
                if ((temp.data == key) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeTugas2 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
