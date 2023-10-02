#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class Circle {
public:
    // Konstanta publik
    static const double DEFAULT_RADIUS;
    static const string DEFAULT_WARNA;

    // Konstruktor (overloaded)
    Circle() : radius(DEFAULT_RADIUS), warna(DEFAULT_WARNA) {}
    Circle(double r) : radius(r), warna(DEFAULT_WARNA) {}
    Circle(double r, string c) : radius(r), warna(c) {}

    // Getter dan setter
    double getRadius() const { return radius; }
    void setRadius(double r) { radius = r; }

    string getWarna() const { return warna; }
    void setWarna(string c) { warna = c; }

    // Metode lain
    double getLuas() const {
        return radius * radius * M_PI;
    }

    double getKeliling() const {
        return 2.0 * radius * M_PI;
    }

    string toString() const {
        return "Lingkaran [radius = " + to_string(radius) + ", warna = " + warna + "]";
    }

private:
    double radius;
    string warna;
};

// Inisialisasi konstanta statik
const double Circle::DEFAULT_RADIUS = 1.0;
const string Circle::DEFAULT_WARNA = "Merah";

int main() {
    // Uji semua konstruktor dan toString()
    Circle c1(2.0, "Biru");
    cout << c1.toString() << endl;

    Circle c2(2.2);
    cout << c2.toString() << endl;

    Circle c3;
    cout << c3.toString() << endl;

    // Uji Setters dan Getters 
    c1.setRadius(3.3);
    c1.setWarna("Hijau");
    cout << c1.toString() << endl;
    cout << "Radius adalah " << c1.getRadius() << endl;
    cout << "Warnanya adalah " << c1.getWarna() << endl;

    // Uji getLuas() dan getKeliling()
    cout << "Luasnya adalah: " << c1.getLuas() << endl;
    cout << "Kelilingnya adalah: " << c1.getKeliling() << endl;

    return 0;
}