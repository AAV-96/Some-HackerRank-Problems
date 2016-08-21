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
        int n, i, c=1; 
        scanf("%d",&n);
        for (i=1; i<=n;i++){
                if (i%2 == 0){
                        c++;
                } else {
                    c = c*2;
                }
        }
        printf("%d\n",c);
    }
    return 0;
}
