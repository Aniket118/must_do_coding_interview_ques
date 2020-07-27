package com.company.array;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Repeat_and_Missing_Number {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0;j<n;j++){
            int s= sc.nextInt();
            int ar[] = new int[s];
            for(int i=0;i<s;i++){
                ar[i] = sc.nextInt();
            }
            int chk[] = new int[s+1];
            for(int i: ar){
                chk[i]+=1;
            }
            for(int i=1;i<chk.length;i++){
                if(chk[i]==2)
                    System.out.print(i+" ");
            }
            for(int i=1;i<chk.length;i++){
                if(chk[i]==0)
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
