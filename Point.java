/**
 * Kelas Point memodelkan titik 2D di (x, y).
 */
public class Point {
    // Variabel instance privat
    private int x, y;

    // Konstruktor (kelebihan beban)
    /** Membuat instance Point dengan nilai default */
    public Point() { // Konstruktor default
        this.x = 0;
        this.y = 0;
    }

    /** Membuat instance Point dengan nilai x dan y yang diberikan */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Pengambil dan pengatur publik
    /** Mengembalikan nilai x */
    public int getX() {
        return this.x;
    }

    /** Pengaturan nilai x */
    public void setX(int x) {
        this.x = x;
    }

    /** Mengembalikan nilai y */
    public int getY() {
        return this.y;
    }

    /** Pengaturan nilai y */
    public void setY(int y) {
        this.y = y;
    }

    /** Mengembalikan string deskriptif diri dalam bentuk "(x,y)" */
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    /** Mengembalikan array int 2 elemen yang berisi x dan y */
    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    /** Pengaturan x dan y */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Kembalikan jarak dari contoh ini ke titik tertentu di (x,y). Memohon
     * melalui p1.jarak(1,2)
     */
    public double jarak(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Mengembalikan jarak dari instance ini ke instance Point yang diberikan.
     * Memohon
     * melalui p1.jarak(p2)
     */
    public double jarak(Point another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Mengembalikan jarak dari instance ini ke (0,0). Panggil melalui p1.distance()
     */
    public double jarak() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}