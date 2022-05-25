package Tugas2;

public class FilmDLL {

    Film head;
    int size;

    public FilmDLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // tambah data awal
    public void addFirst(int id, String j, float r) {
        if(isEmpty()) {
            head = new Film(null, id, j, r, null);
        } else {
            Film newNode = new Film(null, id, j, r, head);
            head.prev=newNode;
            head = newNode;
        }
        size++;
    }

    // tambah data akhir
    public void addLast(int id, String j, float r) {
        if(isEmpty()) {
            addFirst(id, j, r);
        } else {
            Film current = head;
            while (current.next != null) {
                current = current.next;
            }
            Film newNode = new Film(current, id, j, r, null);
            current.next = newNode;
            size++;
        }
    }

    // tambah data index tertentu
    public void add(int id, String j, float r, int idx) throws Exception {
        if(isEmpty()) {
            addFirst(id, j, r);
        } else if (idx<0||idx>size) {
            throw new Exception("Nilai Indeks Tidak Valid");
        } else {
            Film current = head;
            int i = 0;
            while (i<idx) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Film newNode = new Film(null, id, j, r, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Film newNode = new Film(current.prev, id, j, r, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    // hapus data pertama
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List Film Masih Kosong, Tidak Dapat Dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data Berhasil diHapus");
        }
    }

    // hapus data terakhir
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List Film Masih Kosong Tidak Dapat Dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Data Berhasil diHapus");
            return;
        }
        Film current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        System.out.println("Data Berhasil diHapus");
        size--;
    }

    // hapus data tertentu (disini saya menggunakan indeks)
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Film current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    // cetak
    public void print() {
        if (!isEmpty()) {
            Film tmp = head;
            System.out.println("++++++++++++++");
            System.out.println("| Cetak Data |");
            System.out.println("++++++++++++++");
            while (tmp != null) {
                System.out.println("ID : " + tmp.id);
                System.out.println("  Judul Film : " +tmp.judul);
                System.out.println("  Rating : " +tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("List Film Kosong");
        }
    }

    // cari id film
    public void cariId(int id) throws Exception {
        if(isEmpty()) {
            throw new Exception("List Kosong, Data Tidak Dapat Dicari");
        } else {
            Film current = head;
            int i = 0;
            while (id != current.id && !(i>size)) {
                current = current.next;
                i++;
            }
            if (i > size) {
                System.out.println("Data Tidak Ditemukan");
            } else {
                System.out.println("Data ID FILM  : "+id+" Berada di Node ke-"+i);
                System.out.println("IDENTITAS:");
                System.out.println(" ID Film     : "+current.id);
                System.out.println(" Judul Film  : "+current.judul);
                System.out.println(" IMDB Rating : "+current.rating);
            }
        }
    }

    // urut data rating film-desc
    public void sort(){
        Film current = null;
        Film idx = null;
        int tmpid;
        String tmpjudul;
        float tmprating;

        if(head == null) {
            System.out.println("List Film Kosong");
        } else {
            for(current = head; current.next != null; current = current.next) {
                for(idx = current.next; idx != null; idx = idx.next) {
                    //swap
                    if(current.rating<idx.rating) {
                        tmpid = current.id;
                        current.id = idx.id;
                        idx.id = tmpid;

                        tmpjudul = current.judul;
                        current.judul = idx.judul;
                        idx.judul = tmpjudul;

                        tmprating = current.rating;
                        current.rating = idx.rating;
                        idx.rating = tmprating;
                    }
                }
            }
        }
    }

    // keluar
    public void keluar() {
        System.out.println("Terimakasih Sudah Menggunakan Program Kami ^_^");
    }
}
