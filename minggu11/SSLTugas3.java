public class SSLTugas3 {
    NodeTugas3 head;
    NodeTugas3 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeTugas3 tmp = head;
            System.out.println("");
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            NodeTugas3 tmp = head;

            System.out.println("Isi Stack Teratas = " + tmp.data);

        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void pushFirst(String input) {
        NodeTugas3 ndInput = new NodeTugas3(input, null);
        if (isEmpty()) {//jika linked list kosong
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
}
