#include <iostream>
#include <iomanip>
#include <string>

class Account
{
private:
    int angka;
    double saldo;

public:
    Account(int angka) : angka(angka), saldo(0.0) {}

    Account(int angka, double saldo) : angka(angka), saldo(saldo) {}

    int getAngka() const
    {
        return angka;
    }

    double getSaldo() const
    {
        return saldo;
    }

    std::string toString() const
    {
        return "Account[angka=" + std::to_string(angka) + ",saldo=$" + std::to_string(saldo) + "]";
    }

    void kredit(double jumlah)
    {
        saldo += jumlah;
    }

    void debit(double jumlah)
    {
        if (saldo >= jumlah)
        {
            saldo -= jumlah;
        }
        else
        {
            std::cout << "Saldo Kurang" << std::endl;
        }
    }

    void transferTo(double jumlah, Account &another)
    {
        if (saldo >= jumlah)
        {
            saldo -= jumlah;
            another.saldo += jumlah;
        }
        else
        {
            std::cout << "Saldo Kurang" << std::endl;
        }
    }
};

int main()
{
    Account a1(5566);
    std::cout << a1.toString() << std::endl;

    Account a2(1234, 99.9);
    std::cout << a2.toString() << std::endl;

    std::cout << "Nomor rekening : " << a2.getAngka() << std::endl;
    std::cout << "Saldo : $" << a2.getSaldo() << std::endl;

    a1.kredit(11.1);
    std::cout << a1.toString() << std::endl;

    a1.debit(5.5);
    std::cout << a1.toString() << std::endl;

    a1.debit(500);
    std::cout << a1.toString() << std::endl;

    a2.transferTo(1.0, a1);

    std::cout << a1.toString() << std::endl;
    std::cout << a2.toString() << std::endl;

    return 0;
}
