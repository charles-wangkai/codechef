#include<bits/stdc++.h>
#define FIO ios_base::sync_with_stdio(false);cin.tie(NULL);
using namespace std;


long long int nCr(long long int n) 
{ 
    return (n*(n-1))/2;
} 
  

int main()
{
    FIO;
    int t;
    cin>>t;
    while(t--)
    {
       long long int n;
        cin>>n;
        if(n%4==0 || (n+1)%4==0)
        {
         long long int count=0;
         long long int fullsum=(n*(n+1))/2;
          
          int i=sqrt(fullsum+0.25)-0.5;
          
          if(ceil(sqrt(fullsum+0.25)-0.5)==i)
          count=nCr(i)+nCr(n-i);
          
          count=count+n-i;
          cout<<count<<endl;
        }
        else
          cout<<0<<endl;
  
    }
    

    return 0;
}
