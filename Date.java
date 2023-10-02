/**
 * Kelas Date memodelkan tanggal kalender dengan hari, bulan dan tahun.
 * Kelas ini tidak melakukan validasi input hari, bulan dan tahun.
 */
public class Date {
   // Variabel instan pribadi
   private int tahun, bulan, hari;

   /**
    * Membuat instance Date dengan tahun, bulan, dan hari tertentu. Tidak ada
    * validasi masukan
    */
   public Date(int tahun, int bulan, int hari) {
      this.tahun = tahun;
      this.bulan = bulan;
      this.hari = hari;
   }

   // Pengambil/penyetel publik untuk variabel privat
   /** Mengembalikan tahun */
   public int getTahun() {
      return this.tahun;
   }

   /** Mengembalikan bulan */
   public int getBulan() {
      return this.bulan;
   }

   /** Mengembalikan hari */
   public int getHari() {
      return this.hari;
   }

   /** Menetapkan tahun. Tidak ada validasi masukan */
   public void setTahun(int tahun) {
      this.tahun = tahun;
   }

   /** Mengatur bulan. Tidak ada validasi masukan */
   public void setBulan(int bulan) {
      this.bulan = bulan;
   }

   /** Menetapkan hari. Tidak ada validasi masukan */
   public void setHari(int hari) {
      this.hari = hari;
   }

   /*
    * Mengembalikan String deskriptif dalam bentuk "MM/DD/YYYY" dengan awalan nol
    */
   public String toString() {
      // Gunakan fungsi bawaan String.format() untuk membentuk String yang diformat
      return String.format("%02d/%02d/%4d", bulan, hari, tahun);
      // Tentukan "0" untuk mencetak angka nol di depan
   }

   /** Menetapkan tahun, bulan dan hari. Tidak ada validasi masukan */
   public void setDate(int tahun, int bulan, int hari) {
      this.tahun = tahun;
      this.bulan = bulan;
      this.hari = hari;
   }
}