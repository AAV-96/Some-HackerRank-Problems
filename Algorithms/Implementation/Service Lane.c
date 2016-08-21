#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    int t; 
    scanf("%d %d",&n,&t);
    int width[n];
    for(int width_i = 0; width_i < n; width_i++){
       scanf("%d",&width[width_i]);
    }
    for(int a0 = 0; a0 < t; a0++){
        int i; 
        int j; 
        scanf("%d %d",&i,&j);
        int b, min=99999;
        for (b=i; b<=j; b++){
            if (width[b]<min){
                min = width[b];
            }
        }
        printf("%d\n",min);
    }
    return 0;
}
