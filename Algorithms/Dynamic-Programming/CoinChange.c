#include <stdio.h>
#include <stdlib.h>

long long int count(long long int S[], long int m, long int n) {
    long int i, j, x, y;
    long long int table[n+1][m];
    
    for (i=0; i<m; i++) {
        table[0][i] = 1;
    }
    
    for (i=1; i<n+1; i++) {
        for (j=0; j<m; j++) {
            x = (i-S[j] >= 0)? table[i-S[j]][j]: 0;
            y = (j >= 1)? table[i][j-1]: 0;
            table[i][j] = x+y;
        }
    }
    return table[n][m-1];
}

int main() {
	long int i, j;
	int n, m;
	scanf("%d %d", &n, &m);
	long long int arr[m];
	for (i=0; i<m; i++) {
		scanf("%lld", &arr[i]);
	}
	long long int ans = count(arr, m, n);
	printf("%lld", ans);
	return 0;
}
