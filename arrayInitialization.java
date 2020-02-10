import java.util.Arrays;
import java.util.Scanner;

public class arrayInitialization {
    public static void main(String[] args){

        int a[]=new int[5];

        Arrays.fill(a,5);

        for(int i=0;i<a.length;i++)
            System.out.println("Value of a[" + i +"]:"+ a[i]);
            //using loop
        int b[]=new int[5];
        for(int i=0;i<b.length;i++)
            b[i]=i+1;

        for(int i=0;i<b.length;i++)
            System.out.println("Value of b[" + i +"]:"+ b[i]);

            //taking user input

        int c[]=new int[5];
        System.out.println("enter the values:");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<c.length;i++)
            c[i]=sc.nextInt();

        for(int i=0;i<c.length;i++)
            System.out.println("Value of c[" + i +"]:"+ c[i]);
    }
}
