package part6;

import java.util.Scanner;

class code53{
 
   static int MaxSubArrProd(int arr[], int n) { 
      int ans = arr[0]; 
      for (int i = 0; i < n; i++) { 
      int prod = arr[i]; 
      for (int j = i + 1; j < n; j++){ 
         ans = Math.max(ans,prod); 
          prod =prod * arr[j]; 
         } 
        ans = Math.max(ans,prod); 
      } 
     return ans; 
 } 
   public static void main(String[] args)
         { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++) { 
          arr[i] = sc.nextInt(); 
            } 
         System.out.print(MaxSubArrProd(arr,n));
         
    } 
}