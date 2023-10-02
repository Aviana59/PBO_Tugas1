/**
 * Tes untuk Account class
 */
public class TestAccount {
    public static void main(String[] args) {
        // Tes konstruktor toString()
        Account a1 = new Account(5566);
        System.out.println(a1);
        // Account[angka=5566,saldo=$0.00]
        Account a2 = new Account(1234, 99.9);
        System.out.println(a2);
        // Account[angka=1234,saldo=$99.90]

        // Tes pengambil
        System.out.println("Nomor rekening : " + a2.getAngka());
        // Nomor rekening : 1234
        System.out.println("Saldo : " + a2.getSaldo());
        // Saldo: 99.9

        // Tes kredit(), debit() dan transferTo()
        a1.kredit(11.1);
        System.out.println(a1);
        // Account[angka=5566,saldo=$11.10]
        a1.debit(5.5);
        System.out.println(a1);
        // Account[angka=5566,saldo=$5.60]
        a1.debit(500); // Test debit() error
        // saldo kurang
        System.out.println(a1);
        // Account[angka=5566,saldo=$5.60]

        a2.transferTo(1.0, a1);
        System.out.println(a1);
        // Account[angka=5566,saldo=$6.60]
        System.out.println(a2);
        // Account[angka=1234,saldo=$98.90]
    }
}