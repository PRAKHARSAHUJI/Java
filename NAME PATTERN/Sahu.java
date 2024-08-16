// public class Sahu {
    
// }

import java.util.*;
class Sahu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i <n;i++)
        {
 // ---------------------->  S
            
            for(int j =0 ;j <n;j++)
            {
                if( (i==0  && j!=0) || ( i==n-1 && j!=n-1) || ( i==n/2 && j!=0 && j!=n-1) || (j==0 && i>0 && i<n/2) || ( j==n-1 && i>n/2 && i<n-1))
                System.out.print("*"+" ");
                else
                System.out.print(" "+" ");
            }

            // ---------------------->  SPACE
 
            for(int k = 0 ; k<3;k++ )
            {
            System.out.print(" ");
            }            
            

            // ---------------------->  A

            for(int j =0 ;j <n;j++)
            {
                if((j==0 && i!=0) || (j==n-1 && i!=0) || (i==n/2) || (i==0 && j>0 &&j<n-1))
                System.out.print("*"+ " ");
                else
                System.out.print(" "+" ");
            }
             
            // ---------------------->  SPACE
 
            for(int k = 0 ; k<3;k++ )
            {
            System.out.print(" ");
            }       

            // ---------------------->  H
             
            for(int j =0 ;j <n;j++)
            {
                if((j==0)||j==n-1 || i==n/2)
                System.out.print("*"+ " ");
                else
                System.out.print(" "+" ");
            }
            // ---------------------->  SPACE
 
            for(int k = 0 ; k<3;k++ )
            {
            System.out.print(" ");
            }       


        


            System.out.println();



        }
    }
}