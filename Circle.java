/**
 * Kelas Cicrle memodelkan lingkaran dengan radius dan warna.
 */
public class Circle { // simpan dengan nama "Circle.java"
   // KOnstanta publik
   public static final double DEFAULT_RADIUS = 1.0;
   public static final String DEFAULT_WARNA = "merah";

   // Variable instan private
   private double radius;
   private String warna;

   // Kontrukstor (kelebihan beban)
   /** Membangun Lingkaran dengan radius dan warna default */
   public Circle() { // Kontrukstor default pertama
      this.radius = DEFAULT_RADIUS;
      this.warna = DEFAULT_WARNA;
   }

   /** Membangun Lingkaran dengan radius tertentu dan warna default */
   public Circle(double radius) { // Kontruktor kedua
      this.radius = radius;
      this.warna = DEFAULT_WARNA;
   }

   /** Membuat Lingkaran dengan jari-jari dan warna tertentu */
   public Circle(double radius, String warna) { // Kontrukstor ketiga
      this.radius = radius;
      this.warna = warna;
   }

   /** Mengembalikan radius - mengambil publik untuk radius variabel pribadi. */
   public double getRadius() {
      return this.radius;
   }

   /** Mengatur radius - mengatur publik untuk radius variabel pribadi */
   public void setRadius(double radius) {
      this.radius = radius;
   }

   /** Mengembalikan warna - mengambil publik untuk warna variabel pribadi */
   public String getWarna() {
      return this.warna;
   }

   /** Mengatur warna - mengatur publik untuk warna variabel pribadi */
   public void setWarna(String warna) {
      this.warna = warna;
   }

   /** Mengembalikan string deskriptif diri untuk contoh Lingkaran ini */
   public String toString() {
      return "Circle[radius=" + radius + ", warna=" + warna + "]";
   }

   /** Mengembalikan luas Lingkaran ini */
   public double getLuas() {
      return radius * radius * Math.PI;
   }

   /** Mengembalikan keliling Lingkaran ini */
   public double getKeliling() {
      return 2.0 * radius * Math.PI;
   }
}