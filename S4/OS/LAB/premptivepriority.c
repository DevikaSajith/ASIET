#include<stdio.h>
int main()
{
int n,at[10],bt[10],temp[10],ct[10],priority[10],wt[10],i,j,time=0,count=0,tat[10],smallest;
float avg_tat,avg_wt,end=0;
printf("enter the number of process");
scanf("%d",&n);
printf("enter the values of arrival time,burst time and priority");
for(i=0;i<n;i++)
{
printf("enter the values for process%d:",i+1);
scanf("%d%d%d",&at[i],&bt[i],&priority[i]);
temp[i]=bt[i];
}
priority[9]=9876;
for(time=0;count!=n;time++)
{
smallest=9;
for(i=0;i<n;i++)
{
if(at[i]<=time&&priority[i]<priority[smallest]&&bt[i]>0)
{
smallest=i;
}
}
if(smallest!=9)
{
bt[smallest]--;
if(bt[smallest]==0)
{
count++;
end=time+1;
ct[smallest]=end;
tat[smallest]=end-at[smallest];
wt[smallest]=end-at[smallest]-temp[smallest];
}
}
}
printf("PID\tAT\tBT\tCT\tTAT\tWT\n");
for(i=0;i<n;i++)
{
printf("%d\t%d\t%d\t%d\t%d\t%d\n",i+1,at[i],temp[i],ct[i],tat[i],wt[i]);
avg_tat+=tat[i];
avg_wt+=wt[i];
}
printf("the average turn around time is:%f",avg_tat/n);
printf("the average waiting time is:%f",avg_wt/n);

    return 0;
}


