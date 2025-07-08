#include <iostream>
using namespace std;

int main() {
    float a, b, c;
    cin >> a >> b;
    c = a+b;
    cout << fixed;
    cout.precision(2);
    cout << c;
    return 0;
}