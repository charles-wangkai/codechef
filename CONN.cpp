#include <iostream>
using namespace std;

int main() {
	int t,n;
	cin>>t;
	while(t--)
	{
	    cin>>n;
	    if(n==1 || n==3 || n==5)
	    cout<<"NO\n";
	    else
	    cout<<"YES\n";
	}
	return 0;
}
	/*while(t--){
	    cin>>n;
	    x = n%2;
	    y = n - 7*x;
	    if(y>=0 && y%2 == 0){
	        cout<<"YES\n";
	    }
	    else
	    cout<<"NO\n";
	}*/
