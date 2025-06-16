#include <iostream>

using namespace std;

int n, m;

void getGCD(int n, int m) {
    int GCD;
    if (n > m) {
        for(int i=1; i<=n; i++) {
            if(n % i == 0 && m % i == 0) {
                GCD = i;
            }
        }
    }
    else {
        for(int i=1; i<=m; i++) {
            if(n % i == 0 && m % i == 0) {
                GCD = i;
            }
        }
    }
    
    cout << GCD;
}

int main() {
    cin >> n >> m;

    getGCD(n,m);

    return 0;
}