/**
 * Test untuk kelas Circle
 */
public class TestCircle {
   public static void main(String[] args) {
      // Test semua kontrukstor dan toString()
      Circle c1 = new Circle(1.1, "biru");
      System.out.println(c1); // jalankan toString() secara implisit
      // Circle[radius=1.1, warna=biru]
      Circle c2 = new Circle(2.2);
      System.out.println(c2);
      // Circle[radius=2.2, warna=merah]
      Circle c3 = new Circle();
      System.out.println(c3);
      // Circle[radius=1.0, warna=merah]

      // Tes untuk mengatur dan mengambil
      c1.setRadius(3.3);
      c1.setWarna("hijau");
      System.out.println(c1); // gunakan toString() untuk memeriksa instance yang dimodifikasi
      // Circle[radius=3.3, warna=hijau]
      System.out.println("Radius : " + c1.getRadius());
      // Radius : 3.3
      System.out.println("Warna : " + c1.getWarna());
      // Warna : hijau

      // Test getLuas() dan getKeliling()
      System.out.printf("Luas : %.2f%n", c1.getLuas());
      // Luas : 34.21
      System.out.printf("Kurikulum : %.2f%n", c1.getKeliling());
      // Keliling : 20.73
   }
}