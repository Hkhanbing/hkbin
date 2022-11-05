#include<iostream>
using namespace std;

int main(){
    __int64 v2;
    v2 = std::operator<<<std::char_traits<char>>(&std::cout, "CSR{");

    return 0;
}