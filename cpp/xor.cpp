#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

bool isDescSorted(vector<int> &vec)
{
  for(int i = 0; i < vec.size() - 1; i++)
  {
    if(vec[i] < vec[i + 1])
      return false;
  }
  return true;
}

vector<int> exor(vector<int> &vec, int x)
{
  vector<int> newvec;
  for(int i = 0; i < vec.size(); i++)
  {
    newvec.push_back(vec[i] ^ x);
  }
  return newvec;
}

int solve(vector<int> &vec)
{
  vector<int> tmpvec;
  for(int i = 1; i < 100; i++)
  {
    tmpvec = exor(vec, i);
    if(isDescSorted(tmpvec))
      return i;
  }
  return -1;
}

int main()
{
  int num;
  vector<int> vec = {1, 7, 14, 14, 18};
  cout << solve(vec);
  return 0;
}