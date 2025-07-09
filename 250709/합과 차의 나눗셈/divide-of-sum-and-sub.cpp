#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    double c;
    c = double(a+b) / double(a-b);
    cout << fixed;
    cout.precision(2);
    cout << c;
    return 0;
}