#include<bits/stdc++.h>
using namespace std;
const int N=1e5+10;
int heap[N],size_heap,n,m;
void down(int x){
    int t=x;
    if(2*t<=size_heap&&heap[2*t]<heap[x])x=2*t;
    if(2*t+1<=size_heap&&heap[2*t+1]<heap[x])x=2*t+1;
    if(t!=x){
        swap(heap[t],heap[x]);
          down(x);
    }
}
int main(){
    cin>>n>>m;
    size_heap=n;
    for(int i=1;i<=n;i++)
        cin>>heap[i];
    for(int i=n/2;i>=0;i--)
        down(i);
   for(int i=1;i<=m;i++){
        cout<<heap[1]<<" ";
        heap[1]=heap[size_heap--];
        down(1);
    }
    return 0;
}