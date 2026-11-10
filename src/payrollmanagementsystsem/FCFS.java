/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payrollmanagementsystsem;
import java.util.*;
import java.lang.*;
/**
 *
 * @author srila
 */
public class FCFS {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value=");
        int n=sc.nextInt();
        int bt[]=new int[n];
        int at[]=new int[n];
        int pid[]=new int[n];
        int ct[]=new int[n];
        int tat[]=new int[n];
        int wt[]=new int[n];
        int temp;
        float avgwt = 0,avgtat=0;
        for(int i=0;i<n;i++){
            System.out.println("enter arrival time for "+i+" process=");
            at[i]=sc.nextInt();
            System.out.println("enter burst time for "+i+" process=");
            bt[i]=sc.nextInt();
            pid[i]=i;
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(at[i]>at[j]){
                    temp=pid[i];
                    pid[i]=pid[j];
                    pid[j]=temp;
                    
                    temp=at[i];
                    at[i]=at[j];
                    at[j]=temp;
                    
                    temp=bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i==0){
                ct[i]=at[i]+bt[i];
            }else{
                if(at[i]>ct[i-1]){
                    ct[i]=at[i]+bt[i];
                }else{
                    ct[i]=ct[i-1]+bt[i];
                }
            }
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
            avgwt+=wt[i];
            avgtat+=tat[i];
        }
        System.out.println("pid arrival burst complete turn waiting");
        for(int i=0;i<n;i++){
            System.out.println(pid[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
        }
        System.out.println("average waiting time="+(avgwt/n));
        System.out.println("average turn around time="+(avgtat/n));
        
    }
}
