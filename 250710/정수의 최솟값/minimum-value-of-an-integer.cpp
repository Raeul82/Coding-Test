#include <iostream>

using namespace std;

int a, b, c;

int min(int a, int b, int c) {
    int m;
    if (a>=b && c>=b)
        m = b;
    else if (b>=a && c>=a)
        m = a;
    else if (a>=c && b>=c)
        m = c;
    return m;
}

int main() {
    cin >> a >> b >> c;

    int m;
    m = min(a,b,c);
    cout << m;

    return 0;
}