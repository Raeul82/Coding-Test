#include <iostream>

using namespace std;

int n;

void answer(int n) {
    if (n%2==0 && ((n/10)+(n%10))%5==0)
        cout << "Yes";
    else
        cout << "No";
}
int main() {
    cin >> n;

    answer(n);

    return 0;
}