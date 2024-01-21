package LEETCODE;

//User function Template for Java

import java.util.*;

public class KMP
{
    private int[]computeLPS(String pat){
        int m =pat.length();
        int []lps =new int[m];
        lps[0]=0;
        int j=0;
        j=1;
        int len =0;
        while(j<m){
            if(pat.charAt(j)==pat.charAt(len)){
                len++;
                lps[j]=len;
                j++;
            }
            else{
                if(len !=0){
                    len = lps[len-1];
                }
                else{
                    lps[j]=0;
                    j++;
                }
            }
        }
        return lps;
    }
     ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer>result = new ArrayList<>();
        int[]lps = computeLPS(pat);
        int n = txt.length();
        int m =pat.length();
        int i=0;
        int j=0;
        while(i<n){
            if(i<n && txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                result.add(i-j+1);
                j=lps[j-1];
            }
            else if( i<n &&txt.charAt(i)!=pat.charAt(j)|| j==0){
                if(j!=0){
                j=lps[j-1];
                }
                else{
                  i++;
                }
            }
        }
        return result;
    }
}
