#include <iostream>
using namespace std;

int main() {
    int a, b, c, low;
    cin >> a >> b >> c;
    if((a>=b) && (c>=b))
        low = b;
    else if((b>=a) && (c>=a))
        low = a;
    else if((a>=c) && (b>=c))
        low = c;
    
    if(a == low)
        cout << 1;
    else
        cout << 0;
    
    cout << ' ';

    if ((a==b) && (b==c))
        cout << 1;
    else
        cout << 0;
    return 0;
}