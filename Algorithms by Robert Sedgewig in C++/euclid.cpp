#include<iostream>
using namespace std;

int gcd(int u, int v)
{
  int r = u % v;
  while(r != 0)
  {
    u = v;
    v = r;
    r = u % v;
  }
  return v;
}

int main()
{

  int u = 200;
  int v = 300;

  cout << gcd(u, v) << endl;
  return 0;
}