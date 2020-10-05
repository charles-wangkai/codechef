//
//  carsell.cpp
//  codechef
//
//  Created by Tanishq Chamola on 03/04/20.
//  Copyright © 2020 Tanishq Chamola. All rights reserved.
//

#include <iostream>
#include <algorithm>
#include <numeric>
using namespace std;
/*
int main()
{
    int t;
    cin>>t;
    
    while (t--) {
        long long n=0,result=0;
        cin>>n;
        long long price[n];
        for (int i=0; i<n; i++) {
            cin>>price[i];
        }
        sort(price, price+n);
        reverse(price, price+n);
        for (int i=0; i<n; i++) {
            price[i]=price[i]-i;
            if(price[i]<0) {
                price[i]=0;
            }
        }
        
        result=accumulate(price, price+n, result);
        
        cout<<result%1000000007<<"\n";
    }
    
    return 0;
}
*/
