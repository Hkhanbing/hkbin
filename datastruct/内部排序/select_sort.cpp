#include<iostream>
using namespace std;

void select_sort(int arr[], int n){
    int low_value;
    int low_index;
    for(int i = 1; i < n; i++){
        low_index = i;
        low_value = arr[low_index];
        for(int j = i + 1; j <= n; j ++){
            if(low_value > arr[j]){
                low_value = arr[j];
                low_index = j;
            }
        }
        if(i != low_index)swap(arr[i], arr[low_index]);
    }
}

int main(){

    return 0;
}