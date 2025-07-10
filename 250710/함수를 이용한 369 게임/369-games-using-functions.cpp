#include <iostream>

using namespace std;

int a, b;

bool is_369(int i) {
    i = abs(i);
    if (i==0) return false;
    while(i>0) {
        int n = i % 10;
        if (n==3 || n==6 || n==9)
            return true;
        i /= 10;
    }
    return false;
}

int cnt_369(int a, int b) {
    int cnt = 0;
    for(int i=a; i<=b; i++) {
        if (is_369(i) || i%3==0)
            cnt++;
    }
    return cnt;
}
int main() {
    cin >> a >> b;

    cout << cnt_369(a,b);

    return 0;
}