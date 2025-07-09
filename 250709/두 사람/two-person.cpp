#include <iostream>
using namespace std;

int main() {
    int oneA, twoA;
    char oneS, twoS;
    cin >> oneA >> oneS;
    cin >> twoA >> twoS;
    if ((oneA >= 19 && oneS == 'M') || (twoA >= 19 && twoS == 'M'))
        cout << 1;
    else
        cout << 0;
    return 0;
}