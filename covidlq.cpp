//
//  covidlq.cpp
//  codechef
//
//  Created by Tanishq Chamola on 04/04/20.
//  Copyright © 2020 Tanishq Chamola. All rights reserved.
//

#include <iostream>
#include <vector>
#include <numeric>
using namespace std;
/*
int main()
{
    int t;
    cin>>t;
    
    while (t--) {
        unsigned int n;
        cin>>n;
        
        vector<int> pos;
        vector<bool> arr;
        for (int i=0; i<n; i++) {
            int temp;
            cin>>temp;
            arr.push_back(temp);
        }
        for (int i = 0; i<arr.size(); i++) {
            if (arr[i]==1) {
                pos.push_back(i);
            }
        }
        int adjDifference[pos.size()];
        adjacent_difference(pos.begin(), pos.end(), adjDifference);
        for (int i=1; i<pos.size(); i++) {
            if (adjDifference[i]<6) {
                cout<<"NO"<<endl;
                goto label;
            }
        }
        cout<<"YES\n";
    label:;
        
    }
    
    return 0;
}
*/
