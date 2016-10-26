/*#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>*/
#include <bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin >> n;
    vector<int> v;
    for (int i=0; i<n; i++) {
        int a;
        cin >> a;
        v.push_back(a);
    }
    int b, c, d;
    cin >> b >> c >> d;
    v.erase(v.begin()+b-1);
    v.erase(v.begin()+c-1, v.begin()+d-1);
    cout << v.size() << endl;
    for (int i=0; i<v.size(); i++) {
        cout << v[i] << " ";
    }
    return 0;
}

