package old_tasks;

import java.util.Scanner;
public class Martov_Esep3 {
     public static void main(String[] args)
    {
        double x[] = new double[8];
        Scanner sc = new Scanner(System.in);
       
        for(int i=0; i<8;i++){
            System.out.print("x["+i+"]=");
            x[i]=sc.nextDouble();
        }
        int j=0;
        double max;
        
        for(int i=0; i<8;i++)
            if(x[i]<0) {  j=i; }
        
        
        for(int i=0; i<8;i++)
            System.out.print("a="+x[i]+" ");
        
        System.out.println("\n massivtin teris komponentinin nomiri "+j);
        
        
    }
}
