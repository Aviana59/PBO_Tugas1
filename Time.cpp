#include <iostream>
#include <iomanip>
#include <string>

class Time {
private:
    int detik, menit, jam;

public:
    Time(int detik, int menit, int jam) : detik(detik), menit(menit), jam(jam) {}

    Time() : detik(0), menit(0), jam(0) {}

    int getDetik() const {
        return detik;
    }

    int getMenit() const {
        return menit;
    }

    int getJam() const {
        return jam;
    }

    void setDetik(int detik) {
        this->detik = detik;
    }

    void setMenit(int menit) {
        this->menit = menit;
    }

    void setJam(int jam) {
        this->jam = jam;
    }

    std::string toString() const {
        return std::to_string(jam) + ":" +
               std::to_string(menit) + ":" +
               std::to_string(detik);
    }

    void setTime(int detik, int menit, int jam) {
        this->detik = detik;
        this->menit = menit;
        this->jam = jam;
    }

    Time& nextDetik() {
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
        return *this;
    }
};

int main() {
    // Test Konstruktor dan toString()
    Time t1(1, 2, 3);
    std::cout << t1.toString() << std::endl; // toString()
    // 3:2:1
    Time t2; // Konstruktor default
    std::cout << t2.toString() << std::endl;
    // 0:0:0

    // Test untuk mengatur dan mengambil
    t1.setJam(4);
    t1.setMenit(5);
    t1.setDetik(6);
    std::cout << t1.toString() << std::endl; // jalankan toString() untuk memeriksa instance yang dimodifikasi
    // 4:5:6
    std::cout << "Jam : " << t1.getJam() << std::endl;
    // Jam : 4
    std::cout << "Menit : " << t1.getMenit() << std::endl;
    // Menit : 5
    std::cout << "Detik : " << t1.getDetik() << std::endl;
    // Detik : 6

    // Test setTime()
    t1.setTime(58, 59, 23);
    std::cout << t1.toString() << std::endl;
    // 23:59:58

    // Uji nextDetik() dan rangkaian
    std::cout << t1.nextDetik().toString() << std::endl; // Kembalikan Waktu. Panggil toString Waktu ()
    // 23:59:59
    std::cout << t1.nextDetik().nextDetik().nextDetik().toString() << std::endl; // rangkaian
    // 0:0:2

    return 0;
}
