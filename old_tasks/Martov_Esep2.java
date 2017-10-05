package old_tasks;

import java.util.Scanner;


public class Esep2 {
    public static void main(String[] args)
    {
        double a[] = new double[10];
        Scanner sc = new Scanner(System.in);
       
        for(int i=0; i<10;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextDouble();
        }
        int j=0,k=0;
        double max;
        
        max=a[0];
        
        for(int i=1; i<10;i++)
            if(a[i]>max) { max=a[i]; j=i; }
        
        for (int i=0;i<10;i++)
            if(a[i]==max) k++;
        
        for(int i=0; i<10;i++)
            System.out.print("a="+a[i]+" ");
        
        System.out.println("\n massivtin en ulken elementi "+max+" zhane oni nomiri "+j);
        System.out.println("Max birdei sandar "+k);
        
    }
}
