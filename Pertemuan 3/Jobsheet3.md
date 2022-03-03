# Jobsheet 3 - Array of Objects
### Nama : Mohammad Izamul Fikri Fahmi
### Kelas : 1F-TI
### NIM : 2141720171
### Absen : 17
<hr>

#### 3.1 Tujuan Praktikum
Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Memahami dan menjelaskan fungsi array yang berisikan variabel objek.
2. Mahasiswa mampu menangkap logika tentang permasalahan array of object dalam Java
3. Mahasiswa mampu menerapkan pembuatan array of object dalam Java
#### 3.2 Membuat Array dari Object, Mengisi dan Menampilkan
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array dari object,
kemudian mengisi dan menampilkan array tersebut.
#### 3.2.1 Langkah-langkah Percobaan
1. Buat Project baru, dengan nama “ArrayObjects”. Buat package dengan nama minggu3.
2. Buat class PersegiPanjang:
<img src="img/3211.png">
3. Pada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi 3
elemen:
<img src="img/3212.png">
4. Kemudian isikan masing-masing atributnya:
<img src="img/3213.png">
5. Cetak ke layar semua atribut dari objek ppArray:
<img src="img/3214.png">
6. Jalankan dan amati hasilnya.

##### Kode program class PersergiPanjang
```java
public class PersegiPanjang {
    public int panjang;
    public int lebar;
}
```
##### Kode program ArrayofObjects
```java
public class ArrayofObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 120;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        //menampilkan
        System.out.println("Persegi Panjang ke-0, Panjang : "+ppArray[0].panjang+", Lebar : "+ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, Panjang : "+ppArray[1].panjang+", Lebar  : "+ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, Panjang : "+ppArray[2].panjang+", Lebar : "+ppArray[2].lebar);
    }
}
```
##### Hasil Run
<img src="img/3215.png">

#### 3.2.2 Verifikasi Hasil Percobaan
<img src="img/322.png">

##### Jawab : Sudah Sesuai.

#### 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!
##### Jawab : tidak, karena pada uji coba 3.2 hanya dilakukan penyimpanan data pada atribut yang ada di PersegiPanjang, dan di ArrayofObjects hanya ditampilkan saja.
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :
<img src="img/3231.png">

##### Jawab : tidak, karena seperti itulah cara instansiasi array of object, dan kalo cuma ditulis seperti nama class, maka akan error.
3. Apa yang dimaksud dengan kode berikut ini:
<img src="img/3232.png">

##### Jawab : Terjadi proses instansiasi array of object juga pemberian value ada berapa elemen dari array yang dibuat
4. Apa yang dimaksud dengan kode berikut ini:
<img src="img/3233.png">

##### Jawab : instansiasi object array indeks ke 1 dari class PersegiPanjang, dilanjutkan dengan pemberian nilai pada variabel dengan mengakses atribut dari class PersegiPanjang yang telah dibuat.
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

##### Jawab : Untuk mempermudah pemahaman, dan penulisan program jadi lebih rapi. walau sebenarnya class ArrayofObjects bisa ditulis dalam class PersegiPanjang dibawah atribut.

#### 3.3 Menerima Input Isian Array Menggunakan Looping
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat
menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang
ada di ppArray.
#### 3.3.1 Langkah-langkah Percobaan
1. Import scanner pada class ArrayObjects.
<img src="img/3311.png">
Note: Letakkan kode import dibawah kode package.
2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek
Scanner untuk menerima input, kemudian melakukan looping untuk menerima input:
<img src="img/3312.png">
3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping
untuk mengakses isi array ppArray dan menampilkannya ke layar:
<img src="img/3313.png">
4. Jalankan dan amati hasilnya.
