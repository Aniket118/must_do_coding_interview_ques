package com.company.array;
import java.util.*;
import java.lang.*;
import java.io.*;
public class sort_an_array012 {

        //trivial solution
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
                int s= sc.nextInt();
                int ar[] = new int[s];
                for(int i =0;i<s;i++)
                    ar[i]=sc.nextInt();

                int arr[] = new int[3];
                for(int i : ar){
                    arr[i]+=1;
                }

                for(int i=0;i<=2;i++){
                    while(arr[i] > 0){
                        System.out.print(i+" ");
                        arr[i]=arr[i]-1;
                    }
                }
                System.out.println();
            }
        }
    }
    //optimised solution hint: can be done using 3 pointer


