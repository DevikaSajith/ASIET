#include <stdio.h>

void implementBestFit(int blockSize[], int blocks, int processSize[], int processes)
{
    int allocation[processes];
    
    for (int i = 0; i < processes; i++) {
        allocation[i] = -1;
    }
 
    for (int i = 0; i < processes; i++) {
        int indexPlaced = -1;
        for (int j = 0; j < blocks; j++) {
            if (blockSize[j] >= processSize[i] && allocation[j] == -1) {
                if (indexPlaced == -1) {
                    indexPlaced = j;
                } else if (blockSize[j] < blockSize[indexPlaced]) {
                    indexPlaced = j;
                }
            }
        }
 
        if (indexPlaced != -1) {
            allocation[i] = indexPlaced;
        }
    }

    printf("\nProcess No.\tProcess Size\tBlock No.\tBlock Size\n");
    for (int i = 0; i < processes; i++) {
        if (allocation[i] != -1) {
            printf("%d\t\t%d\t\t%d\t\t%d\n", i + 1, processSize[i], allocation[i] + 1, blockSize[allocation[i]]);
        } else {
            printf("%d\t\t%d\t\tNot Allocated\n", i + 1, processSize[i]);
        }
    }
}

int main() {
    int blockSize[] = {100, 500, 200, 300, 600};
    int blocks = sizeof(blockSize) / sizeof(blockSize[0]);
    
    int processSize[] = {212, 417, 112, 426};
    int processes = sizeof(processSize) / sizeof(processSize[0]);
    
    implementBestFit(blockSize, blocks, processSize, processes);
    
    return 0;
}

