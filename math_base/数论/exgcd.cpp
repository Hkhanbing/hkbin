#include<iostream>
using namespace std;

int exgcd(int a, int b, int &x1, int &y1){
    if(b == 0)return a;
    int gcd = exgcd(b, a%b, y1, x1);
    y1 -= a/b * x1;
}

int main(){

    return 0;
}