#include<iostream>
using namespace std;

int Oula(int x){
    int ret = x;
    for(int i = 2; i <= x/i; i++){
        if(x % i == 0){
            while(x % i == 0){
                x /= i;
            }
            ret *= (double(i-1) / i);
        }
    }
    return ret;
}

int main(){

    return 0;
}