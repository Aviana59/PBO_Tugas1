#include <iostream>
#include <cmath>

class Point
{
private:
   int x, y;

public:
   Point() : x(0), y(0) {} // Konstruktor default

   Point(int x, int y) : x(x), y(y) {} // Konstruktor dengan parameter

   int getX() const
   {
      return x;
   }

   void setX(int x)
   {
      this->x = x;
   }

   int getY() const
   {
      return y;
   }

   void setY(int y)
   {
      this->y = y;
   }

   std::string toString() const
   {
      return "(" + std::to_string(x) + "," + std::to_string(y) + ")";
   }

   int *getXY() const
   {
      int *results = new int[2];
      results[0] = x;
      results[1] = y;
      return results;
   }

   void setXY(int x, int y)
   {
      this->x = x;
      this->y = y;
   }

   double jarak(int x, int y) const
   {
      int xDiff = this->x - x;
      int yDiff = this->y - y;
      return std::sqrt(xDiff * xDiff + yDiff * yDiff);
   }

   double jarak(const Point &another) const
   {
      int xDiff = this->x - another.x;
      int yDiff = this->y - another.y;
      return std::sqrt(xDiff * xDiff + yDiff * yDiff);
   }

   double jarak() const
   {
      return std::sqrt(x * x + y * y);
   }
};

int main()
{
   // Test konstruktor dan toString()
   Point p1(1, 2);
   std::cout << p1.toString() << std::endl; // toString()
   // (1,2)
   Point p2; // konstruktor default
   std::cout << p2.toString() << std::endl;
   // (0,0)

   // Tes pengatur dan pengambil
   p1.setX(3);
   p1.setY(4);
   std::cout << p1.toString() << std::endl; // jalankan toString() untuk memeriksa instance yang dimodifikasi
   // (3,4)
   std::cout << "X : " << p1.getX() << std::endl;
   // X : 3
   std::cout << "Y : " << p1.getY() << std::endl;
   // Y : 4

   // Tes setXY() dan getXY()
   p1.setXY(5, 6);
   std::cout << p1.toString() << std::endl; // toString()
   // (5,6)
   int *xy = p1.getXY();
   std::cout << "X : " << xy[0] << std::endl;
   // X : 5
   std::cout << "Y : " << xy[1] << std::endl;
   // Y : 6
   delete[] xy;

   // Uji 3 versi jarak() yang kelebihan beban
   Point p3(10, 11);
   std::cout << "jarak : " << p1.jarak(10, 11) << std::endl;
   // jarak : 7.07
   std::cout << "jarak : " << p1.jarak(p3) << std::endl;
   // jarak : 7.07
   std::cout << "jarak : " << p3.jarak(p1) << std::endl;
   // jarak : 7.07
   std::cout << "jarak : " << p1.jarak() << std::endl;
   // jarak : 7.81

   return 0;
}
