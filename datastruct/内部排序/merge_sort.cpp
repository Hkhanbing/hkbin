#include<iostream>
using namespace std;
const int N = 1e3+10;

int n;
void merge_sort(int arr[], int l, int r){
    int mid;
    while(l < r){
        int mid = l + r >> 1;
        merge_sort(arr, l, mid), merge_sort(arr, mid+1, r);
    }
    int brr[N];
    int k = 0;
    int i = l, j = mid + 1;
    while(i <=l && j <= r){
        if(arr[i] < arr[j])brr[k++] = arr[i++];
        else brr[k++] = arr[j++];
    }
    while(i <= l)brr[k++] = arr[i++];
    while(j <= r)brr[k++] = arr[j++];

    for(int i = l, k = 0; i <= r; i++){
        arr[i] = brr[k++];
    }
}

int main(){

    return 0;
}