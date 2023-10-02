#include <iostream>
#include <iomanip>
using namespace std;

class Date {
private:
    int tahun, bulan, hari;

public:
    Date(int tahun, int bulan, int hari) {
        this->tahun = tahun;
        this->bulan = bulan;
        this->hari = hari;
    }

    int getTahun() {
        return tahun;
    }

    int getBulan() {
        return bulan;
    }

    int getHari() {
        return hari;
    }

    void setTahun(int tahun) {
        this->tahun = tahun;
    }

    void setBulan(int bulan) {
        this->bulan = bulan;
    }

    void setHari(int hari) {
        this->hari = hari;
    }

    string toString() {
        return to_string(bulan) + "/" + to_string(hari) + "/" + to_string(tahun);
    }

    void setDate(int tahun, int bulan, int hari) {
        this->tahun = tahun;
        this->bulan = bulan;
        this->hari = hari;
    }
};

int main() {
    Date d1(2020, 2, 8);
    cout << d1.toString() << endl;

    d1.setTahun(2012);
    d1.setBulan(12);
    d1.setHari(23);
    cout << d1.toString() << endl;
    cout << "Tahun : " << d1.getTahun() << endl;
    cout << "Bulan : " << d1.getBulan() << endl;
    cout << "Hari : " << d1.getHari() << endl;

    d1.setDate(2988, 1, 2);
    cout << d1.toString() << endl;

    return 0;
}