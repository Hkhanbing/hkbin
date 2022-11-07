#include<iostream>
using namespace std;

void quick_sort(int l, int r, int arr[]){
    if(l >= r)return;
    int i = l - 1, j = r + 1, mid = arr[l + r >> 1];
    while(i < j){
        do i++;while(arr[i] < mid);
        do j--;while(arr[j] > mid);
        if(i < j)
            swap(arr[i], arr[j]);
    }
    quick_sort(l, i, arr), quick_sort(i + 1, r, arr);
}

int main(){
    // int arr[20];
    // int n;
    // cin>>n;
    // for(int i = 0; i < n; i++)
    //     cin>>arr[i];
    // quick_sort(0, n-1, arr);
    // for(int i = 0; i < n; i++)
    //     cout<<arr[i]<<" ";
    // system("pause");
    return 0;
}