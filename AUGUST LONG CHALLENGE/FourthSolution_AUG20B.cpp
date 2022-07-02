#include<bits/stdc++.h>
using namespace std;


int main()
{

    int tc;
    cin>>tc;

    string se,p;
    vector<char> x;
    int j=0,flag,z;

    while(tc--)
    {   
        j=0,z=0;
        flag=0;
        cin>>se>>p;
        int hash[26]={0};
        if(se.length()==1)
        {
            cout<<se;
        }
        else
        {
        for(int i=0;i<se.length();i++)
        hash[(int)se[i]-97]++;
        
        for(int i=0;i<p.length();i++)
        hash[(int)p[i]-97]--;
        
        vector<char> x;
        
        for(int i=0;i<26;i++)
        for(int j=0;j<hash[i];j++)
        x.push_back((char)(i+97));
        
        while(p[z+1]==p[z])
        {
            z++;
        }
        x.push_back(p[0]);
        sort(x.begin(),x.end());

            for(auto i=x.begin();i!=x.end();++i)
            {
                if(p[z+1]>p[z])
                {
                    if(*i==p[0] && *(i+1)!=*i)
                    {
                            cout<<p;
                    }
                    else
                        cout<<*i;
                }
                else
                {
                    if(*i==p[0] && flag==0)
                    {
                        cout<<p;
                        flag=1;
                    }
                    else
                        cout<<*i;
                }
            }   
            cout<<"\n";
        }
    }
}
