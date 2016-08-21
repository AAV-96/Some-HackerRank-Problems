#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n,k;
    scanf("%d%d",&n,&k);
    int a[n];
    int ctr=0;
    int f=0;
    int d;
    for (int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int i=0;int j=0;
	while (j<n) {
		if (i != j){
			d = a[i]+a[j];
		} else {
			j++;
			d = a[i]+a[j];
		}
		while (d%k != 0){
			i++;j=0;
			d = a[i]+a[j];
		}
		while (d%k == 0){
			j++;
			if (i == j)
				j++;
			d = a[i]+a[j];
			
		}
		if (j == n-1){
			ctr++;
		}
		}
    printf("%d",n-ctr);
    return 0;
}
