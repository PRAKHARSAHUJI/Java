// package Alphabet Patterns;

// public class Q {
    
// }





import java.util.*;
class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i <n;i++)
        {
            for(int j =0 ;j <n;j++)
            {
                if((j==0 && i<=n/2 && i!=0 )||(i==0 && j<=n/2 && j!=0) ||  (j==n/2 + 1 && i<=n/2 && i!=0 ) || ( (i==j) && i>=n/2 ) || (i==n/2 + 1 && j<=n/2 && j!=0 ))
                System.out.print("*"+" ");
                else
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}




/*
 
13


  * * * * * *             
*             *           
*             *           
*             *           
*             *           
*             *           
*           * *           
* * * * * * * *           
                *         
                  *       
                    *     
                      *   

 */