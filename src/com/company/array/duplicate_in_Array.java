package com.company.array;
// trivial solution in o(n)
    class Solution {
        public static ArrayList<Integer> duplicates(int arr[], int n) {
            //trivial method
            HashSet <Integer> h = new HashSet<Integer>();
            int [] ar= new int[arr.length];
            ArrayList<Integer> res = new ArrayList<Integer>();
            Arrays.fill(ar,-1);
            for(int i:arr){
                if(h.contains(i))
                    ar[i]=i;
                else
                    h.add(i);
            }
            for(int i:ar){
                if(i!=-1)
                    res.add(i);
            }
            if(res.size()==0){
                res.add(-1);
                return res;
            }
            else{
                return res;
            }
        }
    }

