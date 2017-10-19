package old_tasks;

import java.util.Random;
import java.util.Scanner;


public class Martov_Esep5 {
    public static void main(String args[]){
        int m,n;
        int A[][]=new int[100][100];
         
        Scanner sc = new Scanner(System.in);
        System.out.println("m->");
        m=sc.nextInt();
        System.out.println("n->");
        n=sc.nextInt();
        
        Random r = new Random();
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            A[i][j]=r.nextInt(10);
       
        for(int i=0;i<m;i++){
        for (int j=0;j<n;j++){
            System.out.print(A[i][j]+" ");    
           }
           System.out.println();
        }
        System.out.println("k->");
        int k=sc.nextInt();
        
        System.out.println("S->");
        int S=sc.nextInt();
        
        for (int i=0;i<m;i++)
            A[i][k]=A[i][k]*S;
            
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");    
            }
            System.out.println();
        }

    }
}
