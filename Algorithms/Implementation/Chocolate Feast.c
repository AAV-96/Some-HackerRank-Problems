#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        int n; 
        int c; 
        int m; 
        scanf("%d %d %d",&n,&c,&m);
        int d, r=0, cpy, sum = 0;
        sum = n/c;
        cpy = sum;
        while (cpy > 0){
            d = (cpy+r)/m;
            r = cpy%m;
            sum+=d;
            cpy=cpy/m;
        }
        printf("%d\n",sum);
    }
    return 0;
}
