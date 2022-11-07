#include<iostream>
using namespace std;

void bubble_sort(int arr[], int n){

// 优化
    for(int i = 0; i < n; i++){
        //bool sp = 0;
        for(int j = n - 1; j >= i + 1; j--){
            if(arr[j] > arr[j - 1]){
                swap(arr[j], arr[j-1]);
                //sp = 1
            }
            //if(!sp)return;
        }
    }
}

int main(){

    return 0;
}