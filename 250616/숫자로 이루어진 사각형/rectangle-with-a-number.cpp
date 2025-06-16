#include <iostream>

using namespace std;

int N;
int k=1;

void PrintSquare(int N) {
    for(int i=0; i<N; i++) {
        for(int j=1; j<=N; j++) {
            cout << k << " ";
            k++;
            if (k>9) {
                k = 1;
            }
        } cout << endl;
    }
}

int main() {
    cin >> N;

    PrintSquare(N);

    return 0;
}