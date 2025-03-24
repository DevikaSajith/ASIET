#include <stdio.h>

int main() {
    int n, m, i, j, k, count = 0;
    printf("Enter number of processes and resources: ");
    scanf("%d %d", &n, &m);
    
    int alloc[n][m], max[n][m], need[n][m], avail[m], work[m], finish[n], safeSeq[n];
    
    printf("Enter allocation matrix: ");
    for(i = 0; i < n; i++)
        for(j = 0; j < m; j++)
            scanf("%d", &alloc[i][j]);
    
    printf("Enter max matrix: ");
    for(i = 0; i < n; i++)
        for(j = 0; j < m; j++)
            scanf("%d", &max[i][j]);
    
    printf("Enter available resources: ");
    for(i = 0; i < m; i++)
        scanf("%d", &avail[i]);
    
    for(i = 0; i < n; i++)
        for(j = 0; j < m; j++)
            need[i][j] = max[i][j] - alloc[i][j];
    
    for(i = 0; i < m; i++) work[i] = avail[i];
    for(i = 0; i < n; i++) finish[i] = 0;
    
    while(count < n) {
        int found = 0;
        for(i = 0; i < n; i++) {
            if (!finish[i]) {
                int canExecute = 1;
                for(j = 0; j < m; j++) {
                    if (need[i][j] > work[j]) {
                        canExecute = 0;
                        break;
                    }
                }
                if (canExecute) {
                    for(k = 0; k < m; k++)
                        work[k] += alloc[i][k];
                    safeSeq[count++] = i;
                    finish[i] = 1;
                    found = 1;
                }
            }
        }
        if (!found) {
            printf("System is in an unsafe state.\n");
            return 0;
        }
    }
    
    printf("Safe sequence: ");
    for(i = 0; i < n; i++)
        printf("P%d ", safeSeq[i]);
    printf("\n");
    
    return 0;
}


