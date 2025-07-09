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
    cout << low;
    return 0;
}