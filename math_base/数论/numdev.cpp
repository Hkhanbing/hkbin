#include<iostream>
#include<vector>
typedef pair<int, int> PII;
using namespace std;

void numdev(int x){
    vector<PII>primes;
    for(int i = 2; i <= x / i; i++){
        if(x % i == 0){
            int exp = 0;
            while(x % i == 0){
                x /= i;
                exp++;
            }
            primes.push_back(make_pair(i, exp));
        }
    }
}

int main(){

    return 0;
}