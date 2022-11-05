#include<iostream>
using namespace std;

void hack1(){
    return;
}

int add(int x, int y){
    return x+y;
}

int main(){
    int a, b;
    cin>>a>>b;
    hack1();
    cout<<add(a, b);

    return 0;
}