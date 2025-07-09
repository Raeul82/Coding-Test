#include <iostream>

using namespace std;

int N;

int sum_div(int N) {
    int sum = 0;
    for(int i=1; i<=N; i++)
        sum += i;
    return (sum /= 10);
}
int main() {
    cin >> N;

    cout << sum_div(N);

    return 0;
}