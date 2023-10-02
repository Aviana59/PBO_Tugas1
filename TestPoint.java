/**
 * Test untuk kelas Point
 */
public class TestPoint {
    public static void main(String[] args) {
        // Test konstruktor dan toString()
        Point p1 = new Point(1, 2);
        System.out.println(p1); // toString()
        // (1,2)
        Point p2 = new Point(); // konstruktor default
        System.out.println(p2);
        // (0,0)

        // Tes pengatur dan pengambil
        p1.setX(3);
        p1.setY(4);
        System.out.println(p1); // jalankan toString() untuk memeriksa instance yang dimodifikasi
        // (3,4)
        System.out.println("X : " + p1.getX());
        // X : 3
        System.out.println("Y : " + p1.getY());
        // Y : 4

        // Tes setXY() dan getXY()
        p1.setXY(5, 6);
        System.out.println(p1); // toString()
        // (5,6)
        System.out.println("X : " + p1.getXY()[0]);
        // X : 5
        System.out.println("Y : " + p1.getXY()[1]);
        // Y : 6

        // Uji 3 versi jarak() yang kelebihan beban
        p2.setXY(10, 11);
        System.out.printf("jarak : %.2f%n", p1.jarak(10, 11));
        // jarak : 7.07
        System.out.printf("jarak : %.2f%n", p1.jarak(p2));
        // jarak : 7.07
        System.out.printf("jarak : %.2f%n", p2.jarak(p1));
        // jarak : 7.07
        System.out.printf("jarak : %.2f%n", p1.jarak());
        // jarak : 7.81
    }
}