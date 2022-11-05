#include<iostream>
#include<fstream>
using namespace std;


int main(){

    //readin
    ifstream readFile;
    readFile.open("url");

    string data;
    readFile>>data;

    //writeout
    ofstream writeFile;
    writeFile.open("url");
    writeFile<<data;

    return 0;
}


for(node *p = List; p->next != NULL; p = p->next){
    cout<<p->next->value<<endl;
}