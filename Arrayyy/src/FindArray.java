import java.util.Scanner;
public class FindArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []arr=new int[n];
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int find=input.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==find)
            {
               count++;
            }
        }
        if(count==0)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("Found: "+find+" For " +count+ " Times ");
        }

    }
}
