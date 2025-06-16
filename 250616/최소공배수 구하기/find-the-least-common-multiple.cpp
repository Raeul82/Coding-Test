#include <iostream>

using namespace std;

int n, m;

void getLCM(int n, int m) {
    int GCD, LCM;
    for(int i=1; i < min(n,m); i++) {
        if(n % i == 0 && m % i == 0) {
            GCD = i;
        }
    }
    LCM = (n*m) / GCD;
    cout << LCM;
}

int main() {
    cin >> n >> m;

    getLCM(n,m);

    return 0;
}