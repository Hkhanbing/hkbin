#include<iostream>
#include<ctype.h>
#include<string.h>

using namespace std;

int main(){

    char data[30] = {208, 208, 133, 133, 128, 128, 197, 138, 147, 137, 146, 143, 135, 136, 159, 143, 197, 132, 214, 209, 210, 130, 211, 222, 135};

    string a;
    cin>>a;
    bool flag = memcmp(&a, data, 25);
    cout<<flag<<endl;
}
