#include<iostream>
using namespace std;

int qmi(int a, int b, int m){
    int ret = 1;
    while(!b){
        if(b & 1){
            ret *= a % m;
        }
        b >> 1;
        a *= a % m;
    }
    return ret;
}

int main(){

    return 0;
}