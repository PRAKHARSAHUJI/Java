// package Alphabet Patterns;

// public class O {
    
// }





import java.util.*;
class O {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i <n;i++)
        {
            for(int j =0 ;j <n;j++)
            {
                if(((i==0 || i==n-1) && (j!=0 && j!=n-1))||( (j==0 || j==n-1) && (i!=0 && i!=n-1) ) )
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



/*


 7
 ***** 
*     *
*     *
*     *
*     *
*     *
 ***** 
 
 
 */