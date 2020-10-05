//
//  giftsrc.cpp
//  codechef
//
//  Created by Tanishq Chamola on 22/03/20.
//  Copyright © 2020 Tanishq Chamola. All rights reserved.
//

#include <iostream>
#include <string.h>
using namespace std;
/*
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int len;
        cin>>len;
        string str;
        cin>>str;

        int a=0,b=0;
        
        for (int i=0; i<len; i++) {
            
            if (str.at(i) == 'L') {
                
                if (i!=0) {
                    if(str.at(i-1)== 'R' || str.at(i-1)== 'L') {
                        continue;
                    }
                }
                a--;
            }
            else if (str.at(i) == 'R') {
                
                if (i!=0) {
                    if(str.at(i-1)== 'R' || str.at(i-1)== 'L') {
                        continue;
                    }
                }
                a++;
            }
            else if (str.at(i) == 'U') {
                if (i!=0) {
                    if(str.at(i-1)== 'U' || str.at(i-1)== 'D') {
                        continue;
                    }
                }
                b++;
            }
            else if (str.at(i) == 'D') {
                if (i!=0) {
                    if(str.at(i-1)== 'U' || str.at(i-1)== 'D') {
                        continue;
                    }
                }
                b--;

            }
        }

        cout<<a<<"\t"<<b<<endl;
        
    }
    
    return 0;
}
*/
