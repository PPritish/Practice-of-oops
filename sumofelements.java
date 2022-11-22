import java.io.*;
import java.util.*;
class sumofelements
 {
  void sum(int a[],int n)
   {int sum=0;
    for(int i=0;i<n;i++)
     {
      sum=sum+a[i];
      }
     System.out.println("sum="+sum);
     }
    public static void main(String args[])
     {
      Scanner obj=new Scanner(System.in);
      sumofelements x=new sumofelements();
      int a[]=new int[20];
      System.out.println("enter the size of array[max:20]:");
      int n=obj.nextInt();
      System.out.println("enter the elements in array:");
      for (int i=0;i<n;i++)
       {
        a[i]=obj.nextInt();
        }
      x.sum(a,n);
      }
  }
   
