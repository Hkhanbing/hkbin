#include<iostream>
using namespace std;

void shell_sort(int n, LIST A){
    int i, j, d;
    for(d = n/2; d >= 1; d = d/2){
        for(i = d + 1; i <= n; i++){
            A[0].key = A[i].key;
            j = i-d;

            while(j > 0 && A[0].key < A[j].key){
                A[j+d] = A[j];
                j = j - d;
            }
            A[j + d] = A[0];
        }
    }
}

/*
不要求掌握代码， 知道思想就行， 这个代码也只是节选
我觉得递归可能更好
*/

// void shell_sort_v2(LIST A, int n, int d){
//     if(d == 1)return;
//     for(int i = 0; i < d; i++){

//     }
// }
int main(){

    shell_sort_v2(A, n, n/2);
    return 0;
}