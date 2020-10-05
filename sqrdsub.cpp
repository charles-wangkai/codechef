//
//  sqrdsub.cpp
//  codechef
//
//  Created by Tanishq Chamola on 06/04/20.
//  Copyright © 2020 Tanishq Chamola. All rights reserved.
//

#include <iostream>
#include <numeric>
using namespace std;
//PARTIALLY CORRECT ANSWER

bool isOdd(int x){
    return (x%2!=0);
}
/*
int main()
{
    unsigned short int t;
    cin>>t;
    
    while (t--) {
     
        unsigned int n,count=0;
        cin>>n;
        unsigned int arr[n];
        
        for (int i=0; i<n; i++) {
            cin>>arr[i];
        }
        
        for (int len=0; len<=n; len++) {
            for (int i=0; i+len<n; i++) {
                if (all_of(&arr[i], &arr[i+len+1], isOdd)) {
                    count++;
                    continue;
                }
                else
                {
                    int number=0;
                    for (int h=i; h<i+len+1; h++) {
                        if (arr[h]%4==0) {
                            count++;
                            break;
                        }
                        if (arr[h]%2==0) {
                            number++;
                            if (number==2) {
                                count++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        cout<<count<<endl;
    }
    return 0;
}
*/
