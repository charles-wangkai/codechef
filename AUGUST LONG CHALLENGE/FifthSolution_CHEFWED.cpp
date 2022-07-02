#include<bits/stdc++.h>
using namespace std;

int main()
{

    int t;
    cin>>t;

    while(t--)
    {
        int n,k;
        cin>>n>>k;
        
        if(k==1)
        {
            int hash[101];
            memset(hash,0,sizeof(hash));
            int count=1;
            int temp;
            for(int i=0;i<n;i++)
           {
           cin>>temp;
           if(hash[temp]<1)
           hash[temp]++;
           else
           {
               count++;
               memset(hash,0,sizeof(hash));
               hash[temp]++;
           }
           }
           
            
            cout<<count<<endl;
       }
    }
}

