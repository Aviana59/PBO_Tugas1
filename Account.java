/**
 * Kelas Akun memodelkan rekening bank dengan saldo.
 */
public class Account {
    // Variabel instance privat
    private int angka;
    private double saldo;

    // Konstruktor (kelebihan beban)
    /**
     * Membuat instance Akun dengan angka yang diberikan dan saldo awal 0
     */
    public Account(int angka) {
        this.angka = angka;
        this.saldo = 0.0; // "this." opsional
    }

    /** Membuat instance Akun dengan angka dan saldo awal yang diberikan */
    public Account(int angka, double saldo) {
        this.angka = angka;
        this.saldo = saldo;
    }

    // Pengambil/pengatur publik untuk variabel instan privat.
    // Tidak ada pengatur angka karena tidak dirancang untuk diubah.
    // Tidak ada pengatur saldo karena diubah melalui kredit() dan debit()
    /** Mengembalikan angka */
    public int getAngka() {
        return this.angka; // "this." opsional
    }

    /** Mengembalikan saldo */
    public double getSaldo() {
        return this.saldo; // "this." opsional
    }

    /** Mengembalikan deskripsi string dari instance ini */
    public String toString() {
        // Gunakan fungsi bawaan System.format() untuk membentuk String yang diformat
        return String.format("Account[angka=%d,saldo=$%.2f]", angka, saldo);
    }

    /** Tambahkan jumlah yang ditentukan ke saldo */
    public void kredit(double jumlah) {
        saldo += jumlah;
    }

    /** Kurangi jumlah yang diberikan dari saldo, jika saldo >= jumlah */
    public void debit(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo kurang");
        }
    }

    /** Transfer sejumlah uang ke Account lain, jika saldo >= jumlah */
    public void transferTo(double jumlah, Account another) {
        if (saldo >= jumlah) {
            this.saldo -= jumlah;
            another.saldo += jumlah;
        } else {
            System.out.println("Saldo Kurang");
        }
    }
}