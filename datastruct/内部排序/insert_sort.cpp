#include<iostream>
using namespace std;

void insert_sort(int arr[], int n){
    for(int i = 1; i < n; i++){
        int j = i;
        while(arr[j] < arr[j - 1]){
            swap(arr[j], arr[j - 1])
            j--;
        }
    }
    ...反正挺简单的不码了
}

int main(){

    return 0;
}