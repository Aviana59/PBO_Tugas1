/**
 * Kelas Waktu memodelkan contoh waktu dengan detik, menit dan jam.
 * Kelas ini tidak melakukan validasi input detik, menit dan jam.
 */
public class Time {
   // Variabel instance privat
   private int detik, menit, jam;

   // Konstruktor (kelebihan beban)
   /**
    * Membuat instance Waktu dengan detik, menit, dan jam tertentu. Tidak ada
    * validasi masukan
    */
   public Time(int detik, int menit, int jam) {
      this.detik = detik;
      this.menit = menit;
      this.jam = jam;
   }

   /** Membuat instance Time dengan nilai default */
   public Time() { // konstruktor default
      this.detik = 0;
      this.menit = 0;
      this.jam = 0;
   }

   // Pengambil/penyetel publik untuk variabel privat.
   /** Mengembalikan detik */
   public int getDetik() {
      return this.detik;
   }

   /** Mengembalikan menit */
   public int getMenit() {
      return this.menit;
   }

   /** Mengembalikan jam */
   public int getJam() {
      return this.jam;
   }

   /** Mengatur detik. Tidak ada validasi masukan */
   public void setDetik(int detik) {
      this.detik = detik;
   }

   /** Mengatur menit. Tidak ada validasi masukan */
   public void setMenit(int menit) {
      this.menit = menit;
   }

   /** Mengatur jam. Tidak ada validasi masukan */
   public void setJam(int jam) {
      this.jam = jam;
   }

   /**
    * Mengembalikan string deskriptif dalam bentuk "hh:mm:ss" dengan angka nol di
    * depannya
    */
   public String toString() {
      // Gunakan fungsi bawaan String.format() untuk membentuk String yang diformat
      return String.format("%02d:%02d:%02d", jam, menit, detik);
      // Tentukan "0" untuk mencetak angka nol di depan, jika tersedia.
   }

   /** Menyetel detik, menit, dan jam ke nilai yang ditentukan */
   public void setTime(int detik, int menit, int jam) {
      // Tidak ada validasi masukan
      this.detik = detik;
      this.menit = menit;
      this.jam = jam;
   }

   /**
    * Memajukan instance Time ini satu detik, dan mengembalikan instance ini untuk
    * mendukung rangkaian
    */
   public Time nextDetik() {
      ++detik;
      if (detik >= 60) {
         detik = 0;
         ++menit;
         if (menit >= 60) {
            menit = 0;
            ++jam;
            if (jam >= 24) {
               jam = 0;
            }
         }
      }
      return this; // Kembalikan instance "ini", untuk mendukung operasi rangkaian
      // misal, t1.nextdetik().nextdetik()
   }
}