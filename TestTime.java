/**
 * Test untuk kelas Java
 */
public class TestTime {
   public static void main(String[] args) {
      // Test Kontrukstor dan toString()
      Time t1 = new Time(1, 2, 3);
      System.out.println(t1); // toString()
      // 03:02:01
      Time t2 = new Time(); // Kontrukstor default
      System.out.println(t2);
      // 00:00:00

      // Test untuk mengatur dan mengambil
      t1.setJam(4);
      t1.setMenit(5);
      t1.setDetik(6);
      System.out.println(t1); // jalankan toString() untuk memeriksa instance yang dimodifikasi
      // 04:05:06
      System.out.println("Jam : " + t1.getJam());
      // Jam : 4
      System.out.println("Menit : " + t1.getMenit());
      // Menit : 5
      System.out.println("Detik : " + t1.getDetik());
      // Detik : 6

      // Test setTime()
      t1.setTime(58, 59, 23);
      System.out.println(t1);
      // 23:59:58

      // Uji nextSecond() dan rangkaian
      System.out.println(t1.nextDetik()); // Kembalikan Waktu. Panggil toString Waktu ()
      // 23:59:59
      System.out.println(t1.nextDetik().nextDetik().nextDetik()); // rangkaian
      // 00:00:02
   }
}